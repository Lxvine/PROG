
public class EjerciciosTema3 {

	public static void Ejercicio1() {
		char arraychar[] = new char[25];
		float arrayreales[] = { 0.9f, 0.9f, 0.9f, 0.9f, 0.9f, 0.9f, 0.9f, 0.9f };
		int arrayenteros[] = { 10, 10, 10, 10 };

		System.out.println("\nEJERCICIO 1.");

		System.out.println("\nApartado A):\n");

		for (int i = 0; i < arraychar.length; i++) {
			arraychar[i] = 'i';
			System.out.println("En la posicion " + i + " el valor es " + arraychar[i] + ".");
		}

		System.out.println("\nApartado B):\n");

		for (int i = 0; i < arrayreales.length; i++) {
			System.out.println("En la posicion " + i + " el valor es " + arrayreales[i] + ".");
		}

		System.out.println("\nApartado C):\n");

		for (int i = 0; i < arrayenteros.length; i++) {
			System.out.println("En la posicion " + i + " el valor es " + arrayenteros[i] + ".");
		}

	}

	public static void Ejercicio2() {
		int a[] = new int[20];
		int aux = 19;

		System.out.println("\nEJERCICIO 2.");

		System.out.println("\nApartado A):\n");

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			System.out.println("En la posicion " + i + " el valor es " + a[i] + ".");
		}

		System.out.println("\nApartado B):\n");

		for (int i = 0; i < a.length; i++) {
			a[i] = aux;
			aux--;
			System.out.println("En la posicion " + i + " el valor es " + a[i] + ".");
		}

		System.out.println("\nApartado C):\n");

		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			if (i % 2 == 0) {
				System.out.println("En la posicion " + i + " el valor es " + a[i] + ": Falso.");
			} else {
				System.out.println("En la posicion " + i + " el valor es " + a[i] + ": Verdadero.");
			}

		}

		System.out.println("\nApartado D):\n");
		int i = 0;
		int notas[] = { 1, 5, 6, 7, 9 };
		for (i = 0; i < notas.length; i++) {
			switch (i) {
			case 0:
				System.out.println("La nota de matemáticas es: " + notas[i]);
				break;
			case 1:
				System.out.println("La nota de lengua es: " + notas[i]);
				break;
			case 2:
				System.out.println("La nota de historia es: " + notas[i]);
				break;
			case 3:
				System.out.println("La nota de economía es: " + notas[i]);
				break;
			case 4:
				System.out.println("La nota de química es: " + notas[i]);
				break;
			}
			

			if (notas[i] < 5) {
				System.out.println("Suspenso.\n");
			} else if (notas[i] == 5 || notas[i] == 6) {
				System.out.println("Aprobado.\n");
			} else if (notas[i] > 6 && notas[i] <= 8) {
				System.out.println("Notable.\n");
			} else if (notas[i] >= 9 && notas[i] <= 10) {
				System.out.println("Sobresaliente.\n");
			} else {
				System.out.println("No presentado.\n");
			}
		}

	}

	public static void Ejercicio3(int[] vector) {
		int aux;

		for (int i = 0; i < vector.length / 2; i++) {
			aux = vector[i];
			vector[i] = vector[vector.length - 1 - i];
			vector[vector.length - 1 - i] = aux;

		}

		String cadena = "Array: ";
		for (int i = 0; i < vector.length; i++) {
			cadena += vector[i] + ", ";
			
		}
		cadena = cadena.substring(0, cadena.length() - 2);
		System.out.println(cadena);
	}

	public static int aleatorio(int max) {
		double tloret = Math.random()*max;
		return (int) toret;
	}
	
	public static void bola() {
		int bolinga[] = new int[80];
		int cont = 0;
		for (int i = 0; i < bolinga.length; i++) {
			bolinga[aleatorio(79)]++;

			System.out.println("La bola " + i + " sale " + bolinga[i] + " veces.");
		do {
		 bolinga[33] < 3);
				cont ++;
			 
		
		}
		
	}
	
	public static void ejercicio4() {
		
	}
	
	public static void main(String[] args) {
//		Ejercicio1();
//		Ejercicio2();
//		int numeros[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
//		Ejercicio3(numeros);
		bola();
	}
}
