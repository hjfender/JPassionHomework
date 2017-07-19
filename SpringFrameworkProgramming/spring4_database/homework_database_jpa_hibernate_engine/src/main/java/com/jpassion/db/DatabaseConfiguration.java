package com.jpassion.db;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.instrument.classloading.InstrumentationLoadTimeWeaver;
import org.springframework.jdbc.datasource.init.DatabasePopulator;
import org.springframework.jdbc.datasource.init.DatabasePopulatorUtils;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.jpassion.db.repository.AccountRepository;
import com.jpassion.db.repository.JpaAccountRepository;

@Configuration
@PropertySource({ "classpath:jdbc.properties", "classpath:jpa.properties" })
public class DatabaseConfiguration {

	@Autowired
	private Environment env;

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBeanory = new LocalContainerEntityManagerFactoryBean();

		// Set data source
		localContainerEntityManagerFactoryBeanory.setDataSource(getBasicDataSource());

		// Use Hibernate as JPA engine
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setGenerateDdl(Boolean.TRUE);
		vendorAdapter.setShowSql(Boolean.TRUE);
		localContainerEntityManagerFactoryBeanory.setJpaVendorAdapter(vendorAdapter);

		// Find entity classes - no need to have persistence.xml
		localContainerEntityManagerFactoryBeanory.setPackagesToScan("com.jpassion.db.domain");

		// Create jpaProperties
		Properties jpaProperties = new Properties();
		jpaProperties
				.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
		jpaProperties.put("hibernate.generate_statistics",
				env.getProperty("hibernate.generate_statistics"));
		jpaProperties.put("hibernate.show_sql",
				env.getProperty("hibernate.show_sql"));
		jpaProperties.put("hibernate.format_sql",
				env.getProperty("hibernate.format_sql"));
		jpaProperties.put("hibernate.use_sql_comments",
				env.getProperty("hibernate.use_sql_comments"));
		localContainerEntityManagerFactoryBeanory.setJpaProperties(jpaProperties);

		localContainerEntityManagerFactoryBeanory.afterPropertiesSet();
		localContainerEntityManagerFactoryBeanory.setLoadTimeWeaver(new InstrumentationLoadTimeWeaver());
		return localContainerEntityManagerFactoryBeanory;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		EntityManagerFactory factory = entityManagerFactory().getObject();
		return new JpaTransactionManager(factory);
	}

	@Bean
	public BasicDataSource getBasicDataSource() {
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		basicDataSource.setUrl(env.getProperty("jdbc.url"));
		basicDataSource.setUsername(env.getProperty("jdbc.username"));
		basicDataSource.setPassword(env.getProperty("jdbc.password"));
		
		DatabasePopulatorUtils.execute(createDatabasePopulator(), basicDataSource);
		
		return basicDataSource;
	}

	private DatabasePopulator createDatabasePopulator() {
		ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
		databasePopulator.setContinueOnError(true);
		databasePopulator.addScript(new ClassPathResource(env.getProperty("jdbc.initLocation")));
		databasePopulator.addScript(new ClassPathResource(env.getProperty("jdbc.dataLocation")));
		return databasePopulator;
	}

	@Bean(name = "accountRepository")
	public AccountRepository getJpaAccountRepository() {
		return new JpaAccountRepository();
	}
}
