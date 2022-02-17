import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


import java.util.Scanner;

class testAgencia {

	static Scanner scan;
	
	private static Agencia testAgencia;
	
	@BeforeAll
	static void scanner() {
		scan = new Scanner(System.in);
	}
	
	@BeforeEach
	void generarAgencia() {
		testAgencia = new Agencia("Agencia Gucci");
	}
	
	@Test
	void testGenerarPisos() {
		int actual = testAgencia.getPisos().size();
		int expected = 10;
		assertEquals(expected, actual);
	}
	
	@Disabled
	@Test 
	void testGenerarPisosFail() {
		int actual = testAgencia.getPisos().size();
		int expected = 11;
		assertEquals(expected, actual);
	}
	
	@Disabled
	@Test
	void testAñadePiso() {
		testAgencia.añadePiso();
		int actual = testAgencia.getPisos().size();
		int expected = 12;
		assertEquals(expected, actual);
	}
	
	
	
	

}
