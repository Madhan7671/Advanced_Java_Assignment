package mockitoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import calculator2.Calculator;
import calculator2.mathService;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
	@Mock
	mathService mathservice;
	@InjectMocks
	Calculator calculator;
	
	@Test
	void testAdd() {
		//Arrange
		when(mathservice.add(10,20)).thenReturn(30);
		
		//Assert
		assertEquals(30,calculator.add(10, 20));
		
		//Verify interaction
		verify(mathservice).add(10, 20);
		
	}
}
