import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
		Ejercicio2();
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

	// Ejercicio 1. Crea un fichero de texto con el nombre y contenido que tu
	// quieras. Ahora crea una
	// aplicación que lea este fichero de texto carácter a carácter y muestre su
	// contenido por pantalla sin
	// espacios. Por ejemplo, si un fichero tiene el siguiente texto “Esto es una
	// prueba”, deberá mostrar
	// “Estoesunaprueba”. Captura las excepciones que veas necesario.

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
}
