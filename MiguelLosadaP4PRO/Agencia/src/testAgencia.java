import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


import java.util.Scanner;

class testAgencia {

	static Scanner scan;
	
	private static Agencia testAgencia;
	private static Direccion testDireccion;
	
	@BeforeAll
	static void scanner() {
		scan = new Scanner(System.in);
	}
	
	@BeforeEach
	void generarAgencia() {
		testAgencia = new Agencia("Agencia Gucci");
	}
	
	@Tag("Generar")
	
	@Disabled
	@Test
	
	void testGenerarPisos() {
		System.out.println("Este test del método GenerarPisos(); da correcto ya que actual crea 10 pisos por defecto y el expected es 10.");
		int actual = testAgencia.getPisos().size();
		int expected = 10;
		assertEquals(expected, actual);
	}
	
	@Tag("Generar")
	
	@Disabled
	@Test 
	void testGenerarPisosFail() {
		System.out.println("Este test del método generarPisos(); da error debido a que: \nactual = 10 (Los 10 pisos por defecto) y expected = 11.\n");
		int actual = testAgencia.getPisos().size();
		int expected = 11;
		assertEquals(expected, actual);
	}
	
	@Tag("Añadir")
	
	@Disabled
	@Test

	void testAñadePiso() {
		System.out.println("Este test del método añadePiso(); que da resultado correcto debido a que añade el piso que el método crea a los 10 pisos por defecto. \nPor tanto actual = 11 y expected = 11. \nSe debe crear el piso correctamente para añadirlo:");
		testAgencia.añadePiso();
		int actual = testAgencia.getPisos().size();
		int expected = 11;
		assertEquals(expected, actual);
	}
	
	@Tag("Añadir")
	
	@Disabled
	@Test
	
	void testAñadePisoError() {
		testAgencia.añadePiso();
		int actual = testAgencia.getPisos().size();
		int expected = 13;
		assertEquals(expected, actual);
	}
		
	@Tag("Modificar")
	
	@Disabled
	@Test
		
	void testModificarPiso() {
		System.out.println("Test del método modificarPiso(); que da correcto al no ser igual la dirección actual a la expected. \n\nModificaremos el piso con el ID: 1"
				+ "\nLa dirección original es Calle de Sanjurjo Badía, 11, 3º, B, 36201, Vigo. \nLa modificaremos por: celta, 0, 0, Z, 12345, A.");
		testDireccion = testAgencia.getPisos().get(0).getDireccion();
		testAgencia.modificarPiso();
		Direccion expected = testAgencia.getPisos().get(0).getDireccion();
		assertNotEquals(testDireccion, expected);
	}

	@Tag("Modificar")
	
	@Disabled	
	@Test
	
	void testModificarPisoFail() {
		System.out.println("Test del método modificarPiso(); que da error al no ser igual el actual a la expected que cambiamos.");
		testDireccion = testAgencia.getPisos().get(0).getDireccion();
		System.out.println(testDireccion);
		testAgencia.modificarPiso();
		Direccion expected = testAgencia.getPisos().get(0).getDireccion();
		assertEquals(testDireccion, expected);
	}
	
	@Tag("Modificar")
	
	@Disabled
	@Test
	void testModificarM2() {
		System.out.println("El test consiste en introducir el ID: 1 y a continuación la opción F. Esto resultará en un test correcto, ya que los 43 m2 del piso 1 \nson los mismos 43 que le introduzco en el propio test.");
		testAgencia.modificarPiso();
		double actual = testAgencia.getPisos().get(0).getM2();
		System.out.println("\n" + actual + " m2.");
		double expected = 43;
		assertEquals(actual, expected);
	}	
	
	@Tag("Modificar")
	
	@Disabled
	@Test
	void testModificarM2_2() {
		System.out.println("El test consiste en introducir el ID: 1 y a continuación la opción D para modificar los m2, introduciremos cualquier número menos el 43. \nEsto resultará en un test correcto, ya que los m2 que le introducimos son diferentes a los 43 que tiene el test introducidos.");
		testAgencia.modificarPiso();
		double actual = testAgencia.getPisos().get(0).getM2();
		System.out.println("\n" + actual + " m2.");
		double expected = 43;
		assertNotEquals(actual, expected);
	}	
	
@Tag("Modificar")
	
//	@Disabled
	@Test
	void testModificarPrecioVenta() {
		System.out.println("El test consiste en introducir el ID: 7. \nA continuación opción B para modificar el precio de la venta, si introducimos 367.8 dara resultado correcto, si introducimos cualquier otra cantidad dará error.\nY finalizamos con la opción F).");
		testAgencia.modificarPiso();
		double actual = testAgencia.getPisos().get(0).getPrecioVenta();
		System.out.println("\n" + actual + " €.");
		double expected = 301200.7;
		assertEquals(actual, expected);
	}	
	
	@Tag("Modificar")
	
	@Disabled
	@Test
	void testModificarPrecioAlquiler() {
		System.out.println("El test consiste en introducir el ID: 1. \nA continuación opción C para modificar el precio del alquiler, si introducimos 367.8 dara resultado correcto, si introducimos cualquier otra cantidad dará error.\nY finalizamos con la opción F).");
		testAgencia.modificarPiso();
		double actual = testAgencia.getPisos().get(0).getPrecioAlquiler();
		System.out.println("\n" + actual + " €.");
		double expected = 367.8;
		assertEquals(actual, expected);
	}
		
		
	}

