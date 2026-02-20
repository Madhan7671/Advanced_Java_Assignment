package advance_java_junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import calculator.Calculator;

public class CalculatorTest {
	private Calculator calculator;
	@BeforeEach
	void setUp() {
		calculator=new Calculator();
	}
	@Test
	@DisplayName("Test the sum of two positive numbers")
	public void testTwoAndTwoGivesFour() {
		assertEquals(4,calculator.add(2, 2));
	}
	@Test
	public void testTwoAndThreeNotGivesFour()
	{
		assertNotEquals(4,calculator.add(2, 3));
	}
	@Test
	public void testtwoAndten()
	{
		assertEquals(10, calculator.add(10, 0));
	}
	
	//for multiple times to test we will use the 
	
	@RepeatedTest(3)
	@DisplayName("Test the sum of repeated times")
	void testRepeatedTimes()
	{
		assertEquals(100, calculator.add(90, 10));
	}
	
	@Nested
	@DisplayName("nested substraction test")
	class SubstractionTests{
		@DisplayName("Substraction test 1")
		@Test
		void testSubtraction1()
		{
			assertEquals(100,calculator.sub(1000, 900));
		}
		
		@DisplayName("Subtraction test 2")
		@Test
		void testSubtraction2()
		{
			assertEquals(1,calculator.sub(11, 10));
		}
	}
	
	//instead of giving the value by one by one we will give this all once so it will reduce the space in the code
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5})
	@DisplayName("Test multiplication of two numbers")
	void testMultiplication(int number)
	{
		assertEquals(number*2,calculator.multiply(number, 2));
	}
	
	
	//we can also give the data in the comma separted also using this we can test the data
	
	@ParameterizedTest()
	@CsvSource({"2,2,4","2,3,6","4,4,16"})
	@DisplayName("Test multiplication of two numbers")
	void testMultiply(int x,int y,int expected)
	{
		assertEquals(expected,calculator.multiply(x,y));
	}
	
}
