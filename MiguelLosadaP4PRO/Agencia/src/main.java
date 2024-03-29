import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {

		// Men� del programa:

		Scanner scan = new Scanner(System.in);

		char opcion = 'z';

		Agencia total = new Agencia();
		
		while (opcion != 'g') {
			System.out.println("\nBienvenido/a al programa de la agencia inmobiliaria " + total.getNombre() +". \nA continuaci�n "
					+ "se presentan las diferentes opciones que la aplicaci�n permite ejecutar:\n" 
					+ "\n A) A�ade un piso a la venta o alquiler a la lista del archivo.\n"
					+ " B) Modificar un piso existente en la lista del archivo.\n"
					+ " C) Listar los pisos disponibles.\n" + " D) Listar los pisos de un rango de precios.\n"
					+ " E) Listar los pisos de un rango de metros.\n"
					+ " F) Eliminar un piso de la lista tras este ser alquilado o vendido.\n"
					+ " G) Finalizar la aplicaci�n.\n");

			opcion = scan.nextLine().toLowerCase().toLowerCase().charAt(0);

			switch (opcion) {

			case 'a':
				total.a�adePiso();
				break;

			case 'b':
				total.modificarPiso();
				break;
			case 'c':
				total.mostrarPisos();
				break;

			case 'd':
				char x = 'c';
				while (x == 'c') {
				System.out.println("A continuaci�n se ordenar� la lista de pisos por el rango de precios.\n");
				System.out.println("Introduzca una 'A' si desea ordenar la lista por los precios de "
						+ "venta o una 'B' si desea ordenarlos por su precio de alquiler: ");
	
				x = scan.nextLine().charAt(0);
				}
				
				if (x == 'a') {
					System.out.println(
							"\nSe procede a mostrar los pisos por su rango de precios de venta.\nIntroduzca el precio menor: ");
					int a = Integer.parseInt(scan.nextLine());
					int b = a;
					while (a < 0) {
						System.out.println("El precio debe ser positivo.\nIntroduzca de nuevo el precio menor: ");
						a = Integer.parseInt(scan.nextLine());
					}
					while (b <= a) {
						System.out.println("\nIntroduzca el precio mayor: ");
						b = Integer.parseInt(scan.nextLine());
						while (b < 0) {
							System.out.println("El precio debe ser positivo.\nIntroduzca de nuevo el precio mayor: ");
							b = Integer.parseInt(scan.nextLine());
						}
					}

					total.rangoPreciosVenta(b, a);
					break;
				} else if(x == 'b') {
					System.out.println(
							"\nSe procede a mostrar los pisos por su rango de precios de alquiler.\nIntroduzca el precio menor: ");
					int a = Integer.parseInt(scan.nextLine());
					int b = a;
					while (a < 0) {
						System.out.println("El precio debe ser positivo.\nIntroduzca de nuevo el precio menor: ");
						a = Integer.parseInt(scan.nextLine());
					}
					while (b <= a) {
						System.out.println("Introduzca el precio mayor: ");
						b = Integer.parseInt(scan.nextLine());
						while (b < 0) {
							System.out.println("El precio debe ser positivo.\nIntroduzca de nuevo el precio mayor: ");
							b = Integer.parseInt(scan.nextLine());
						}
					}
					
					total.rangoPreciosAlquiler(b, a);
					break;
				} if (x != 'a' || x != 'b' || x != 'c') {
					break;
				}

			case 'e':
				System.out.println("A continuaci�n se ordenar� la lista de pisos por el rango de metros: \nIntroduzca la cantidad menor de m2: ");
				int a = Integer.parseInt(scan.nextLine());
				int b = a;
				while (a < 0) {
					System.out.println("La cantidad de m2 debe ser positiva.\nIntroduzca de nuevo la cantidad menor de m2: ");
					a = Integer.parseInt(scan.nextLine());
				}
				while (b <= a) {
					System.out.println("Introduzca la cantidad mayor de m2: ");
					b = Integer.parseInt(scan.nextLine());
					while (b < 0) {
						System.out.println("La cantidad de m2 debe ser positiva.\nIntroduzca de nuevo la cantidad mayor de m2: ");
						b = Integer.parseInt(scan.nextLine());
					}
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
