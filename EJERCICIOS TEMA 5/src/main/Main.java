package main;

import main.Electrodomestico.COLORS;
import main.Electrodomestico.CONSUMES;

public class Main {
	public static void ejercicio1() {
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];

		electrodomesticos[0] = new Electrodomestico(100, 60.13, COLORS.BLACK, CONSUMES.B);
		electrodomesticos[1] = new Electrodomestico(100, 12.33);
		electrodomesticos[2] = new Lavadora(100, 59.12, COLORS.GREY, CONSUMES.A, 65.12);
		electrodomesticos[3] = new Lavadora(100, 12.65, COLORS.WHITE, CONSUMES.A, 77.1);
		electrodomesticos[4] = new Television(100, 40.73);
		electrodomesticos[5] = new Television(100, 30.12, COLORS.BLUE, CONSUMES.E, 49, false);
		electrodomesticos[6] = new Electrodomestico(100, 78.71, COLORS.WHITE, CONSUMES.E);
		electrodomesticos[7] = new Electrodomestico(100, 31.93, COLORS.RED, CONSUMES.F);
		electrodomesticos[8] = new Lavadora(100, 25.18);
		electrodomesticos[9] = new Television(100, 11.75, COLORS.GREY, CONSUMES.C, 27, true);

		double sumaE = 0;
		double sumaL = 0;
		double sumaT = 0;

		for (int i = 0; i < electrodomesticos.length; i++) {
			if (electrodomesticos[i] instanceof Electrodomestico) {
				sumaE += electrodomesticos[i].finalPrize();
			}
			if (electrodomesticos[i] instanceof Lavadora) {
				sumaL += electrodomesticos[i].finalPrize();
			}
			if (electrodomesticos[i] instanceof Television) {
				sumaT += electrodomesticos[i].finalPrize();
			}
		}

		System.out.println("El total de lavadoras es: " + sumaL + " €.");
		System.out.println("El total de electrodomésticos es: " + sumaE + " €.");
		System.out.println("El total de televisiones es: " + sumaT + " €.");
	}

	public static void ejercicio2() {
		Videojuego videojuegos[] = new Videojuego[5];
		Serie series[] = new Serie[5];

		videojuegos[0] = new Videojuego("Breath of the wild", "Aventura", "Nintendo", 62);
		videojuegos[1] = new Videojuego("Elden Ring", "Souls", "From Software", 99);
		videojuegos[2] = new Videojuego("Sekiro", "Souls", "From Software", 80);
		videojuegos[3] = new Videojuego("Hollow Knight", "Plataformas", "Team Cherry", 40);
		videojuegos[4] = new Videojuego("The Last of Us", 51);

		series[0] = new Serie("Cortando por la linea de puntos", "Comedia", "Zero", 1);
		series[1] = new Serie("Los Serrano", "Drama", "Felipe VI", 55);
		series[2] = new Serie("La casa de papel", "Drama", "King Africa", 4);
		series[3] = new Serie("Pokemon", "Animación", "Miyazaki", 33);
		series[4] = new Serie("Aida", "Fermin");

		// Sysout de los arrays:

		System.out.println("");

		for (int i = 0; i < videojuegos.length; i++) {
			System.out.println(videojuegos[i]);
		}

		System.out.println("");

		for (int i = 0; i < series.length; i++) {
			System.out.println(series[i]);
		}

		System.out.println("");

		// Delivered series:

		series[0].delivered();
		series[3].delivered();
		series[4].delivered();

		// Delivered videojuegos:

		videojuegos[1].delivered();
		videojuegos[2].delivered();
		videojuegos[4].delivered();

		int delivered = 0;

		for (int i = 0; i < videojuegos.length; i++) {
			if (videojuegos[i].isDelivered()) {
				delivered++;
				videojuegos[i].returned();
			}

			if (series[i].isDelivered()) {
				delivered++;
				series[i].returned();
			}

		}
		System.out.println("La cantidad de elementos entregados es: " + delivered + ".");
	}

	public static void ejercicio3() {

		// Primer comercial:

		Comercial c1 = new Comercial("Miguel", 34, 1231.93, 211.33);
		c1.plus();
		System.out.println("1. Comercial: " + c1);

		// Segundo comercial:

		Comercial c2 = new Comercial("Carlos", 21, 1647.91, 399.21);
		c2.plus();
		System.out.println("2. Comercial: " + c2);

		// Primer Repartidor:

		Repartidor r1 = new Repartidor("Manin", 23, 1123.94, "zona 3");
		r1.plus();
		System.out.println("3. Repartidor: " + r1);

		// Segundo Repartidor:

		Repartidor r2 = new Repartidor("Openas", 22, 1023.21, "zona 1");
		r2.plus();
		System.out.println("4. Repartidor: " + r2);

	}

	public static void ejercicio4() {

		// Array productos:

		Producto productos[] = new Producto[5];

		productos[0] = new Producto("CocaCola", 1.23);
		productos[1] = new Producto("Jamongus", 1.3);
		productos[2] = new Producto("Bic azul", 0.24);
		productos[3] = new Producto("Galletas Príncipe", 3.31);
		productos[4] = new Producto("Agua Bezoya", 0.31);

		double suma = 0;

		for (int i = 0; i < productos.length; i++) {
			suma = productos[i].getPrize() * 5;
			System.out.println("El precio de 5 artículos de " + productos[i].getName() + " es: " + suma + " €.");
		}

	}
	
	public static void ejercicio5() {
		
	}

	public static void main(String[] args) {
//  	ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
		ejercicio5();
	}
}