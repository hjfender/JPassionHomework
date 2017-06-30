package com.jpassion.mvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.jpassion.mvc.interceptors.MyInterceptor;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class MainApplication {

	/*
	 * Automatic redirect handlers
	 */
	@Bean
	WebMvcConfigurerAdapter mvcViewConfigurer(){
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry){
				registry.addRedirectViewController("/", "/index.html");
				registry.addViewController("/tomorrow").setViewName("tomorrow");
			}
			
			@Override
			public void addInterceptors(InterceptorRegistry registry){
				registry.addInterceptor(new MyInterceptor());
			}
		};
	}
	
	/*
	 * Configure ContentNegotiatingViewResolver
	 */
	@Bean
	public ViewResolver contentNegotiatingViewResolver(
			ContentNegotiationManager manager) {
		
		ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();
		resolver.setContentNegotiationManager(manager);

		// Define all possible view resolvers
		List<ViewResolver> resolvers = new ArrayList<ViewResolver>();

		resolvers.add(jspViewResolver());
		resolvers.add(jsonViewResolver());

		resolver.setViewResolvers(resolvers);
		return resolver;
	}
	
	/*
	 * Default jspViewResolver
	 */
	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	
	/*
	 * Configure View resolver to provide JSON output using JACKSON library to
	 * convert object in JSON format.
	 */
	@Bean
	public ViewResolver jsonViewResolver() {
		return new ViewResolver(){
			@Override
			public View resolveViewName(String viewName, Locale locale) throws Exception {
				MappingJackson2JsonView view = new MappingJackson2JsonView();
		        view.setPrettyPrint(true);       
		        return view;
		      }
		};
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
