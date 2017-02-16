package aritmetica.test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.*;
import static org.hamcrest.core.IsNot.*;
import static org.hamcrest.core.IsNull.*;

import org.hamcrest.core.IsNot;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import aritmetica.Aritmetica;

public class AritmeticaTest {
	private static Aritmetica aritmetica;
	
	@BeforeClass
	public static void init() {
		aritmetica = new Aritmetica();
	}
	
	@AfterClass
	public static void finish() {
		aritmetica = null;
	}

	@Test
	public void testSuma() {
//		Aritmetica aritmetica = new Aritmetica();
		assertThat(aritmetica, notNullValue());
		assertThat(aritmetica.suma(2, 3), is(5.0f));
//		assertEquals(2, aritmetica.suma(1, 1), 0);
	}

	@Test
	public void testResta() {
//		Aritmetica aritmetica = new Aritmetica();
		assertEquals(3, aritmetica.resta(4, 1), 0);
	}

	@Test
	public void testMultiplicacion() {
//		Aritmetica aritmetica = new Aritmetica();
		assertEquals(6, aritmetica.multiplicacion(2, 3), 0);
	}

	@Test
	public void testDivision() {
//		Aritmetica aritmetica = new Aritmetica();
		assertEquals(5, aritmetica.division(10, 2), 0);
	}

}
