import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
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
		System.out.println(
				"Este test del método GenerarImmuebles(); da correcto ya que actual crea 10 inmuebles por defecto y el expected es 10.");
		int actual = testAgencia.getInmueble().size();
		int expected = 10;
		assertEquals(expected, actual);
	}

	@Tag("Generar")

	@Disabled
	@Test
	void testGenerarPisosFail() {
		System.out.println(
				"Este test del método generarInmueble(); da error debido a que: \nactual = 10 (Los 10 inmuebles por defecto) y expected = 11.\n");
		int actual = testAgencia.getInmueble().size();
		int expected = 11;
		assertEquals(expected, actual);
	}

	
	@Tag("AñadirInmueble")
	
	@Disabled
	@Test
	void testAddInmueble() {
		System.out.println("Crea un inmueble nuevo, por tanto el test da correcto ya que el expected es 11 y el size del array de inmuebles es 10 + el piso que se acaba de crear.");
		testAgencia.añadeInmueble();
		int actual = testAgencia.getInmueble().size();
		int expected = 11;
		assertEquals(expected, actual);
	}
	
@Tag("Eliminarinmueble")
	
	@Test
	void testDeleteInmueble() {
		System.out.println("Elimina un inmueble de los 10 iniciales, por tanto el expected es 9 y el actual es 10 - 1 que es el que se acaba de eliminar.");
		testAgencia.removeInmueble();
		int actual = testAgencia.getInmueble().size();
		int expected = 9;
		assertNotEquals(expected, actual);
	}
}
