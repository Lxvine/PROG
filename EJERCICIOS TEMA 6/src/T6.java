import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.io.PrintWriter;

public class T6 {

	public static void main(String[] args) throws IOException {
//		crearDirectorio();
//		Ejercicio1();
//		Ejercicio2();
//		Ejercicio3();
		Ejercicio7();
	}

	// Ejercicio resuelto: Crear un directorio “Prueba1” en el escritorio del
	// usuario actual de Windows empleando rutas
	// absolutas:

	public static void crearDirectorio() {
		String ruta = "F:\\Prueba1";
		File directorio = new File(ruta);
		boolean creado = false;

		if (directorio.exists()) {
			System.out.println("El directorio " + ruta + " ya existe!");
		} else {
			// Crea un directorio.
			creado = directorio.mkdir();
		}
		if (creado) {
			System.out.println("El directorio " + ruta + " se ha creado satisfactoriamente");
		} else {
			System.out.println("El directorio no se ha creado.");
		}
	}

	// Ejercicio 1.

	// Crea un fichero de texto con el nombre y contenido que tu quieras. Ahora crea
	// una aplicación que lea este fichero de
	// texto carácter a carácter y muestre su contenido por pantalla sin espacios.
	// Por ejemplo, si un fichero tiene el
	// siguiente texto “Esto es una prueba”, deberá mostrar “Estoesunaprueba”.
	// Captura las excepciones que veas necesario.

	public static void Ejercicio1() throws IOException {

//		try {
//
//			// Contenido Archivo:
//
//			String content = "Esto es un archivo pana";
//
//			// Ruta:
//
//			String ruta1 = "F:\\Prueba1\\PruebaEjercicio1.txt";
//
//			// Creación archivo
//			
//			File directorio1 = new File(ruta1);
//
//			if (directorio1.createNewFile()) {
//				System.out.println("Se ha creado el objeto");
//			} else {
//				System.out.println("El fichero ya existe");
//			}
//
//			// Lo que tiene que hacer la aplicación:
//			
//			if (directorio1.exists()) {
//
//				System.out.println(content.replaceAll("\\s", ""));
//			}
//
//		} catch (IOException e) {
//			System.out.println("No se ha encontrado el archivo: " + e.getMessage());
//		}

		try {
			FileWriter fw = new FileWriter("D:\\fichero1.txt");
			FileReader fr = new FileReader("D:\\fichero1.txt");
			fw.write("Esto es una prueba");

			int valor = fr.read();

			while (valor != -1) {
				if ((char) valor != ' ') {

					System.out.print((char) valor);
				}
				valor = fr.read();
			}

			fw.close();

		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo: " + e.getMessage());
		}

	}

	// Ejercicio 2.

	// Crea una aplicación donde pidamos la ruta de un fichero por teclado y un
	// texto que queramos a escribir en el fichero.
	// Deberás mostrar por pantalla el mismo texto pero variando entre mayúsculas y
	// minúsculas, es decir, si escribo “Bienvenido”
	// deberá devolver “bIENVENIDO”. Si se escribe cualquier otro carácter, se
	// quedará tal y como se escribió. Deberás crear
	// un método para escribir en el fichero el texto introducido y otro para
	// mostrar el contenido en mayúsculas.

	// IMPORTANTE: cuando pidas por teclado una ruta con JOptionPane, no es
	// necesario que insertes
	// caracteres de escape.

	public static void Ejercicio2() {
		String ruta = JOptionPane.showInputDialog("Introduce la ruta del fichero: ");
		String texto = JOptionPane.showInputDialog("Introduce el texto que quieras escribir en el fichero: ");
		escribirFichero(ruta, texto);
		mostrarFicheroMay(ruta);
	}

	public static void escribirFichero(String nomFich, String texto) {
		try (FileWriter fw = new FileWriter(nomFich)) {
			fw.write(texto);
		} catch (IOException e) {
			System.out.println("Problemas en la escritura E/S " + e);
		}
	}

	public static void mostrarFicheroMay(String nomFich) {
		try (FileReader fr = new FileReader(nomFich)) {
			int valor = fr.read();
			while (valor != -1) {
				char caracter = (char) valor;
				if (caracter >= 97 && caracter <= 122) {
					caracter -= 32;
				} else if (caracter >= 65 && caracter <= 90) {
					caracter += 32;
				}
				System.out.print(caracter);
				valor = fr.read();
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("Problema con la E/S " + e);
		}
	}

	// Ejercicio 3.

	// Realizar un programa en Java donde se introduzca la ruta de un fichero por
	// teclado y un texto a escribir en el
	// fichero con JOptionPane.showInputDialog. Posteriormente, muestra el contenido
	// del fichero.

	public static void Ejercicio3() {

		// EJ3 Opcion básica:

//			String route = JOptionPane.showInputDialog("Introduzca la ruta del archivo: ");
//			try (FileWriter fw = new FileWriter(route)) {
//				String text = JOptionPane.showInputDialog("Introduzca el texto a escribir en el archivo: ");
//				fw.write(text);
//				fw.close();
//				System.out.println(text);
//			} catch (IOException e) {
//				System.out.println("El archivo no se ha creado.\n" + e.getMessage() + ".");
//			}

		// EJ3 Opción más completa:

		String route = JOptionPane.showInputDialog("Introduzca la ruta del archivo: ");
		String text = JOptionPane.showInputDialog("Introduzca el texto a escribir en el archivo: ");
		escribirFichero(route, text);
		showText(route);

	}

	public static void showText(String route) {
		System.out.println("* La ruta es: \n(" + route + ").");
		try (FileReader fr = new FileReader(route)) {
			int caracter = fr.read();
			System.out.println("* El texto del archivo es: ");
			while (caracter != -1) {
				System.out.print((char) caracter);
				caracter = fr.read();
			}
			System.out.println(".");
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error en la Lectura/Escritura del texto.\n" + e + ".");
		}
	}

// Ejercicio 7. Crear una aplicación que almacene los datos básicos de un vehículo como la
// matricula(String), marca (String), tamaño de depósito (double) y modelo (String) en ese orden y
// de uno en uno usando la clase DataInputStream.
// Los datos anteriores datos se pedirán por teclado y se irán añadiendo al fichero (no se
// sobrescriben los datos) cada vez que ejecutemos la aplicación.
// El fichero siempre será el mismo, en todos los casos.
// Mostrar todos los datos de cada coche en un cuadro de diálogo, es decir, si tenemos 3 vehículos
// mostrará 3 cuadros de diálogo con sus respectivos datos. 

	public static void Ejercicio7() {
		
		try {
			
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\ej7.ddr"));
			
			FileOutputStream fos =new FileOutputStream("C:\\uwu.ddr");
					
		
			
			fos.close();
			
		} catch (IOException e) {
			System.out.println("Error E/S");
		}
	}
}
