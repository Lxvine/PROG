import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		// Menú del programa:

		Scanner scan = new Scanner(System.in);

		char opcion = 'z';

		Agencia total = new Agencia();
		
		while (opcion != 'g') {
			System.out.println("\nBienvenido/a al programa de la agencia inmobiliaria " + total.getNombre() +". \nA continuación "
					+ "se presentan las diferentes opciones que la aplicación permite ejecutar:\n" 
					+ "\n A) Añade un piso a la venta o alquiler a la lista del archivo.\n"
					+ " B) Modificar un piso existente en la lista del archivo.\n"
					+ " C) Listar los pisos disponibles.\n" + " D) Listar los pisos de un rango de precios.\n"
					+ " E) Listar los pisos de un rango de metros.\n"
					+ " F) Eliminar un piso de la lista tras este ser alquilado o vendido.\n"
					+ " G) Finalizar la aplicación.\n");

			opcion = scan.next().toLowerCase().charAt(0);

			switch (opcion) {

			case 'a':
				total.añadePiso();
				break;

			case 'b':
				total.modificarPiso();
				break;
			case 'c':
				total.mostrarPisos();
				break;

			case 'd':
				System.out.println(
						"A continuación se ordenará la lista de pisos por el rango de precios: \nIntroduzca el precio menor: ");
				int a = scan.nextInt();
				int b = a;
				while (b <= a) {
					System.out.println("Introduzca el precio mayor: ");
					b = scan.nextInt();
				}

				total.rangoPrecios(b, a);
				break;

			case 'e':
				System.out.println("A continuación se ordenará la lista de pisos por el rango de metros: \nIntroduzca la cantidad menor de m2: ");
				a = scan.nextInt(); 
				b = a;
				while (b<=a) {
					System.out.println("Introduzca la cantidad mayor de m2: ");
					b = scan.nextInt();
				}
				
				total.rangoM2(b,a);
				break;
				
			case 'f':
				total.removePiso();
				break;
			case 'g':
				System.out.println("\nEl programa ha finalizado.");
				break;
			default:
				System.out.println("\nSeleccione una de las opciones correctas.\n");
			}
		}
	}
}
