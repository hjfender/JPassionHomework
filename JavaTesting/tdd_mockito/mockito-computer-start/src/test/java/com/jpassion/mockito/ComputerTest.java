package com.jpassion.mockito;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.jpassion.mockito.domain.Adder;
import com.jpassion.mockito.domain.Computer;
import com.jpassion.mockito.domain.Subtractor;

//@RunWith(MockitoJUnitRunner.class) //There can be no More than one @RunWith annotation
@RunWith(Parameterized.class)
public class ComputerTest {

	@Mock
	private Adder adder;
	
	@Mock
	private Subtractor subtractor;
	
	@InjectMocks
	private Computer computer;
	
	@Before
	public void setUp() throws Exception {
		//Run with mockito annotations - we can't do it with an annotation
		MockitoAnnotations.initMocks(this);
	}
	
	//Test parameters
	private int normalOutput;
	private int result;
	private int x, y;
	
	public ComputerTest(int normalOutput, int result, int x, int y) {
		this.normalOutput = normalOutput;
		this.result = result;
		this.x = x;
		this.y = y;
	}
	
	@Parameters
	public static Collection<Object[]> testData(){
		return Arrays.asList(new Object[][] {
			{1,1,-2,4},
			{6,36,5,-5},
			{100,10000,-1,-10}
		});
	}

	//For exception testing
	@Rule
	public ExpectedException e = ExpectedException.none();
	
	@Test
	public void testComputeSquareAfterAddition() throws Exception {
		when(adder.add(anyInt(),anyInt())).thenReturn(normalOutput);
		assertThat(computer.computeSquareAfterAddition(anyInt(), anyInt()), equalTo(result));
		verify(adder, times(2)).add(anyInt(),anyInt());
	}
	
	@Test
	public void testComputeSquareAfterSubtraction() throws Exception {
		when(subtractor.subtract(anyInt(),anyInt())).thenReturn(normalOutput);
		assertThat(computer.computeSquareAfterSubtraction(anyInt(), anyInt()), equalTo(result));
		verify(subtractor, times(2)).subtract(anyInt(),anyInt());
	}
	
	@Test
	public void testComputeSquareAfterAdditionWithNegativeNumber() throws Exception {
		e.expect(RuntimeException.class);
		e.expectMessage("negative number not allowed: " + x + " " + y);
		computer.computeSquareAfterAddition(x, y);
	}
	
	@Test
	public void testComputeSquareAfterSubtractionWithNegativeNumber() throws Exception {
		e.expect(RuntimeException.class);
		e.expectMessage("negative number not allowed: " + x + " " + y);
		computer.computeSquareAfterSubtraction(x, y);
	}
}
