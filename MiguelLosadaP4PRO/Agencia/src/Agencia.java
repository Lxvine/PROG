import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {

	Scanner scan = new Scanner(System.in);

	// Atributos clase Agencia:

	private ArrayList<Piso> pisos = new ArrayList<>();
	private String nombre;

	// ArrayList de los estados posibles del piso:

	public ArrayList<Estado> Venta = new ArrayList<>();
	public ArrayList<Estado> Alquiler = new ArrayList<>();
	public ArrayList<Estado> AlquilerYVenta = new ArrayList<>();

	// Constructor/es clase Agencia:

	public Agencia(String nombre) {
		this.nombre = nombre;
		this.pisos = generarPisos();
	}

	public Agencia() {
		this.nombre = "Real Club Celta de Vigo";
		this.pisos = generarPisos();
	}

	// Getters clase Agencia:

	public String getNombre() {
		return this.nombre;
	}
	
	public ArrayList<Piso> getPisos(){
		return this.pisos;
	}

	// Setters clase Agencia:

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPisos(ArrayList<Piso> pisos) {
		this.pisos = pisos;
	}

	// Método para generar los 10 pisos por defecto:

	public ArrayList<Piso> generarPisos() {
		ArrayList<Piso> pisuco = new ArrayList<>();

		Venta.add(Estado.VENTA);
		Alquiler.add(Estado.ALQUILER);
		AlquilerYVenta.add(Estado.VENTA);
		AlquilerYVenta.add(Estado.ALQUILER);

		pisuco.add(new Piso(new Direccion("Calle de Sanjurjo Badía", 11, 3, 'B', 36201, "Vigo"), 1, 43, 0.0, 367.80,
				Alquiler));
		pisuco.add(new Piso(new Direccion("Plaza de la estrella", 25, 1, 'C', 36202, "Vigo"), 2, 52, 0.0, 320.00,
				Alquiler));
		pisuco.add(new Piso(new Direccion("Calle de Urzáiz", 16, 5, 'D', 36201, "Vigo"), 3, 81, 0.0, 490.10, Alquiler));
		pisuco.add(new Piso(new Direccion("Calle Álvaro Cunqueiro", 5, 3, 'C', 36204, "Vigo"), 4, 79, 210400.00, 0.0,
				Venta));
		pisuco.add(new Piso(new Direccion("Calle Alexandre Bóveda", 1, 6, 'A', 36203, "Vigo"), 5, 132, 370300.33, 0.0,
				Venta));
		pisuco.add(new Piso(new Direccion("Plaza del rey", 12, 3, 'B', 36202, "Vigo"), 6, 103, 0.0, 400.20, Alquiler));
		pisuco.add(new Piso(new Direccion("Calle Alcalde Gregorio Espino", 11, 1, 'D', 36202, "Vigo"), 7, 128,
				301200.70, 0.0, Venta));
		pisuco.add(new Piso(new Direccion("Calle Luis Taboada", 15, 2, 'C', 36201, "Vigo"), 8, 97, 240000.20, 356.12,
				AlquilerYVenta));
		pisuco.add(new Piso(new Direccion("Plaza de la Princesa", 7, 1, 'A', 36202, "Vigo"), 9, 66, 0.0, 389.10,
				Alquiler));
		pisuco.add(new Piso(new Direccion("Calle Areal", 18, 7, 'B', 36201, "Vigo"), 10, 44, 157800.90, 0.0, Venta));

		return pisuco;
	}

	// (Apartado A). Método para añadir un piso:

	public void añadePiso() {

		Piso piso = new Piso(null, 0, 0, 0, 0, Alquiler);

		System.out.println(
				"\nA continuación se va a añadir un nuevo piso al archivo.\nSe pedirán los datos de la dirección del piso:");

		pedirDireccion(piso);

		System.out.println(
				"Introduzca un 1 si el piso está en alquiler, 2 si está a la venta o 3 si está en ambos estados: ");
		int x = Integer.parseInt(scan.nextLine());

		while (x < 1 || x > 3) {
			System.out.println(
					"Tiene que ser un valor entre 1 y 3.\nIntroduzca un 1 si el piso está en alquiler, 2 si está a "
							+ "la venta o 3 si está en ambos estados: ");
			x = Integer.parseInt(scan.nextLine());
		}

		if (x == 1) {
			piso.setEstado(Alquiler);
		} else if (x == 2) {
			piso.setEstado(Venta);
		} else if (x == 3) {
			piso.setEstado(AlquilerYVenta);
		}

		System.out.println("Introduzca los metros cuadrados: ");
		int m2 = Integer.parseInt(scan.nextLine());

		while (m2 < 0) {
			System.out.println("La cantidad de m2 debe ser positiva: ");
			m2 = Integer.parseInt(scan.nextLine());
		}

		piso.setM2(m2);

		if (x == 1) {
			System.out.println("Introduzca el precio de alquiler del piso: ");
			double alquiler = Double.parseDouble(scan.nextLine());
			piso.setPrecioAlquiler(alquiler);
			while (alquiler < 0) {
				System.out.println(
						"El precio del alquiler debe ser tener un valor positivo. Introduzca nuevamente el precio del alquiler del piso: ");
				alquiler = Double.parseDouble(scan.nextLine());
				piso.setPrecioAlquiler(alquiler);
			}
		} else if (x == 2) {
			System.out.println("Introduzca el precio de venta del piso: ");
			double venta = Double.parseDouble(scan.nextLine());
			piso.setPrecioVenta(venta);
			while (venta < 0) {
				System.out.println(
						"El precio de venta del piso debe ser tener un valor positivo. Introduzca nuevamente el precio de venta del piso: ");
				venta = Double.parseDouble(scan.nextLine());
				piso.setPrecioVenta(venta);
			}
		} else if (x == 3) {
			System.out.println("Introduzca el precio de alquiler del piso: ");
			double alquiler = Double.parseDouble(scan.nextLine());
			piso.setPrecioAlquiler(alquiler);
			while (alquiler < 0) {
				System.out.println(
						"El precio del alquiler debe ser tener un valor positivo. Introduzca nuevamente el precio del alquiler del piso: ");
				alquiler = Double.parseDouble(scan.nextLine());
				piso.setPrecioAlquiler(alquiler);
			}
			System.out.println("Introduzca el precio de venta del piso: ");
			double venta = Double.parseDouble(scan.nextLine());
			piso.setPrecioVenta(venta);
			while (venta < 0) {
				System.out.println(
						"El precio de venta del piso debe ser tener un valor positivo. Introduzca nuevamente el precio de venta del piso: ");
				venta = Double.parseDouble(scan.nextLine());
				piso.setPrecioVenta(venta);
			}

		}

		piso.setId(pisos.size() + 1);

		this.pisos.add(piso);

	}

	// Método para pedir la dirección por pasos (Complemento apartado A y B):

	public void pedirDireccion(Piso piso) {

		System.out.println("Introduzca la calle: ");
		String calle = scan.nextLine();
		System.out.println("Introduzca el número del edificio: ");
		int num = Integer.parseInt(scan.nextLine());
		while (num < 0) {
			System.out
					.println("El número del edificio debe ser positivo. Introduzca de nuevo el número del edificio: ");
			num = Integer.parseInt(scan.nextLine());
		}

		System.out.println("Introduzca el número del piso: ");
		int floor = Integer.parseInt(scan.nextLine());
		while (floor < 0) {
			System.out.println("El número del piso debe ser positivo. Introduzca nuevamente el número del piso: ");
			floor = Integer.parseInt(scan.nextLine());
		}

		System.out.println("Introduzca la letra del piso: ");
		char letra = scan.nextLine().charAt(0);
		System.out.println("Introduzca el código postal: ");
		int cp = Integer.parseInt(scan.nextLine());
		while (cp < 0) {
			System.out.println("El CP debe ser positivo. Introduzca de nuevo el código postal: ");
			cp = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Introduzca la ciudad: ");
		String ciudad = scan.nextLine();

		piso.setDireccion(new Direccion(calle, num, floor, letra, cp, ciudad));

	}

	// (Apartado B). Método para modificar un piso:

	public void modificarPiso() {

		int id;

		System.out.println("\nIntroduzca el ID del piso a modificar: ");

		id = Integer.parseInt(scan.nextLine());

		while (id > this.pisos.size() || id < 0) {
			System.out.println("El ID introducido no pertenece a ningún piso, inténtelo de nuevo: ");
			id = Integer.parseInt(scan.nextLine());
		}
		
		System.out.println(pisos.get(id - 1).toString());

		char opcion = 'z';

		while (opcion != 'f') {
			System.out.println("\nLas opciones a modificar son las siguientes:\n"
					+ " 1) Introduzca una 'A' si desea modificar la dirección.\n"
					+ " 2) Introduzca una 'B' si desea modificar el precio de Venta del piso.\n"
					+ " 3) Introduzca una 'C' si desea modificar el precio de Alquiler del piso.\n"
					+ " 4) Introduzca una 'D' si desea modificar los metros cuadrados.\n"
					+ " 5) Introduzca una 'E' si desea cambiar el estado del piso.\n"
					+ " 6) Introduzca una 'F' si no desea modificar ningún atributo.\n");

			opcion = scan.nextLine().toLowerCase().charAt(0);

			switch (opcion) {

			case 'a':
				System.out.println("\nA continuación se introducirá la nueva dirección. ");
				pedirDireccion(pisos.get(id - 1));
				break;
			case 'b':
				System.out.println("\nIntroduzca el nuevo precio de venta del piso: ");
				double precioVenta = Double.parseDouble(scan.nextLine());
				while (precioVenta < 0.0) {
					System.out.println("\nEl nuevo precio de venta del piso debe ser positivo: ");
					precioVenta = Double.parseDouble(scan.nextLine());
				}
				pisos.get(id - 1).setPrecioVenta(precioVenta);
				break;
			case 'c':
				System.out.println("\nIntroduzca el nuevo precio de alquiler del piso: ");
				double precioAlquiler = Double.parseDouble(scan.nextLine());
				while (precioAlquiler < 0.0) {
					System.out.println("\nEl nuevo precio de alquiler del piso debe ser positivo: ");
					precioAlquiler = Double.parseDouble(scan.nextLine());
				}
				pisos.get(id - 1).setPrecioAlquiler(precioAlquiler);
				break;
			case 'd':
				System.out.println("\nIntroduzca los metros cuadrados: ");
				int m2 = Integer.parseInt(scan.nextLine());
				while (m2 < 0) {
					System.out.println("\nLos metros cuadrados deben ser una cantidad positiva: ");
					m2 = Integer.parseInt(scan.nextLine());
				}
				pisos.get(id - 1).setM2(m2);
				break;
			case 'e':
				System.out.println("\nIntroduzca el nuevo estado del Piso.\n\"Introduzca "
						+ "un 1 si el piso está en alquiler, 2 si está a la venta o 3 si está en ambos estados: ");
				int x = Integer.parseInt(scan.nextLine());
				while (x < 1 || x > 3) {
					System.out.println(
							"\nTiene que ser un valor entre 1 y 3.\nIntroduzca un 1 si el piso está en alquiler, "
									+ "2 si está a la venta o 3 si está en ambos estados: ");
					x = Integer.parseInt(scan.nextLine());
				}
				if (x == 1) {
					pisos.get(id - 1).setEstado(Alquiler);
				} else if (x == 2) {
					pisos.get(id - 1).setEstado(Venta);
				} else if (x == 3) {
					pisos.get(id - 1).setEstado(AlquilerYVenta);
				}
				break;
			case 'f':
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

	// (Apartado D). Métodos para mostrar los pisos por un rango de precios:

	public void rangoPreciosVenta(int precioMayor, int precioMenor) {
		int x = 0;
		for (int i = 0; i < pisos.size(); i++) {
			double precio = pisos.get(i).getPrecioVenta();
			if ((precio >= precioMenor) && (precio <= precioMayor)) {
				System.out.println(pisos.get(i).toString());
			}
		}
		if (x == 0) {
			System.out.println("No existe ningún piso en alquiler en ese rango de precios.");
		}
	}

	public void rangoPreciosAlquiler(int precioMayor, int precioMenor) {
		int x = 0;
		for (int i = 0; i < pisos.size(); i++) {
			double precio = pisos.get(i).getPrecioAlquiler();
			if ((precio >= precioMenor) && (precio <= precioMayor)) {
				System.out.println(pisos.get(i).toString());
			}
		}
		if (x == 0) {
			System.out.println("No existe ningún piso en alquiler en ese rango de precios.");
		}
	}

	// (Apartado E). Método para mostrar los pisos por un rango de m2:

	public void rangoM2(int m2Mayor, int m2Menor) {
		int x = 0;
		for (int i = 0; i < pisos.size(); i++) {
			double m2 = pisos.get(i).getM2();
			if ((m2 >= m2Menor) && (m2 <= m2Mayor)) {
				System.out.println(pisos.get(i).toString());
				x += 1;
			}
		}
		if (x == 0) {
			System.out.println("No existe ningún piso en ese rango de M2.");
		}
	}

	// (Apartado F). Método para eliminar un piso del programa:

	public void removePiso() {

		int id;
		mostrarPisos();
		System.out.println("\nIntroduzca el ID del piso a eliminar: ");

		id = Integer.parseInt(scan.nextLine());

		while (id > this.pisos.size() || id < 0) {
			System.out.println("El ID introducido no pertenece a ningún piso, inténtelo de nuevo: ");
			id = Integer.parseInt(scan.nextLine());
		}

		System.out.println("¿Esta seguro que desea eliminar el siguiente piso? (S/N):");
		System.out.println(pisos.get(id - 1));
		String respuesta = scan.nextLine();
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
