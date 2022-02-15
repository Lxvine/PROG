import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void Menu() {
		Scanner scan = new Scanner(System.in);
		char opcion = 'z';

		while (opcion != 'd') {
			System.out.println("################### BIENVENIDO/A: ###################\n\n"
					+ "Este programa permite ejecutar 4 opciones: \n"
					+ "A) El número de días que corresponde a un mes de un año dado.\n"
					+ "B) Calcula el valor de m sobre n.\n"
					+ "C) Calcula los números perfectos comprendidos entre los números que introduzca el usuario.\n"
					+ "D) El programa finalizará.\n\n"
					+ "A continuación, introduzca la opción deseada (A, B, C o D): ");

			opcion = scan.next().toLowerCase().charAt(0);

			switch (opcion) {
			case 'a':
				System.out.println(
						"Introduzca el mes (formato textual (mayúsculas o minúsculas) o en formato numérico): ");
				int mes = parseoMes(scan.next());
				while (mes < 1 || mes > 12) {
					System.out.println(
							"Debe introducirse un mes correcto en formato numérico (del 1 al 12) o en formato textual (enero, febrero, etc.): ");
					mes = parseoMes(scan.next());
					System.out.println(mes);
				}
				String month = "";
				if (mes == 1) {
					month = "enero";
				} else if (mes == 2) {
					month = "febrero";
				} else if (mes == 3) {
					month = "marzo";
				} else if (mes == 4) {
					month = "abril";
				} else if (mes == 5) {
					month = "mayo";
				} else if (mes == 6) {
					month = "junio";
				} else if (mes == 7) {
					month = "julio";
				} else if (mes == 8) {
					month = "agosto";
				} else if (mes == 9) {
					month = "septiembre";
				} else if (mes == 10) {
					month = "octubre";
				} else if (mes == 11) {
					month = "noviembre";
				} else if (mes == 12) {
					month = "diciembre";
				}
				System.out.println("Introduzca el año: ");
				int year = scan.nextInt();
				if (year < -46) {
					System.out.println(
							"El año bisiesto fue introducido por Julio Cesar en el año 46 a.C. Introduzca un año válido: ");
					year = scan.nextInt();
				}
				System.out.println(
						"El número de días de " + month + " en el año " + year + " son: " + dias(year, mes) + ".\n");

				break;
			case 'b':
				int m, n;
				System.out.println("Introduzca el valor de m (debe ser positivo y mayor que n): ");
				m = scan.nextInt();
				while (m <= 0) {
					System.out.println("m debe ser positivo, introduzca de nuevo el valor de m: ");
					m = scan.nextInt();
				}
				System.out.println("Introduzca el valor de n (debe ser positivo y menor que m): ");
				n = scan.nextInt();
				while (n <= 0) {
					System.out.println("n debe ser positivo, introduzca de nuevo el valor de n: ");
					n = scan.nextInt();
				}
				if (m > n) {
					System.out.println("El valor de m (" + m + ") sobre n (" + n + ") es: " + combinarMyN(m, n) + ".");
				} else {
					System.out.println("El valor de m debe ser mayor que n.");
				}
				break;
			case 'c':
				System.out.println("Introduzca el valor de n (ha de ser positivo e inferior a m): ");
				n = scan.nextInt();
				while (n <= 0) {
					System.out.println("No existen números perfectos negativos. \nIntroduzca de nuevo el valor de n: ");
					n = scan.nextInt();
				}
				System.out.println("Introduzca el valor de m (ha de ser positivo y mayor que n): ");
				m = scan.nextInt();
				while (m <= 0) {
					System.out.println("El valor de m debe ser positivo, no existen números perfectos negativos: ");
					m = scan.nextInt();
				}
				while (n >= m) {
					System.out.println("m debe ser mayor que n. \nVuelva a introducir el valor de n: ");
					n = scan.nextInt();
					System.out.println("Introduzca el valor de m: ");
					m = scan.nextInt();
				}
				if (numPerfe(n, m).length == 0) {
					System.out.println("Entre (" + n + ") y (" + m + ") no hay números perfectos.");
				} else {

					System.out.println("Los numeros perfectos comprendidos entre (" + n + ") y (" + m + ") son: "
							+ Arrays.toString(numPerfe(n, m)) + ".");
				}
				break;
			case 'd':
				System.out.println("El programa ha finalizado.");
				break;

			default:
				System.out.println("Seleccione una opción correcta: (A, B, C o D).\n");
			}
		}
	}

	public static boolean bisiesto(int year) {
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
			return true;
		else {
			return false;
		}
	}

	public static int parseoMes(String x) {
		int a = 0;
		x = x.toLowerCase();
		if (x.length() > 2) {
			switch (x) {
			case "enero":
				a = 1;
				break;
			case "febrero":
				a = 2;
				break;
			case "marzo":
				a = 3;
				break;
			case "abril":
				a = 4;
				break;
			case "mayo":
				a = 5;
				break;
			case "junio":
				a = 6;
				break;
			case "julio":
				a = 7;
				break;
			case "agosto":
				a = 8;
				break;
			case "septiembre":
				a = 9;
				break;
			case "octubre":
				a = 10;
				break;
			case "noviembre":
				a = 11;
				break;
			case "diciembre":
				a = 12;
				break;
			default:
				System.out.println("Mes no válido.");
			}

		} else {
			a = Integer.parseInt(x);
		}
		return a;
	}

	public static long dias(int year, int mes) {
		long dias = -1;

		switch (mes) {
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		case 2:
			if (bisiesto(year)) {
				dias = 29;
			} else {
				dias = 28;
			}
			break;
		default:
			dias = 31;
		}

		return dias;
	}

	public static double factorial(int x) {
		double resultado = 1;
		for (int i = 1; i <= x; i++) {
			resultado *= i;
		}
		return resultado;
	}

	public static double combinarMyN(int m, int n) {
		double resultado = factorial(m) / (factorial(n) * factorial(m - n));
		return resultado;
	}

	public static boolean sumDivisores(int n) {
		int sum = 0;

		for (int i = n - 1; i >= 1; i--) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (sum == n) {
			return true;
		}
		return false;
	}

	public static int[] numPerfe(int n, int m) {
		int[] resultado = new int[m];
		int aux = 0;
		for (int i = n; i <= m; i++) {
			if (sumDivisores(i)) {
				resultado[aux] = i;
				aux++;
			}
		}

		int[] resultado1 = new int[aux];
		for (int i = 0; i < aux; i++) {
			resultado1[i] = resultado[i];
		}
		return resultado1;

	}

	public static void main(String[] args) {
		Menu();
	}
}
