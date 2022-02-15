import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Agencia {

	private String nombre;

	// Atributos clase Agencia:

	private ArrayList<Piso> pisos = new ArrayList<>();

	// Constructor/es clase Agencia:

	public Agencia(String nombre) {
		this.nombre = nombre;
	}

	public Agencia() {
		this.nombre = "Real Club Celta de Vigo";
		this.pisos = generarPisos();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	// ArrayList de los estados posibles del piso:

	public ArrayList<Estado> Venta = new ArrayList<>();
	public ArrayList<Estado> Alquiler = new ArrayList<>();
	public ArrayList<Estado> AlquilerYVenta = new ArrayList<>();

	// Método para generar los 10 pisos por defecto:

	public ArrayList<Piso> generarPisos() {
		ArrayList<Piso> pisuco = new ArrayList<>();

		Venta.add(Estado.VENTA);
		Alquiler.add(Estado.ALQUILER);
		AlquilerYVenta.add(Estado.VENTA);
		AlquilerYVenta.add(Estado.ALQUILER);

		pisuco.add(
				new Piso(new Direccion("Calle de Sanjurjo Badía", 11, 3, "B", 36201, "Vigo"), 1, 43, 367.80, Alquiler));
		pisuco.add(new Piso(new Direccion("Plaza de la estrella", 25, 1, "C", 36202, "Vigo"), 2, 52, 320.00, Alquiler));
		pisuco.add(new Piso(new Direccion("Calle de Urzáiz", 16, 5, "D", 36201, "Vigo"), 3, 81, 490.10, Alquiler));
		pisuco.add(
				new Piso(new Direccion("Calle Álvaro Cunqueiro", 5, 3, "C", 36204, "Vigo"), 4, 79, 210400.00, Venta));
		pisuco.add(
				new Piso(new Direccion("Calle Alexandre Bóveda", 1, 6, "A", 36203, "Vigo"), 5, 132, 370300.33, Venta));
		pisuco.add(new Piso(new Direccion("Plaza del rey", 12, 3, "B", 36202, "Vigo"), 6, 103, 400.20, Alquiler));
		pisuco.add(new Piso(new Direccion("Calle Alcalde Gregorio Espino", 11, 1, "D", 36202, "Vigo"), 7, 128,
				301200.70, Venta));
		pisuco.add(new Piso(new Direccion("Calle Luis Taboada", 15, 2, "C", 36201, "Vigo"), 8, 97, 240000.20,
				AlquilerYVenta));
		pisuco.add(new Piso(new Direccion("Plaza de la Princesa", 7, 1, "A", 36202, "Vigo"), 9, 66, 389.10, Alquiler));
		pisuco.add(new Piso(new Direccion("Calle Areal", 18, 7, "B", 36201, "Vigo"), 10, 44, 157800.90, Venta));

		return pisuco;
	}

	// (Apartado A). Método para añadir un piso:

	public void añadePiso() {

		Scanner scan = new Scanner(System.in);

		Piso piso = new Piso(null, 0, 0, 0, Alquiler);

		System.out.println(
				"\nA continuación se va a añadir un nuevo piso al archivo.\nSe pedirán los datos de la dirección del piso:");

		pedirDireccion(piso);

		System.out.println(
				"Introduzca un 1 si el piso está en alquiler, 2 si está a la venta o 3 si está en ambos estados: ");
		int x = scan.nextInt();

		while (x < 1 || x > 3) {
			System.out.println(
					"Tiene que ser un valor entre 1 y 3.\nIntroduzca un 1 si el piso está en alquiler, 2 si está a "
							+ "la venta o 3 si está en ambos estados: ");
			x = scan.nextInt();
		}

		if (x == 1) {
			piso.setEstado(Alquiler);
		} else if (x == 2) {
			piso.setEstado(Venta);
		} else if (x == 3) {
			piso.setEstado(AlquilerYVenta);
		}

		System.out.println("Introduzca los metros cuadrados: ");
		piso.setM2(scan.nextInt());

		System.out.println("Introduzca el precio del piso: ");

		piso.setPrecio(scan.nextDouble());
		piso.setId(pisos.size() + 1);

		this.pisos.add(piso);

	}

	// Método para pedir la dirección por pasos (Complemento apartado A y B):

	public void pedirDireccion(Piso piso) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca la calle: ");
		String calle = scan.nextLine();
		System.out.println("Introduzca el número del edificio: ");
		int num = scan.nextInt();
		System.out.println("Introduzca el número del piso: ");
		int floor = scan.nextInt();
		System.out.println("Introduzca la letra del piso: ");
		String letra = scan.next();
		System.out.println("Introduzca el código postal: ");
		int cp = scan.nextInt();
		System.out.println("Introduzca la ciudad: ");
		String ciudad = scan.next();

		piso.setDireccion(new Direccion(calle, num, floor, letra, cp, ciudad));

	}

	// (Apartado B). Método para modificar un piso:

	public void modificarPiso() {
		Scanner scan = new Scanner(System.in);

		int id;

		System.out.println("\nIntroduzca el ID del piso a modificar: ");

		id = scan.nextInt();

		while (id > this.pisos.size() || id < 0) {
			System.out.println("El ID introducido no pertenece a ningún piso, inténtelo de nuevo: ");
			id = scan.nextInt();
		}

		char opcion = 'z';

		while (opcion != 'e') {
			System.out.println("\nLas opciones a modificar son las siguientes:\n"
					+ " 1) Introduzca una 'A' si desea modificar la dirección.\n"
					+ " 2) Introduzca una 'B' si desea modificar el precio.\n"
					+ " 3) Introduzca una 'C' si desea modificar los metros cuadrados.\n"
					+ " 4) Introduzca una 'D' si desea cambiar el estado del piso.\n"
					+ " 5) Introduzca una 'E' si no desea modificar ningún atributo.\n");

			opcion = scan.next().toLowerCase().charAt(0);

			switch (opcion) {

			case 'a':
				System.out.println("\nIntroduzca la nueva dirección: ");
				pedirDireccion(pisos.get(id - 1));
				break;
			case 'b':
				System.out.println("\nIntroduzca el nuevo precio: ");
				pisos.get(id - 1).setPrecio(scan.nextDouble());
				break;
			case 'c':
				System.out.println("\nIntroduzca los metros cuadrados: ");
				pisos.get(id - 1).setM2(scan.nextInt());
				break;
			case 'd':
				System.out.println("\nIntroduzca el nuevo estado del Piso.\n\"Introduzca "
						+ "un 1 si el piso está en alquiler, 2 si está a la venta o 3 si está en ambos estados: ");
				int x = scan.nextInt();
				while (x < 1 || x > 3) {
					System.out.println(
							"\nTiene que ser un valor entre 1 y 3.\nIntroduzca un 1 si el piso está en alquiler, "
									+ "2 si está a la venta o 3 si está en ambos estados: ");
					x = scan.nextInt();
				}
				if (x == 1) {
					pisos.get(id - 1).setEstado(Alquiler);
				} else if (x == 2) {
					pisos.get(id - 1).setEstado(Venta);
				} else if (x == 3) {
					pisos.get(id - 1).setEstado(AlquilerYVenta);
				}
				break;
			case 'e':
				System.out.println("\nNo se desea modificar ningún atributo más.");
				break;
			default:
				System.out.println("\nSeleccione una de las opciones posibles.");
			}
			System.out.println(pisos.get(id - 1).toString());
		}
	}

	// (Apartado C). Método para mostrar por pantalla los pisos:

	public void mostrarPisos() {
		System.out.println("\nLos pisos en la base de datos de la agencia actualmente son los siguientes: ");

		for (int i = 0; i < this.pisos.size(); i++) {
			System.out.println(this.pisos.get(i).toString());
		}
	}

	// (Apartado D). Método para mostrar los pisos por un rango de precios:

	public void rangoPrecios(int precioMayor, int precioMenor) {

		for (int i = 0; i < pisos.size(); i++) {
			double precio = pisos.get(i).getPrecio();
			if ((precio >= precioMenor) && (precio <= precioMayor)) {
				System.out.println(pisos.get(i).toString());
			}
		}
	}

	// (Apartado E). Método para mostrar los pisos por un rango de m2:

	public void rangoM2(int m2Mayor, int m2Menor) {
		for (int i = 0; i < pisos.size(); i++) {
			double m2 = pisos.get(i).getM2();
			if ((m2 >= m2Menor) && (m2 <= m2Mayor)) {
				System.out.println(pisos.get(i).toString());
			}
		}
	}

	// (Apartado F). Método para eliminar un piso del programa:

	public void removePiso() {
		Scanner scan = new Scanner(System.in);

		int id;
		mostrarPisos();
		System.out.println("\nIntroduzca el ID del piso a eliminar: ");

		id = scan.nextInt();
		System.out.println("¿Esta seguro que desea eliminar el siguiente piso? (S/N):");
		System.out.println(pisos.get(id - 1));
		String respuesta = scan.next();
		if (respuesta.equalsIgnoreCase("S")) {
			pisos.remove(id - 1);
			for (int i = id; i <= pisos.size(); i++) {
				pisos.get(i - 1).setId(i);
			}
			System.out.println("EL ID DE LOS PISOS HA CAMBIADO.\n");
			System.out.println("Piso eliminado correctamente.");
		} else {
			System.out.println("Eliminacion de piso cancelada.");
		}
	}
}
