import java.util.ArrayList;
import java.util.Scanner;

public class Agencia {

	Scanner scan = new Scanner(System.in);

	// Atributos clase Agencia:

	private ArrayList<Inmueble> inmueble = new ArrayList<>();
	private String nombre;

	// ArrayList de los estados posibles del piso:

	public ArrayList<Estado> Venta = new ArrayList<>();
	public ArrayList<Estado> Alquiler = new ArrayList<>();
	public ArrayList<Estado> AlquilerYVenta = new ArrayList<>();

	// Constructor/es clase Agencia:

	public Agencia(String nombre) {
		this.nombre = nombre;
		this.inmueble = generarInmuebles();
	}

	public Agencia() {
		this.nombre = "Real Club Celta de Vigo";
		this.inmueble = generarInmuebles();
	}

	// Getters clase Agencia:

	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<Inmueble> getInmueble() {
		return this.inmueble;
	}

	// Setters clase Agencia:

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setInmuebles(ArrayList<Inmueble> inmueble) {
		this.inmueble = inmueble;
	}

	// Método para generar los 10 pisos por defecto:

	public ArrayList<Inmueble> generarInmuebles() {
		ArrayList<Inmueble> pisuco = new ArrayList<>();

		Venta.add(Estado.VENTA);
		Alquiler.add(Estado.ALQUILER);
		AlquilerYVenta.add(Estado.VENTA);
		AlquilerYVenta.add(Estado.ALQUILER);

		pisuco.add(new Casa(new Direccion(TipoDeVia.AVENIDA, "Sanjurjo Badía", 11, 36789), 1, 3, 89.82, 0.0, 345.90,
				Alquiler, true, false, true));
		pisuco.add(new Casa(new Direccion(TipoDeVia.CALLE, "La Estrella", 25, 36202), 2, 2, 100.20, 0.0, 246.87,
				Alquiler, false, false, true));
		pisuco.add(new Casa(new Direccion(TipoDeVia.CARRETERA, "Urzáiz", 16, 36201), 3, 4, 245.11, 4901432, 154.21,
				AlquilerYVenta, true, true, true));
		pisuco.add(new Casa(new Direccion(TipoDeVia.PLAZA, "Álvaro Cunqueiro", 5, 36204), 4, 5, 210.40, 1245600, 0.0,
				Venta, false, true, true));
		pisuco.add(new Casa(new Direccion(TipoDeVia.CAMINO, "Alexandre Bóveda", 1, 36203), 5, 4, 132.12, 4143245,
				312.10, AlquilerYVenta, true, false, false));
		pisuco.add(new Piso(new Direccion(TipoDeVia.PASEO, "Rey", 12, 36202), 6, 1, 103, 0.0, 400.20, Alquiler, false,
				2, 'A', false));
		pisuco.add(new Piso(new Direccion(TipoDeVia.CALLE, "Alcalde Gregorio Espino", 11, 36202), 7, 6, 128, 301200.70,
				0.0, Venta, false, 4, 'C', true));
		pisuco.add(new Piso(new Direccion(TipoDeVia.CARRETERA, "Luis Taboada", 15, 36201), 8, 4, 97, 240000.20, 356.12,
				AlquilerYVenta, false, 3, 'B', false));
		pisuco.add(new Piso(new Direccion(TipoDeVia.PASEO, "La Princesa", 7, 36202), 9, 3, 66, 0.0, 389.10, Alquiler,
				true, 2, 'B', true));
		pisuco.add(new Piso(new Direccion(TipoDeVia.AVENIDA, "Areal", 18, 36201), 10, 5, 44, 157800.90, 0.0, Venta,
				false, 5, 'C', false));

		return pisuco;
	}

	// (Apartado A). Método para añadir un piso:

	public void añadeInmueble() {

		Piso piso = new Piso();
		Casa casa = new Casa();

		// Elección del tipo de inmueble

		System.out.println("Introduzca 'piso' o 'casa' dependiendo de lo que quiera añadir: ");
		String z = scan.next().toLowerCase();

		while (!z.equals("piso") && !z.equals("casa")) {
			System.out.println("Las opciones válidas son 'piso' o 'casa': ");
			z = scan.next().toLowerCase();
		}

		// PISO

		if (z.equals("piso")) {
			System.out.println(
					"\nA continuación se va a añadir un nuevo piso al archivo.\n\nSe pedirán los datos de la DIRECCIÓN del piso.");

			pedirDireccion(piso);

			// Pide el estado del piso

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

			// Número de habitaciones del PISO

			System.out.println("Introduzca el número de habitaciones del piso: ");
			int numHab = Integer.parseInt(scan.nextLine());
			while (numHab < 1) {
				System.out.println("El piso debe tener al menos una habitación: ");
				numHab = Integer.parseInt(scan.nextLine());
			}

			if (numHab == 1) {
				piso.setNumHab(numHab);
				piso.setEstudio(true);
			} else {
				piso.setNumHab(numHab);
			}

			// Número del piso

			System.out.println("Introduzca el número del piso: ");
			int numPiso = Integer.parseInt(scan.nextLine());
			while (numPiso < 0) {
				System.out.println("El número del piso debe ser positivo: ");
				numPiso = Integer.parseInt(scan.nextLine());
			}
			piso.setNumPiso(numPiso);

			// Puerta del piso

			System.out.println("Introduzca la letra de la puerta del piso: ");
			char puerta = scan.next().toUpperCase().charAt(0);
			piso.setPuerta(puerta);

			// Garaje

			System.out.println("Introduzca 'si' o 'no' si el piso tiene garaje propio: ");
			String garaje = scan.next();

			while (!garaje.equals("si") && !garaje.equals("no")) {
				System.out.println("Las opciones son 'si' o 'no': ");
				garaje = scan.next();
			}

			if (garaje.equals("si")) {
				piso.setGaraje(true);
			} else if (garaje.equals("no")) {
				piso.setGaraje(false);
			}

			// Número de m2 del piso

			System.out.println("Introduzca los metros cuadrados: ");
			scan.nextLine();
			int m2 = Integer.parseInt(scan.nextLine());

			while (m2 < 20) {
				System.out.println("La cantidad de m2 debe mayor a 20: ");
				m2 = Integer.parseInt(scan.nextLine());
			}

			piso.setM2(m2);

			if (x == 1) {
				System.out.println("Introduzca el precio de alquiler del piso: ");
				double alquiler = Double.parseDouble(scan.nextLine());
				piso.setPrecioAlquiler(alquiler);
				while (alquiler < 150) {
					System.out.println(
							"El precio del alquiler debe ser mayor a 150 €. Introduzca nuevamente el precio del alquiler del piso: ");
					alquiler = Double.parseDouble(scan.nextLine());
					piso.setPrecioAlquiler(alquiler);
				}
			} else if (x == 2) {
				System.out.println("Introduzca el precio de venta del piso: ");
				double venta = Double.parseDouble(scan.nextLine());
				piso.setPrecioVenta(venta);
				while (venta < 100000) {
					System.out.println(
							"El precio de venta del piso debe ser mayor a 100.000 €. Introduzca nuevamente el precio de venta del piso: ");
					venta = Double.parseDouble(scan.nextLine());
					piso.setPrecioVenta(venta);
				}
			} else if (x == 3) {
				System.out.println("Introduzca el precio de alquiler del piso: ");
				double alquiler = Double.parseDouble(scan.nextLine());
				piso.setPrecioAlquiler(alquiler);
				while (alquiler < 150) {
					System.out.println(
							"El precio del alquiler debe ser mayor a 150 €. Introduzca nuevamente el precio del alquiler del piso: ");
					alquiler = Double.parseDouble(scan.nextLine());
					piso.setPrecioAlquiler(alquiler);
				}
				System.out.println("Introduzca el precio de venta del piso: ");
				double venta = Double.parseDouble(scan.nextLine());
				piso.setPrecioVenta(venta);
				while (venta < 100000) {
					System.out.println(
							"El precio de venta del piso debe ser tener un valor mayor a 100.000€. Introduzca nuevamente el precio de venta del piso: ");
					venta = Double.parseDouble(scan.nextLine());
					piso.setPrecioVenta(venta);
				}

			}

			piso.setId(inmueble.size() + 1);
			System.out.println(piso);
			this.inmueble.add(piso);

		}

		else if (z.equals("casa")) {
			System.out.println(
					"\nA continuación se va a añadir una nueva casa al archivo.\n\nSe pedirán los datos de la DIRECCIÓN de la casa.");

			pedirDireccion(casa);

			// Pide el estado de la casa

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
				casa.setEstado(Alquiler);
			} else if (x == 2) {
				casa.setEstado(Venta);
			} else if (x == 3) {
				casa.setEstado(AlquilerYVenta);
			}

			// Número de habitaciones de la casa

			System.out.println("Introduzca el numero de habitaciones de la casa: ");
			int numHab = Integer.parseInt(scan.nextLine());
			while (numHab < 0) {
				System.out.println("El numero de habitaciones debe ser mayor que 1: ");
				numHab = Integer.parseInt(scan.nextLine());
			}

			casa.setNumHab(numHab);

			// Piscina

			System.out.println("Introduzca 'si' o 'no' si la casa posee piscina: ");
			String piscina = scan.next().toLowerCase();

			while (!piscina.equals("si") && !piscina.equals("no")) {
				System.out.println("Las opciones son 'si' o 'no': ");
				piscina = scan.next().toLowerCase();
			}

			if (piscina.equals("si")) {
				casa.setPiscina(true);
			} else {
				casa.setPiscina(false);
			}

			// Jardín

			System.out.println("Introduzca 'si' o 'no' si la casa posee jardín: ");
			String jardin = scan.next().toLowerCase();
			while (!jardin.equals("si") && !jardin.equals("no")) {
				System.out.println("Las opciones son 'si' o 'no': ");
				jardin = scan.next().toLowerCase();
			}

			if (jardin.equals("si")) {
				casa.setJardin(true);
			} else {
				casa.setJardin(false);
			}

			// Garaje

			System.out.println("Introduzca 'si' o 'no' si la casa tiene garaje propio: ");
			scan.nextLine();
			String garaje = scan.next().toLowerCase();

			while (!garaje.equals("si") && !garaje.equals("no")) {
				System.out.println("Las opciones son 'si' o 'no': ");
				garaje = scan.next().toLowerCase();
			}

			if (garaje.equals("si")) {
				casa.setGaraje(true);
			} else {
				casa.setGaraje(false);
			}

			// Número de m2 de la casa

			System.out.println("Introduzca los metros cuadrados de la casa: ");
			scan.nextLine();
			int m2 = Integer.parseInt(scan.nextLine());

			while (m2 <= 20) {
				System.out.println("La cantidad de m2 debe ser superior a 20 m2: ");
				m2 = Integer.parseInt(scan.nextLine());
			}

			casa.setM2(m2);

			if (x == 1) {
				System.out.println("Introduzca el precio de alquiler de la casa: ");
				double alquiler = Double.parseDouble(scan.nextLine());
				casa.setPrecioAlquiler(alquiler);
				while (alquiler <= 150) {
					System.out.println(
							"El precio del alquiler debe ser como mínimo 150 €. Introduzca nuevamente el precio del alquiler de la casa: ");
					alquiler = Double.parseDouble(scan.nextLine());
					casa.setPrecioAlquiler(alquiler);
				}
			} else if (x == 2) {
				System.out.println("Introduzca el precio de venta de la casa: ");
				double venta = Double.parseDouble(scan.nextLine());
				casa.setPrecioVenta(venta);
				while (venta < 100000) {
					System.out.println(
							"El precio de venta de la casa debe ser mínimo de 100.000 €. Introduzca nuevamente el precio de venta de la casa: ");
					venta = Double.parseDouble(scan.nextLine());
					casa.setPrecioVenta(venta);
				}
			} else if (x == 3) {
				System.out.println("Introduzca el precio de alquiler de la casa: ");
				double alquiler = Double.parseDouble(scan.nextLine());
				casa.setPrecioAlquiler(alquiler);
				while (alquiler < 150) {
					System.out.println(
							"El precio del alquiler debe ser mínimo de 150 €. Introduzca nuevamente el precio del alquiler de la casa: ");
					alquiler = Double.parseDouble(scan.nextLine());
					casa.setPrecioAlquiler(alquiler);
				}
				System.out.println("Introduzca el precio de venta de la casa: ");
				double venta = Double.parseDouble(scan.nextLine());
				casa.setPrecioVenta(venta);
				while (venta < 100000) {
					System.out.println(
							"El precio de venta de la casa debe ser mayor a 100.000 €. Introduzca nuevamente el precio de venta de la casa: ");
					venta = Double.parseDouble(scan.nextLine());
					casa.setPrecioVenta(venta);
				}

			}

			casa.setId(inmueble.size() + 1);
			this.inmueble.add(casa);
			System.out.println(casa);

		}

	}

	// Método para pedir la dirección por pasos (Complemento apartado A y B):

	public void pedirDireccion(Inmueble inmueble) {

		boolean incorrecto = true;

		Direccion aux = new Direccion();

		while (incorrecto) {

			System.out.println(
					"Introduzca el tipo de vía en la que se encuentra el inmueble (AVENIDA, CALLE, CAMINO, CARRETERA, PASEO, PLAZA): ");
			String tipoVia = scan.next().toLowerCase();

			switch (tipoVia) {

			case "calle":
				aux.setTipoDeVia(TipoDeVia.CALLE);
				incorrecto = false;
				break;

			case "avenida":
				aux.setTipoDeVia(TipoDeVia.AVENIDA);
				incorrecto = false;
				break;

			case "plaza":
				aux.setTipoDeVia(TipoDeVia.PLAZA);
				incorrecto = false;
				break;

			case "camino":
				aux.setTipoDeVia(TipoDeVia.CAMINO);
				incorrecto = false;
				break;

			case "carretera":
				aux.setTipoDeVia(TipoDeVia.CARRETERA);
				incorrecto = false;
				break;

			case "paseo":
				aux.setTipoDeVia(TipoDeVia.PASEO);
				incorrecto = false;
				break;

			default:
				System.out.println("OPCIÓN ERRÓNEA.\n");
			}
		}

		System.out.println("Introduzca el nombre: ");
		scan.nextLine();
		aux.setNombre(scan.nextLine());

		System.out.println("Introduzca el número: ");
		int num = Integer.parseInt(scan.nextLine());
		aux.setNum(num);
		while (num < 0) {
			System.out
					.println("El número del edificio debe ser positivo. Introduzca de nuevo el número del edificio: ");
			num = Integer.parseInt(scan.nextLine());
			aux.setNum(num);
		}

		System.out.println("Introduzca el código postal: ");
		int cp = Integer.parseInt(scan.nextLine());
		while (cp < 10000 || cp > 99999) {
			System.out
					.println("El CP debe ser un numero de entre 10000 y 99999. Introduzca de nuevo el código postal: ");
			cp = Integer.parseInt(scan.nextLine());
		}

		aux.setCp(cp);

		inmueble.setDireccion(aux);

	}

	// (Apartado B). Método para modificar un piso:

	public void modificarInmueble() {

		int id;

		System.out.println("\nIntroduzca el ID del inmueble a modificar: ");

		id = Integer.parseInt(scan.nextLine());

		while (id > this.inmueble.size() || id <= 0) {
			System.out.println("El ID introducido no pertenece a ningún piso, inténtelo de nuevo: ");
			id = Integer.parseInt(scan.nextLine());
		}

		System.out.println(inmueble.get(id - 1).toString());

		if (inmueble.get(id - 1) instanceof Piso) {
			char opcion = 'z';

			while (opcion != 'j') {
				System.out.println("\nLas opciones a modificar de un PISO son las siguientes:\n"
						+ " A) Introduzca una 'A' si desea modificar la dirección del piso.\n"
						+ " B) Introduzca una 'B' si desea modificar el precio de Venta del piso.\n"
						+ " C) Introduzca una 'C' si desea modificar el precio de Alquiler del piso.\n"
						+ " D) Introduzca una 'D' si desea modificar los metros cuadrados.\n"
						+ " E) Introduzca una 'E' si desea cambiar el estado del piso.\n"
						+ " F) Introduzca una 'F' si desea modificar el número del piso.\n"
						+ " G) Introduzca una 'G' si desea modificar la letra de la puerta del piso.\n"
						+ " H) Introduzca una 'H' si desea modificar el número de habitaciones del piso.\n"
						+ " I) Introduzca una 'I' si desea modificar el atributo garaje del piso.\n"
						+ " J) Introduzca una 'J' si no desea modificar ningún atributo.\n");

				opcion = scan.nextLine().toLowerCase().charAt(0);

				Piso aux = (Piso) inmueble.get(id - 1);

				switch (opcion) {

				case 'a':
					System.out.println("\nA continuación se introducirá la nueva dirección. ");
					pedirDireccion(inmueble.get(id - 1));
					break;
				case 'b':
					System.out.println("\nIntroduzca el nuevo precio de venta del piso: ");
					double precioVenta = Double.parseDouble(scan.nextLine());
					while (precioVenta < 100000) {
						System.out.println("\nEl nuevo precio de venta del piso debe ser mayor a 100.000 €: ");
						precioVenta = Double.parseDouble(scan.nextLine());
					}
					inmueble.get(id - 1).setPrecioVenta(precioVenta);
					break;
				case 'c':
					System.out.println("\nIntroduzca el nuevo precio de alquiler del piso: ");
					double precioAlquiler = Double.parseDouble(scan.nextLine());
					while (precioAlquiler < 150) {
						System.out.println("\nEl nuevo precio de alquiler del piso debe ser mayor a 150 €: ");
						precioAlquiler = Double.parseDouble(scan.nextLine());
					}
					inmueble.get(id - 1).setPrecioAlquiler(precioAlquiler);
					break;
				case 'd':
					System.out.println("\nIntroduzca los metros cuadrados: ");
					int m2 = Integer.parseInt(scan.nextLine());
					while (m2 < 25) {
						System.out.println("\nLos metros cuadrados deben ser mas de 25: ");
						m2 = Integer.parseInt(scan.nextLine());
					}
					inmueble.get(id - 1).setM2(m2);
					break;
				case 'e':
					System.out.println(
							"\nIntroduzca el nuevo estado del Piso.\nIntroduzca un 1 si el piso está en alquiler, 2 si está a la venta o 3 si está en ambos estados: ");
					int x = Integer.parseInt(scan.nextLine());
					while (x < 1 || x > 3) {
						System.out.println(
								"\nTiene que ser un valor entre 1 y 3.\nIntroduzca un 1 si el piso está en alquiler, "
										+ "2 si está a la venta o 3 si está en ambos estados: ");
						x = Integer.parseInt(scan.nextLine());
					}
					if (x == 1) {
						inmueble.get(id - 1).setEstado(Alquiler);
					} else if (x == 2) {
						inmueble.get(id - 1).setEstado(Venta);
					} else if (x == 3) {
						inmueble.get(id - 1).setEstado(AlquilerYVenta);
					}
					break;
				case 'f':
					System.out.println("Introduzca el nuevo número del piso: ");
					int num = Integer.parseInt(scan.nextLine());
					while (num < 0) {
						System.out.println(
								"El número del piso tiene que ser positivo. Introduzca de nuevo el número del piso: ");
						num = Integer.parseInt(scan.nextLine());
					}
					aux.setNumPiso(num);
					break;
				case 'g':
					System.out.println("Introduzca la nueva letra del piso: ");
					char letra = scan.next().charAt(0);
					aux.setPuerta(letra);
					break;
				case 'h':
					System.out.println("Introduzca el nuevo número de habitaciones del piso: ");
					int hab = Integer.parseInt(scan.nextLine());
					while (hab < 0) {
						System.out.println(
								"El número de habitaciones tiene que ser positivo. Introduzca de nuevo de habitaciones del piso: ");
						hab = Integer.parseInt(scan.nextLine());
					}
					inmueble.get(id - 1).setNumHab(hab);
					break;
				case 'i':
					System.out.println("Introduzca un 'si' o un 'no' si el piso posee garaje o no: ");
					String garaje = scan.nextLine();

					while (!garaje.equals("si") && !garaje.equals("no")) {
						System.out.println("Debe introducir un 'si' o 'no' si el piso posee o no garaje: ");
						garaje = scan.next();
					}

					if (garaje.equals("si")) {
						inmueble.get(id - 1).setGaraje(true);
					} else {
						inmueble.get(id - 1).setGaraje(false);
					}
					break;

				case 'j':
					System.out.println("\nNo se desea modificar ningún atributo más.");
					break;
				default:
					System.out.println("\nSeleccione una de las opciones posibles.");
				}
				System.out.println(inmueble.get(id - 1).toString());
			}
		} else {
			char opcion = 'z';

			while (opcion != 'j') {
				System.out.println("\nLas opciones a modificar de una CASA son las siguientes:\n"
						+ " A) Introduzca una 'A' si desea modificar la dirección de la casa.\n"
						+ " B) Introduzca una 'B' si desea modificar el precio de Venta de la casa.\n"
						+ " C) Introduzca una 'C' si desea modificar el precio de Alquiler de la casa.\n"
						+ " D) Introduzca una 'D' si desea modificar los metros cuadrados.\n"
						+ " E) Introduzca una 'E' si desea cambiar el estado de la casa.\n"
						+ " F) Introduzca una 'F' si desea modificar el atributo piscina de la casa.\n"
						+ " G) Introduzca una 'G' si desea modificar el atributo jardín de la casa.\n"
						+ " H) Introduzca una 'H' si desea modificar el número de habitaciones de la casa.\n"
						+ " I) Introduzca una 'I' si desea modificar el atributo garaje de la casa.\n"
						+ " J) Introduzca una 'J' si no desea modificar ningún atributo.\n");

				opcion = scan.nextLine().toLowerCase().charAt(0);

				Casa aux = (Casa) inmueble.get(id - 1);

				switch (opcion) {

				case 'a':
					System.out.println("\nA continuación se introducirá la nueva dirección. ");
					pedirDireccion(inmueble.get(id - 1));
					break;
				case 'b':
					System.out.println("\nIntroduzca el nuevo precio de venta de la casa: ");
					double precioVenta = Double.parseDouble(scan.nextLine());
					while (precioVenta < 100000) {
						System.out.println("\nEl nuevo precio de venta de la casa debe ser mayor a 100.000 €: ");
						precioVenta = Double.parseDouble(scan.nextLine());
					}
					inmueble.get(id - 1).setPrecioVenta(precioVenta);
					break;
				case 'c':
					System.out.println("\nIntroduzca el nuevo precio de alquiler de la casa: ");
					double precioAlquiler = Double.parseDouble(scan.nextLine());
					while (precioAlquiler < 150) {
						System.out.println("\nEl nuevo precio de alquiler de la casa debe ser mayor a 150 €: ");
						precioAlquiler = Double.parseDouble(scan.nextLine());
					}
					inmueble.get(id - 1).setPrecioAlquiler(precioAlquiler);
					break;
				case 'd':
					System.out.println("\nIntroduzca los metros cuadrados: ");
					int m2 = Integer.parseInt(scan.nextLine());
					while (m2 < 20) {
						System.out.println("\nLos metros cuadrados deben ser mas de 20: ");
						m2 = Integer.parseInt(scan.nextLine());
					}
					inmueble.get(id - 1).setM2(m2);
					break;
				case 'e':
					System.out.println(
							"\nIntroduzca el nuevo estado de la casa.\nIntroduzca un 1 si la casa está en alquiler, 2 si está a la venta o 3 si está en ambos estados: ");
					int x = Integer.parseInt(scan.nextLine());
					while (x < 1 || x > 3) {
						System.out.println(
								"\nTiene que ser un valor entre 1 y 3.\nIntroduzca un 1 si la casa está en alquiler, "
										+ "2 si está a la venta o 3 si está en ambos estados: ");
						x = Integer.parseInt(scan.nextLine());
					}
					if (x == 1) {
						inmueble.get(id - 1).setEstado(Alquiler);
					} else if (x == 2) {
						inmueble.get(id - 1).setEstado(Venta);
					} else if (x == 3) {
						inmueble.get(id - 1).setEstado(AlquilerYVenta);
					}
					break;
				case 'f':
					System.out.println("Introduzca un 'si' o un 'no' si la casa posee piscina o no: ");
					String piscina = scan.nextLine();
					
					while (!piscina.equals("si") && !piscina.equals("no")) {
						System.out.println("Debe introducir un 'si' o 'no' si la casa posee o no piscina: ");
						piscina = scan.next();
					}

					if (piscina.equals("si")) {
						aux.setPiscina(true);
					} else {
						aux.setPiscina(false);
					}
					break;
				case 'g':
					System.out.println("Introduzca un 'si' o un 'no' si la casa posee jardin o no: ");
					String jardin = scan.nextLine();
					
					while (!jardin.equals("si") && !jardin.equals("no")) {
						System.out.println("Debe introducir un 'si' o 'no' si la casa posee o no jardin: ");
						jardin = scan.next();
					}

					if (jardin.equals("si")) {
						aux.setJardin(true);
					} else {
						aux.setJardin(false);
					}
					break;
				case 'h':
					System.out.println("Introduzca el nuevo número de habitaciones de la casa: ");
					int hab = Integer.parseInt(scan.nextLine());
					while (hab < 0) {
						System.out.println(
								"El número de habitaciones tiene que ser positivo. Introduzca de nuevo de habitaciones de la casa: ");
						hab = Integer.parseInt(scan.nextLine());
					}
					inmueble.get(id - 1).setNumHab(hab);
					break;
				case 'i':
					System.out.println("Introduzca un 'si' o un 'no' si la casa posee garaje o no: ");
					String garaje = scan.nextLine();

					while (!garaje.equals("si") && !garaje.equals("no")) {
						System.out.println("Debe introducir un 'si' o 'no' si la casa posee o no garaje: ");
						garaje = scan.next();
					}

					if (garaje.equals("si")) {
						inmueble.get(id - 1).setGaraje(true);
					} else {
						inmueble.get(id - 1).setGaraje(false);
					}
					break;

				case 'j':
					System.out.println("\nNo se desea modificar ningún atributo más.");
					break;
				default:
					System.out.println("\nSeleccione una de las opciones posibles.");
				}
				System.out.println(inmueble.get(id - 1).toString());
			}
		}
	}

	// (Apartado C). Método para mostrar por pantalla los pisos:

	public void mostrarInmuebles() {
		System.out.println("\nLos inmuebles en la base de datos de la agencia actualmente son los siguientes: ");

		for (int i = 0; i < this.inmueble.size(); i++) {
			System.out.println(this.inmueble.get(i).toString());
		}
	}

	// (Apartado D). Métodos para mostrar los pisos por un rango de precios:

	public void rangoPreciosVenta(int precioMayor, int precioMenor) {
		int x = 0;
		if (precioMenor == 0) {
			precioMenor = 1;
		}
		for (int i = 0; i < inmueble.size(); i++) {
			double precio = inmueble.get(i).getPrecioVenta();
			if ((precio >= precioMenor) && (precio <= precioMayor)) {
				System.out.println(inmueble.get(i).toString());
				x++;
			}
		}
		if (x == 0) {
			System.out.println("No existe ningún inmueble en alquiler en ese rango de precios.");
		}
	}

	public void rangoPreciosAlquiler(int precioMayor, int precioMenor) {
		int x = 0;
		if (precioMenor == 0) {
			precioMenor = 1;
		}
		for (int i = 0; i < inmueble.size(); i++) {
			double precio = inmueble.get(i).getPrecioAlquiler();
			if ((precio >= precioMenor) && (precio <= precioMayor)) {
				System.out.println(inmueble.get(i).toString());
				x++;
			}
		}
		if (x == 0) {
			System.out.println("No existe ningún inmueble en alquiler en ese rango de precios.");
		}
	}

	// (Apartado E). Método para mostrar los pisos por un rango de m2:

	public void rangoM2(int m2Mayor, int m2Menor) {
		int x = 0;
		for (int i = 0; i < inmueble.size(); i++) {
			double m2 = inmueble.get(i).getM2();
			if ((m2 >= m2Menor) && (m2 <= m2Mayor)) {
				System.out.println(inmueble.get(i).toString());
				x += 1;
			}
		}
		if (x == 0) {
			System.out.println("No existe ningún inmueble en ese rango de M2.");
		}
	}

	// (Apartado F). Método para eliminar un piso del programa:

	public void removeInmueble() {

		int id;
		mostrarInmuebles();
		System.out.println("\nIntroduzca el ID del inmueble a eliminar: ");
		id = Integer.parseInt(scan.nextLine());

		while (id > this.inmueble.size() || id <= 0) {
			System.out.println("El ID introducido no pertenece a ningún inmueble, inténtelo de nuevo: ");
			id = Integer.parseInt(scan.nextLine());
		}

		System.out.println("¿Esta seguro que desea eliminar el siguiente inmueble? (S/N):");
		System.out.println(inmueble.get(id - 1));
		String respuesta = scan.nextLine();
		if (respuesta.equalsIgnoreCase("S")) {
			inmueble.remove(id - 1);
			for (int i = id; i <= inmueble.size(); i++) {
				inmueble.get(i - 1).setId(i);
			}
			System.out.println("EL ID DE LOS INMUEBLES HA CAMBIADO.\n");
			System.out.println("Inmueble eliminado correctamente.");
		} else {
			System.out.println("Eliminacion de inmueble cancelada.");
		}
	}
}
