import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestEjersT2 {

	@Disabled
	@Test
	void test1() {
		int a = EjerciciosTema2.x;
		int b = EjerciciosTema2.y;
		EjerciciosTema2.Ejercicio1();
		assertEquals (a, EjerciciosTema2.y);
		assertEquals (b, EjerciciosTema2.x);
	}

	@Disabled
	@Test
	void test2() {
		int expected = EjerciciosTema2.Ejercicio2(14, 13, 7);
		int actual = 14;
		assertEquals (expected, actual);
	}
	
	@Disabled
	@Test
	void test3() {
		double expected = EjerciciosTema2.Ejercicio3(5);
		double actual = Math.E;
		System.out.println(expected + "\n" + actual);
		assertEquals (expected, actual, 0.01);
	}
	
	@Disabled
	@Test
	void test4() {
		int actual = 5;
		int expected = EjerciciosTema2.contadorChar('a', "aaaaa.aa");
		assertEquals (expected, actual);		
	}
	
	@Disabled
	@Test
	void test5() {
		String actual = "0051";
		String expected = EjerciciosTema2.Ejercicio5(1500);
		assertEquals (expected, actual);
	}
	
	@Disabled
	@Test
	void test6() {
		int actualA = 284;
		int actualB = 220;
		int expectedB = EjerciciosTema2.sumDivisores(actualA);
		assertEquals(actualB,expectedB);
	}
	
	@Disabled
	@Test
	void test7() {
		int actual = 28;
		int expected = EjerciciosTema2.sumDivisores(actual);
		assertEquals(actual, expected);
	}

	@Disabled
	@Test
	void test8() {
		String actualNombre = "paco";
		String actualContrasenha = "paco1";
		boolean expected = EjerciciosTema2.login(actualNombre, actualContrasenha);
		assertTrue(expected);
	}

	@Disabled
	@Test
	void test9() {
		int x1 = 3;
		int x2 = 2;
		char op =  '*';
		
		int actual = 6;
		
		double expected = EjerciciosTema2.operacionCamaron(x1, x2, op);
		assertEquals(actual, expected);
	}
	
	@Test
	void test10() {
		int x = 3;
		int y = 5;
		String uwu = "CUADRADO";
		
		int actualArea = 9;
		int actualPerimetro = 12;
		
		double expectedArea = EjerciciosTema2.area(x, y, uwu);
		double expectedPerimetro = EjerciciosTema2.perimetro(x, y, uwu);
		
		assertEquals(actualArea, expectedArea);
		assertEquals(actualPerimetro, expectedPerimetro);
	}
}
