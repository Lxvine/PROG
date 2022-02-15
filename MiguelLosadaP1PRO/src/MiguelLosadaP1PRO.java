import java.util.Scanner;

public class MiguelLosadaP1PRO {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char opcion = 'z';

		while (opcion != 'c') {
			System.out.println(

					"Bienvenido/a. \nEste programa permite ejecutar tres opciones: \nA) El programa pedirá un número al usuario, "
							+ "y le responderá si es o no, un número perfecto. \nEntendiendo este como aquel para el cual la suma de sus divisores "
							+ "enteros positivos (excepto el mismo) coincide con el mismo número. \nB) El programa leerá números enteros positivos y "
							+ "dirá si el recibido es mayor, menor o igual que el anterior, la entrada de datos \nfinaliza cuando se introduzca el número 0.\n"
							+ "C) Finaliza el programa.\n"
							+ "\nSeleccione la opción (A/B/C):");

			opcion = scan.next().toLowerCase().charAt(0);

			switch (opcion) {

			case 'a':
				int n;
				double sum = 0;
				System.out.println("Introduzca un número: ");
				n = scan.nextInt();

				while (n < 0) {
					System.out.println("Introduzca un número positivo: ");
					n = scan.nextInt();
				}

				for (int i = n - 1; i > 0; i--) {
					if (n % i == 0) {
						sum += i;
					}
				}
				if (sum == n && sum != 0) {
					System.out.println("El número " + n + " es un número perfecto.\n");
				} else {
					System.out.println("El número " + n + " no es un número perfecto.\n");
				}
				break;

			case 'b':
				int n1, n2;
				System.out.println("Introduzca un valor: ");
				n1 = scan.nextInt();
				n2 = n1;
				while (n1 < 0) {

					System.out.println("Introduzca un valor positivo: ");
					n1 = scan.nextInt();
				}

				if (n1 == 0) {
					System.out.println("Fin del programa.\n");

				}

				while (n2 != 0) {
					System.out.println("Introduzca un nuevo número: ");
					n2 = scan.nextInt();

					while (n2 < 0) {
						System.out.println("Introduzca un valor positivo: ");
						n2 = scan.nextInt();
					
					} if (n2 == 0) {
						System.out.println("Fin del programa.\n");
						
					} else if (n2 < n1) {
						System.out.println("El segundo número introducido (" +n2+ ") es menor que el anterior (" +n1+ ").");
						n1 = n2;

					} else if (n2 > n1) {
						System.out.println("El segundo número introducido (" +n2+ ") es mayor que el anterior (" +n1+ ").");
						n1 = n2;

					} else if (n2 == n1) {
						System.out.println("El segundo número introducido (" +n2+ ") es igual al anterior (" +n1+ ").");

					}

				}

				break;

			case 'c':
				System.out.println("Programa finalizado.");
				break;
			default:
				System.out.println("Seleccione una de las 3 opciones posibles (A), B), C)): ");
			}
		}
	}
}
