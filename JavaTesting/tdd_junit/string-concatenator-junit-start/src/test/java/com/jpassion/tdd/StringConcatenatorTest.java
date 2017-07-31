package com.jpassion.tdd;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringConcatenatorTest {
	
	private StringConcatenator concatenator;
	private String str1;
	private String str2;
	private String result;
	
	public StringConcatenatorTest(String str1, String str2, String result) {
		this.str1 = str1;
		this.str2 = str2;
		this.result = result;
	}

	@Before
	public void setUp(){
		concatenator = new StringConcatenator();
	}
	
	@Parameters
	public static Collection<Object[]> testData(){
		return Arrays.asList(new Object[][] {
			{"Sang", "Shin","SangShin"},
			{"Foo","Bar","FooBar"},
			{"Java","Duke","JavaDuke"}
		});
	}
	
	@Test
	public void concatenateTest() throws Exception{
		assertThat(concatenator.concatenate(str1, str2), equalTo(result));
	}
	
	@Test(expected = StringTooShortException.class)
	public void testThrowsException() throws Exception {
		concatenator.concatenate("", "Exception");
	}

}
