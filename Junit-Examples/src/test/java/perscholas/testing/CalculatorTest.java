package perscholas.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
	
	Calculator c = new Calculator();
	
	@ParameterizedTest
	@CsvSource({
		"5, 5, 10",
		"10, 10, 20",
		"5.5, 5.5, 11.0"
	})
	public void parametrizedAdditionTest(double a, double b, double answer) {
		Calculator c = new Calculator();
		
		double actual = c.add(a, b);
		
		Assertions.assertEquals(answer, actual);
	}
	
	@ParameterizedTest
	@CsvSource({
		"5, 5, 10.5",
		"10, 10, 20.3",
		"5.5, 5.5, 11.6"
	})
	public void parametrizedErrorAdditionTest(double a, double b, double answer) {
		Calculator c = new Calculator();
		
		double actual = c.add(a, b);
		
		Assertions.assertNotEquals(answer, actual);
	}
	
	@Test
	public void additionTest() {
		Calculator c = new Calculator();
		
		double expected = 10.0;
		double actual = c.add(5.0, 5.0);
		
		Assertions.assertEquals(expected, actual);
		Assertions.assertEquals(15.0, c.add(7.5, 7.5));
	}
	
	@Test
	public void subtraction() {
		double expected = 5.0;
		double actual = c.subtract(15.0, 10.0);
		
		Assertions.assertEquals(expected, actual);
		Assertions.assertEquals(6.0, c.subtract(12.0, 6.0));
	}
	
	@Test
	public void multiplication() {
		double expected = 25.0;
		double actual = c.multiply(5.0, 5.0);

		Assertions.assertEquals(expected, actual);
		Assertions.assertEquals(18.0, c.multiply(3.0, 6.0));
	}
	
	@Test
	public void divisition() {
		double expected = 3;
		double actual = c.divid(18.0, 6.0);
		
		Assertions.assertEquals(expected, actual);
		Assertions.assertEquals(5.0, c.divid(35.0, 7.0));
	}

}
