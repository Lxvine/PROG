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

	// Ejercicio resuelto: Crear un directorio �Prueba1� en el escritorio del
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
	// una aplicaci�n que lea este fichero de
	// texto car�cter a car�cter y muestre su contenido por pantalla sin espacios.
	// Por ejemplo, si un fichero tiene el
	// siguiente texto �Esto es una prueba�, deber� mostrar �Estoesunaprueba�.
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
//			// Creaci�n archivo
//			
//			File directorio1 = new File(ruta1);
//
//			if (directorio1.createNewFile()) {
//				System.out.println("Se ha creado el objeto");
//			} else {
//				System.out.println("El fichero ya existe");
//			}
//
//			// Lo que tiene que hacer la aplicaci�n:
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

	// Crea una aplicaci�n donde pidamos la ruta de un fichero por teclado y un
	// texto que queramos a escribir en el fichero.
	// Deber�s mostrar por pantalla el mismo texto pero variando entre may�sculas y
	// min�sculas, es decir, si escribo �Bienvenido�
	// deber� devolver �bIENVENIDO�. Si se escribe cualquier otro car�cter, se
	// quedar� tal y como se escribi�. Deber�s crear
	// un m�todo para escribir en el fichero el texto introducido y otro para
	// mostrar el contenido en may�sculas.

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

		// EJ3 Opcion b�sica:

//			String route = JOptionPane.showInputDialog("Introduzca la ruta del archivo: ");
//			try (FileWriter fw = new FileWriter(route)) {
//				String text = JOptionPane.showInputDialog("Introduzca el texto a escribir en el archivo: ");
//				fw.write(text);
//				fw.close();
//				System.out.println(text);
//			} catch (IOException e) {
//				System.out.println("El archivo no se ha creado.\n" + e.getMessage() + ".");
//			}

		// EJ3 Opci�n m�s completa:

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

// Ejercicio 7. Crear una aplicaci�n que almacene los datos b�sicos de un veh�culo como la
// matricula(String), marca (String), tama�o de dep�sito (double) y modelo (String) en ese orden y
// de uno en uno usando la clase DataInputStream.
// Los datos anteriores datos se pedir�n por teclado y se ir�n a�adiendo al fichero (no se
// sobrescriben los datos) cada vez que ejecutemos la aplicaci�n.
// El fichero siempre ser� el mismo, en todos los casos.
// Mostrar todos los datos de cada coche en un cuadro de di�logo, es decir, si tenemos 3 veh�culos
// mostrar� 3 cuadros de di�logo con sus respectivos datos. 

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
