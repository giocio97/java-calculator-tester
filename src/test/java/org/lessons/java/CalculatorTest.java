package org.lessons.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lessons.java.Calculator;

public class CalculatorTest {

	static Calculator c;

	@BeforeAll
	static void seUp() {
		c = new Calculator();
	}

	@Test
	@DisplayName("Somma")
	public void testAdd() {
		float result = c.add(4, 4);
		assertEquals(8, result, "la somma deve essere 8");
	}

	@Test
	@DisplayName("Sottrazione")
	public void testSubtract() {
		float result = c.subtract(5, 4);
		assertEquals(1, result, "la differenza deve essere 1");
	}

	@Test
	@DisplayName("Moltiplicazione")
	public void testmultiply() {
		float result = c.multiply(2, 4);
		assertEquals(8, result, "il prodotto deve essere 8");
	}

	@Test
	@DisplayName("Somma")
	public void testDivide() {
		float result = c.divide(4, 4);
		assertEquals(1, result, "il quoziente deve essere 1");
	}

}
