import java.util.Scanner;

public class EjerciciosTema2 {

	static Scanner scan = new Scanner(System.in);

//1.

//Dise�ar un procedimiento que intercambie el valor de dos variables de tipo entero. 
//Incluir el algoritmo principal que realice la llamada a este procedimiento.

	public static int x = 5;
	public static int y = 7;

	public static void Ejercicio1() {

		int aux;

		aux = y;

		y = x;

		x = aux;

	}

//2.

//Dise�ar una funci�n que tenga como entrada tres n�meros enteros y nos devuelva el mayor de los tres.
//Incluir el algoritmo principal que realice la llamada a esta funci�n.

	public static int Ejercicio2(int a, int b, int c) {
		if (a >= b && a >= c)
			return a;
		else if (b >= a && b >= c)
			return b;
		else
			return c;
	}

//3.

//Dise�ar unan funci�n que permita calcular el n�mero e, usando la expresi�n:

//e = 1 + 1/1! + 1/2! + 1/3! + ...

//La precisi�n indicar� el n�mero de t�rminos de la serie que se habr�n de tomar 
//en cada caso, y ser� un dato de entrada. Como paso previo se deber� dise�ar la funci�n
//que calcule el factorial de un nuevo n�mero.

	public static double factorial(double n) {
		double fact = 0;

		for (double i = n - 1; i >= 1; i--) {
			fact = n * i;
			n = fact;
		}
		return n;

	}

	public static double Ejercicio3(int n) {
		double aprox = 0.0;
		for (double i = n; i >= 1; i--) {
			aprox = aprox + 1 / factorial(n);
			n--;
		}
		return aprox + 1;
	}

//4.

//Dise�ar una funci�n que admite, como par�metro de entrada, un car�cter y que devuelva, 
//como par�metro de  salida,  el  n�  de  veces  que  aparece  dicho  car�cter  en  una 
//secuencia de caracteres le�da  de  teclado.  Dicha  secuencia  concluir�  cuando  el  
//usuario introduzca un punto.

	public static int contadorChar(char x, String cadena) {
		Scanner scan = new Scanner(System.in);
		int posicion, sum = 0;

		posicion = cadena.indexOf(x);

		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i) == '.') {
				return sum;
			} else if (cadena.charAt(i) == x) {
				sum++;
				posicion = cadena.indexOf(x, posicion + 1);
			}
		}
		return sum;
	}

	public static void Ejercicio4(char x) {
		String cadena;
		System.out.println("Introduzca cadena de caracteres: ");
		cadena = scan.nextLine();
		System.out.println("El n�mero de veces que \"" + x + "\" se repite es: " + contadorChar(x, cadena) + " veces.");
	}

//5.

//Dise�ar una funci�n que invierta los d�gitos de un n�mero entero positivo.

	public static String Ejercicio5(int x) {
		int aux;
		String cadena = "";
		for (int i = x; i >= 1; i = i / 10) {
			aux = i % 10;
			cadena = cadena + Integer.toString(aux);
		}
		return cadena;
	}

//6.

//Dise�ar una funci�n que decida si dos n�meros enteros positivos son amigos. Dos 
//n�meros son amigos si la suma de los divisores, distintos de s� mismo, de cada uno 
//de ellos, coincide con el otro n�mero. Ejemplo, 284 y 220 son dos n�meros amigos.

	public static int sumDivisores(int n) {
		int sum = 0;

		for (int i = n - 1; i >= 1; i--) {
			if (n % i == 0) {
				sum += i;
			} System.out.println(sum);
		}
		return sum;
	}

	public static void Ejercicio6(int x, int y) {
		if (sumDivisores(x) != y) {
			System.out.println("Los n�meros no son amiwis.");
		} else {
			if (sumDivisores(y) == x) {
				System.out.println("Los n�meros si son amiwis.");
			} else {
				System.out.println("Los n�meros no son amiwis.");
			}
		}
	}

// 7.

//Dise�ar  una  funci�n  que  dado  un  n�mero  entero  positivo,  diga  si  es  o  no
//un n�mero  perfecto,  sabiendo  que  un  n�mero  perfecto  es  aquel  para  el  cual  la 
//suma  de  sus divisores enteros positivos (excepto el mismo) coincide con el n�mero. 
//Por ejemplo, 6 es un n�mero  perfecto  porque  la  suma  de  sus  divisores  enteros  1,  
//2  y  3  es  igual  a  6.  8  no  es  un n�mero perfecto, porque la suma de sus divisores 
//enteros, 1+2+4 es distinto de 8.

	public static void Ejercicio7(int n) {
		if (sumDivisores(n) == n) {
			System.out.println("N�mero Perfecto.");
		} else {
			System.out.println("N�mero no Perfecto.");
		}
	}

//8.

//Implementar un programa de registro y login. En primer lugar se ejecutar� el c�digo 
//de registro y en segundo lugar se solicitar� el login.

//- Implementar un procedimiento registro():se solicitar� un nombre de usuario, una contrase�a 
//y se pedir� de nuevo la contrase�a para verificar su correcci�n. Si las contrase�as coinciden 
//se continuar� con la ejecuci�n del login, en caso contrario se mostrar� el mensaje "La contrase�a "
//"no coincide y finalizar� el programa".

//- Implementar una funci�n login(): se solicitar� el nombre de usuario y la contrase�a. Si ambos 
//coinciden se devolver� un valor booleano verdadero. 

//- Seg�n  el  valor  del  booleano  de  la  
//funci�n  login  debe  mostrarse  el  mensaje  "Acceso  autorizado  a nombre_usuario",  o  se 
//mostrar� el mensaje "Acceso denegado" y finalizar� el programa.

	public static void registro() {
		Scanner scan = new Scanner(System.in);
		String nombreuser, password, password1;

		System.out.println("Introduzca un nombre de usuario: ");
		nombreuser = scan.next();
		System.out.println("Introduzca su contrase�a: ");
		password = scan.next();
		System.out.println("Introduzca de nuevo su contrase�a: ");
		password1 = scan.next();
		if (password.equals(password1)) {
			if (login(nombreuser, password)) {
				System.out.println("Acceso autorizado a " + nombreuser);
			} else {
				System.out.println("Acceso denegado");
			}
		} else {
			System.out.println("La contrase�a no coincide y finalizar� el programa.");
		}
	}

	public static boolean login(String nombreuser, String password) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduzca un nombre de usuario: ");
		String nombreuser1 = scan.next();
		System.out.println("Introduzca su contrase�a: ");
		String password1 = scan.next();
		if (nombreuser.equals(nombreuser1)) {
			if (password.equals(password1)) {
				return true;
			} else {
				System.out.println("Contrase�a incorrecta.");
			}

		} else {
			System.out.println("Usuario incorrecto.");

		}
		return false;
	}
//9.

// Desarrolla un programa que permita realizar sumas, restas, multiplicaciones y
// divisiones con 2 n�meros enteros (0-9). El programa debe cubrir las
// siguientes especificaciones, creando y haciendo uso de las funciones o
// procedimientos necesarios:

//- En primer lugar el programa debe solicitar los 2 d�gitos.

//- En segundo lugar se solicita la operaci�n a realizar. Las operaciones admitidas ser�n: sumar (o +), restar (o -), multiplicar (o *), dividir (/).

//- El usuario podr� introducir los operandos en formato num�rico o textual. Ej.: Se admite las entradas 1, uno o UNO.

//- Para el formato num�rico se admitir� cualquier valor, mientras que para el formato textual s�lo se admitir�n unidades (cero-nueve).

//- El programa debe controlar los errores de usuario, advirtiendo por pantalla que se ha producido.

	public static void Ejercicio9() {
		Scanner scan = new Scanner(System.in);
		int x1, x2;
		char ope;

		System.out.println("Introduzca el primer d�gito: ");
		x1 = parseoVal(scan.next());

		System.out.println("Introduzca el segundo d�gito: ");
		x2 = parseoVal(scan.next());

		System.out.println(
				"Introduzca el caracter de la operaci�n a realizar (suma (o +), resta (o -), multiplicacion (o *), division (o /)");
		ope = parseoOp(scan.next());

		System.out.println("El resultado de la operaci�n es: " + operacionCamaron(x1, x2, ope));
	}

	public static double operacionCamaron(int x1, int x2, char ope) {
		double n = 0;
		switch (ope) {
		case '+':
			n = x1 + x2;
			break;
		case '-':
			n = x1 - x2;
			break;
		case '*':
			n = x1 * x2;
			break;
		case '/':
			n = x1 / x2;
			break;
		default:
			System.out.println("Operaci�n desconocidaaaa");
		}
		return n;
	}

	public static char parseoOp(String y) {
		y = y.toLowerCase();
		char z = y.charAt(0);
		if (y.length() > 1) {
			switch (y) {
			case "suma":
				z = '+';
				break;
			case "resta":
				z = '-';
				break;
			case "multiplicacion":
				z = '*';
				break;
			case "division":
				z = '/';
				break;
			default:
				System.out.println("Caracter err�neo.");
			}
		}
		return z;
	}

	public static int parseoVal(String x) {
		int a = 0;
		x = x.toLowerCase();
		if (x.length() > 1) {
			switch (x) {
			case "cero":
				a = 0;
				break;
			case "uno":
				a = 1;
				break;
			case "dos":
				a = 2;
				break;
			case "tres":
				a = 3;
				break;
			case "cuatro":
				a = 4;
				break;
			case "cinco":
				a = 5;
				break;
			case "seis":
				a = 6;
				break;
			case "siete":
				a = 7;
				break;
			case "ocho":
				a = 8;
				break;
			case "nueve":
				a = 9;
				break;

			default:
				System.out.println("Entrada incorrecta.");
			}

		} else {
			a = Integer.parseInt(x);
		}
		return a;
	}

	// 10.

//Realiza un programa que contenga varias funciones para calcular el �rea y el per�metro de circunferencias, rect�ngulos, cuadrados y 
//tri�ngulos equil�teros. En el cuerpo del programa prueba las funciones.

	public static void Ejercicio10() {
		Scanner scan = new Scanner(System.in);
		int x, y;
		String uwu;

		System.out.println("Introduzca el primer valor medido: ");
		x = scan.nextInt();

		System.out.println("Introduzca el segundo valor medido: ");
		y = scan.nextInt();

		System.out.println("Introduzca la forma geom�trica (rectangulo, cuadrado, circunferencia o triangulo): ");
		uwu = scan.next().toUpperCase();
		if (uwu.equals("RECTANGULO") || uwu.equals("TRIANGULO") || uwu.equals("CUADRADO")
				|| uwu.equals("CIRCUNFERENCIA")) {
			System.out.println(
					"El �rea de: " + uwu + " es " + area(x, y, uwu) + " y el per�metro es " + perimetro(x, y, uwu));
		} else {
			System.out.println("Figura equivocada.");
		}

	}

	public static double area(int x, int y, String uwu) {
		double area = 0.0;
		switch (uwu) {
		case "RECTANGULO":
			area = x * y;
			break;
		case "CIRCULO":
			area = Math.PI * x * x;
			break;
		case "CUADRADO":
			area = x * x;
			break;
		case "TRIANGULO":
			area = (x * y) / 2;
			break;
		default:
		}
		return area;
	}

	public static double perimetro(int x, int y, String uwu) {
		double peri = 0.0;
		switch (uwu) {
		case "RECTANGULO":
			peri = 2 * x + 2 * y;
			break;
		case "CIRCULO":
			peri = 2 * Math.PI * x;
			break;
		case "CUADRADO":
			peri = 4 * x;
			break;
		case "TRIANGULO":
			peri = x + x + x;
			break;
		default:
			System.out.println("Forma geom�trica err�nea.");
		}
		return peri;
	}

	public static void main(String[] args) {
		// 1.

//		Ejercicio1();
//		System.out.println("X es: " + x + "\nY es: " + y);

		// 2.

//		System.out.println(Ejercicio2(14, 13, 7));

		// 3.

//		System.out.println(Ejercicio3(5));

		// 4.

//		Ejercicio4('a');

		// 5.

//		System.out.println(Ejercicio5(1500));

		// 6.

      Ejercicio6(220, 284);

		// 7.

//		Ejercicio7(28); 

		// 8.

//		registro();

		// 9.

//		Ejercicio9();

		// 10.

//		Ejercicio10();
	}
}
