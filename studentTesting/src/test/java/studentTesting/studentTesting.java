package studentTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class studentTesting {
	private StudentService studentservice;
	@BeforeEach
	void setUp() {
		studentservice=new StudentService();
	}
	
	@Test
	@DisplayName("weather the total is equal to the given value")
	void testTotalScore()
	{
		Student student=new Student("madhan",123,60,80,100);
		assertEquals(240,studentservice.calculateTotal(student));
	}
	
	@Test
	@DisplayName("Testing the average")
	void testAverageScore()
	{
		Student student=new Student("Madhan",124,100,100,40);
		assertEquals(80.0, studentservice.calculateAverage(student));
	}
	
	@Test
	@DisplayName("Testing the student is passed or not")
	void testStudentIsPass()
	{
		Student student=new Student("Madhan",127,10,100,100);
		assertTrue(studentservice.studentPass(student));
	}
	
	@Test
	@DisplayName("Testing the student is fail or not")
	void testStudentFail()
	{
		Student student=new Student("Madhan",125,20,35,35);
		assertFalse(studentservice.studentPass(student));
	}
	
}
