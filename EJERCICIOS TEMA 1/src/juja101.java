//1.

//Dise�ar un algoritmo que convierta una temperatura le�da en grados Fahrenheit
//a grados Celsius, usando la f�rmula: C = (5/9) * (F-32)
//
import java.util.Scanner;

public class juja101 {
		
		float far = 0f, cel = 0f;
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Introduzca los grados Fahrenheit: ");
		
		far=scan.nextFloat();
		
		cel = (5.0f/9.0f)*(far-32);
		
		System.out.println("El valor en grados Celsius es: " + cel);
		scan.close();

	}
}

//2.

//Dise�ar un algoritmo que calcule y muestre en pantalla el volumen
//y el �rea de una esfera usando las f�rmulas:
//V = (4* pi * r^3) / 3
//A = 4* pi * r^2

//import java.util.Scanner;
//
//public class juja102 {
//
//	public static void main(String[] args) {
//		
//		double vol, area, radio;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Introduzca el radio: ");
//		
//		radio = scan.nextDouble();
//		
//		vol = 4f * Math.PI*Math.pow (radio,3) / 3;
//		
//		System.out.println("El volumen de la esfera es: "+ vol);
//		
//		area = 4 * Math.PI*Math.pow(radio,2);
//		
//		System.out.println("El �rea de la esfera es: " +area);
//		
//		scan.close();
//		
//	}
//}

//3.

//Dise�ar un algoritmo que pida una nota (valor entero) por teclado 
//y dependiendo de su valor visualice la nota en letras. Por ejemplo,
//si nota es igual a 7 tiene que mostrar el texto "notable".

//import java.util.Scanner;
//
//public class juja103 {
//	public static void main(String[] args) {
//		int nota;
//		System.out.println("Introduce una nota entre 0 y 10: ");
//		Scanner scan = new Scanner(System.in);
//		nota = scan.nextInt();
//		while (nota < 0 || nota > 10) {
//			System.out.println("La nota tiene que estar entre 0 y 10: ");
//			nota = scan.nextInt();
//		}
//		if (nota < 5) {
//			System.out.println("Suspenso.");
//		} else if (nota < 6) {
//			System.out.println("Aprobado.");
//		} else if (nota < 7) {
//			System.out.println("Bien.");
//		} else if (nota < 9) {
//			System.out.println("Notable.");
//		} else {
//			System.out.println("Sobresaliente");
//			scan.close();
//		}
//}
//}
//
//		do {
//			System.out.println("Inserta nota del 0 al 10: ");
//			nota = scan.nextInt();
//		} while (nota < 0 || nota > 10);
//		scan.close();
//		System.out.println("Nota correcta.");
//		switch(nota){
//		case 5: System.out.println("Aprobau Juan Carlos.");
//		break;
//		case 6: System.out.println("Bien rico mami.");
//		break;
//		case 7: System.out.println("notablemente duro.");
//		break;
//		case 8: System.out.println("notablemente blando.");
//		break;
//		case 9: System.out.println("sobresalido.");
//		break;
//		case 10: System.out.println("sobresaliente.");
//		break;
//		default: System.out.println("Suspenso.");
//		}
//	}
//}

//4.

//Die�ar un algoritmo que lea 20 caracteres del teclado y muestre por pantalla
//el n�mero de veces que se repiten cada una de las vocales.

//import java.util.Scanner;
//
//public class juja104 {
//	public static void main(String[] args) {
//		int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;
//		String cadena;
//
//		Scanner scan = new Scanner(System.in);
//
//		do {System.out.println("Introduce una cadena de 20 caracteres desde el portatil: ");
//			cadena = scan.nextLine();
//		} while (cadena.length() < 20 || cadena.length() > 20);
//		for (int i=0;i<cadena.length();i++) {
//		char character=cadena.charAt(i);
//		
//		switch (character) {
//		case 'a':
//			contadorA++;
//			break;
//		case 'e':
//			contadorE++;
//			break;
//		case 'i':
//			contadorI++;
//			break;
//		case 'o':
//			contadorO++;
//			break;
//		case 'u':
//			contadorU++;
//			break;
//		}
//		}
//		System.out.println(
//				"A=" + contadorA + "\nE=" + contadorE + "\nI=" + contadorI + "\nO=" + contadorO + "\nU=" + contadorU);
//	}
//
//}

//5.

//Dise�ar un algoritmo que lea del teclado dos n�meros enteros y un car�cter.
//El car�cter s�lo puede ser uno de los signos de operaci�n aritm�tica: 
//'+', '-', '*', '/', '%'. Se trata de visualizar en pantalla el resultado 
//de realizar la operaci�n aritm�rica correspodiente con los dos n�meros introducidos.

//import java.util.Scanner;
//
//public class juja5 {
//	public static void main(String[] args) {
//		double a, b;
//		char signo = '.';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Introduce el primer n�mero entero: ");
//		a = scan.nextInt();
//		System.out.println("Introduce el segundo n�mero entero: ");
//		b = scan.nextInt();
//		System.out.println("Introduce el signo: ");
//
//		while (signo != '+' && signo != '-' && signo != '*' && signo != '/' && signo != '%') {
//			signo = scan.next().charAt(0);
//			switch (signo) {
//			case '+':
//				System.out.println("La suma es: " + (a + b));
//				break;
//			case '-':
//				System.out.println("La resta es: " + (a - b));
//				break;
//			case '*':
//				System.out.println("La multiplicaci�n es: " + (a * b));
//				break;
//			case '/':
//				System.out.println("La divisi�n es: " + (a / b));
//				break;
//			case '%':
//				System.out.println("El resto es: " + (a % b));
//				break;
//			default:
//				System.out.println("El signo no es v�lido por favor introduce uno correcto: ");
//
//			}
//		}
//		scan.close();
//	}
//}

//import java.util.Scanner;
//
//public class juja105 {
//
//	public static void main(String[] args) {
//
//		double a, b;
//		char Signo = 0;
//		boolean entraenelbucle = true;
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Introduzca el valor A: ");
//		a = scan.nextDouble();
//
//		System.out.println("Introduzca el valor B: ");
//		b = scan.nextDouble();
//
//		System.out.println("Introduzca un signo: ");
//		Signo = scan.next().charAt(0);
//
//		while (entraenelbucle) {
//
//			if (Signo == '+') {
//				System.out.println("La suma es: " + (a + b));
//				entraenelbucle = false;
//			} else if (Signo == '-') {
//				System.out.println("La resta es: " + (a - b));
//				entraenelbucle = false;
//			} else if (Signo == '*') {
//				System.out.println("La multiplicaci�n es: " + (a * b));
//				entraenelbucle = false;
//			} else if (Signo == '/') {
//				System.out.println("La divisi�n es: " + (a / b));
//				entraenelbucle = false;
//			} else if (Signo == '%') {
//				System.out.println("El resto es: " + (a % b));
//				entraenelbucle = false;
//			} else {
//				System.out.println("Introduzca un signo v�lido (+, -, *, /, %.): ");
//				Signo = scan.next().charAt(0);
//			}
//		}
//	}
//}

//6.

//Dise�ar un algoritmo que obtenga el promedio de una lista de valores reales le�dos 
//por teclado. El algoritmo terminar� cuando el usuario introduzca 20 valores.

//
//import java.util.Scanner;
//
//public class juja106 {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		double valor;
//		double sumando = 0;
//		for (int x = 1; x <= 20; x++) {
//			System.out.println("Introduzca el valor " + x +":");
//			valor = scan.nextDouble();	
//			sumando = sumando + valor;
//		}
//		System.out.println("La media es: " + sumando/20);
//		scan.close();
//	}
//}

//7. 

//Dise�ar un algoritmo que calcule y muestre en pantalla el factorial de un n�mero,
//que se solicite por teclado.

//import java.util.Scanner;
//
//public class juja107 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int valor;
//		System.out.println("Introduce el valor para calcular el factorial: ");
//		valor = Math.abs(scan.nextInt());
//		if (valor == 0) {
//			valor = 1;
//		}
//		for (int contador = valor - 1; contador > 0; contador--) {
//			valor = valor * contador;
//		}
//		System.out.println("El factorial es " + valor);
//	}
//}

//8.

//Realizar un algoritmo que calcule y muestre en la pantalla la suma de los
//n primeros entero impares.

//import java.util.Scanner;
//
//public class juja108 {
//	public static void main(String[] args) {
//		long n;
//		int sum = 0;
//		int a = 1;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Introduzca la cantidad de veces que se sumaran los impares: ");
//		n = scan.nextInt();
//		while (n < 0) {
//			System.out.println("Introduzca un n�mero superior a 0: ");
//			n = scan.nextInt();
//		}
//		for (int i = 0; i < n; i++) {
//			sum = sum + a;
//			a = a + 2;
//		}
//		System.out.println("El resultado es: " + sum);
//	}
//}

//9.

//Dise�ar un algoritmo que calcule la suma de todos los n�meros
//comprendidos entre 1 y 500 que cumplan la condici�n de ser m�ltiplos de 5 y 7.
//Para verificar si un n�mero X es m�ltiplo de otro n�mero Y s�lo tienes
//que comprobar si el resto de la divisi�n entera de X dividido por Y es cero.
//
//import java.util.Scanner;
//
//public class juja109 {
//	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 1; i <= 500; i++) {
//			if (i % 5 == 0) {
//				sum = sum + i;
//
//			} else if (i % 7 == 0) {
//				sum = sum + i;
//			}
//		}
//		System.out.println("La suma total de los m�ltiplos de 5 y 7 de los n�meros comprendidos entre 1 y 500 es:" + sum);
//	}
//}

// 10.

// Implementar un programa que verifique si un texto es Twiteable (tiene 280 caracteres).
//En caso de que lo sea el programa responder� "Twiteable" y en caso contrario responder� "No twiteable".

//import java.util.Scanner;
//
//public class juja110 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		String juja;
//
//		System.out.println("Introduzca un twit: ");
//		juja = scan.nextLine();
//		if (juja.length() <= 0) {
//			System.out.println("Error.");
//		} else if (juja.length() <= 280) {
//			
//			System.out.println("Twiteable.");
//		} else {
//			System.out.println("No twiteable.");
//
//		}
//	}
//}

////11.
//
////Dise�ar un algoritmo que lea del teclado un n�mero entero correspondiente a una cantidad de minutos y nos diga a cuantos d�as, 
////horas y minutos corresponde. Por ejemplo, 4565 corresponden a 3 d�as, 4 horas y 5 minutos.

//import java.util.Scanner;
//
//public class juja111 {
//
//	public static void main(String[] args) {
//
//		double valor;
//		double minutos;
//		double dias;
//		double horas;
//
//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Introduzca la cantidad de minutos: ");
//
//		valor = scan.nextInt();
//
//		dias = valor / 1440;
//
//		horas = dias;
//
//		while (horas > 1) {
//			horas = horas - 1;
//		}
//
//		System.out.println((dias - horas) + " d�as.");
//
//		horas = horas * 24;
//
//		minutos = horas;
//
//		while (minutos > 1) {
//			minutos = minutos - 1;
//		}
//
//		System.out.println((horas - minutos) + " horas.");
//
//		minutos = minutos * 60;
//
//		System.out.println((minutos) + " minutos. ");
//		
//	}
//}

//}

//import java.util.Scanner;
//
//public class juja111 {
//
//  public static void main(String[] args) {
//
//    int valorInicial;
//    int minutos;
//    int horas;
//    int dias;
//    int aux;
//    Scanner scan = new Scanner(System.in);
//
//    System.out.println("Introduzca la cantidad de minutos: ");
//    valorInicial = scan.nextInt();
//
//    aux = valorInicial;
//    minutos = aux % 60;
//    System.out.println("Dividiendo aux, que vale: " + aux + " entre 60 da un resto de " + minutos);
//    aux = (aux - minutos) / 60;
//    System.out
//        .println("Si al valor anterior le quitamos el resto y lo dividimos entre 60 otra vez nos da una cantidad de  "
//            + aux + " horas totales");
//    horas = aux % 24;
//    System.out.println(
//        "Si calculamos el resto de dividir la cantidad total de horas entre 24 nos da las horas que nos quedarian al pasar a dias: "
//            + horas);
//    dias = (aux - horas) / 24;
//    System.out.println(
//        "Nos queda restarle a la cantidad de horas totales el resto anteriormente calculado y al dividirlo entre 24 nos da el numero de dias: "
//            + dias);
//
//  System.out.println(valorInicial + " Minutos son un total de:\n" + dias + " Dias, " + horas + " Horas y " + minutos + " Minutos.");
//  }
//
//}

//12.

//Dise�ar un algoritmo que lea del teclado tres n�meros enteros y escriba en pantalla un mensaje indicando si al menos dos de esos tres n�meros son pares.

//import java.util.Scanner;
//
//public class juja112 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a, b, c;
//
//		System.out.println("Introduzca el primer n�mero: ");
//		a = scan.nextInt();
//		System.out.println("Introduzca el segundo n�mero: ");
//		b = scan.nextInt();
//		System.out.println("Introduzca el tercer n�mero: ");
//		c = scan.nextInt();
//
//		if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
//			System.out.println("Los 3 n�meros son pares");
//
//		} else if (a % 2 == 0 && b % 2 == 0) {
//			System.out.println("El primer y el segundo n�mero son pares.");
//
//		} else if (b % 2 == 0 && c % 2 == 0) {
//			System.out.println("El segundo y el tercer n�mero son pares.");
//
//		} else if (a % 2 == 0 && c % 2 == 0) {
//			System.out.println("A y C son pares. ");
//
//		} else {
//			System.out.println("No hay dos n�meros pares. ");
//		}
//
//	}
//}

//13.

//Dise�ar un algoritmo, que dados dos n�meros, determine si su producto es positivo, nulo o
//negativo sin realizar el c�lculo. El algoritmo debe visualizar por pantalla uno de los siguientes mensajes:
//	* "El producto es negativo"
//	* "El producto es nulo"
//	* "El producto es positivo"
//Nota: Para resolver el problema no se debe calcular el producto.

//import java.util.Scanner;
//
//public class juja113 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int a, b;
//		System.out.println("Introduzca el primer factor a multiplicar: ");
//		a = scan.nextInt();
//		System.out.println("Introduzca el segundo factor a multiplicar: ");
//		b = scan.nextInt();
//			
//		if (a < 0 || b < 0) {
//			System.out.println("El producto es negativo.");
//		} else if (a == 0 || b == 0) {
//			System.out.println("El producto es nulo.");
//		} else if  (a > 0 || b > 0) {
//			System.out.println("El producto es positivo.");
//	}
//}
//}

//14.

//Dise�ar un algortmo que calcule la potencia x^y para dos n�meros naturales dados x e y, mediante una acuulaci�n sucesiva de productos.
//Previo al c�lculo, se verificar� que ambos valores sean positivos.

//import java.util.Scanner;
//
//public class juja114 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int x, y;
//		System.out.println("Introduzca el valor: ");
//		x = scan.nextInt();
//		System.out.println("Introduzca la potencia: ");
//		y = scan.nextInt();
//
//		while (x < 0 || y < 0) {
//			System.out.println("Introduzca valores positivos.");
//			System.out.println("Introduzca el valor: ");
//			x = scan.nextInt();
//			System.out.println("Introduzca la potencia: ");
//			y = scan.nextInt();
//		}
//		int potencia = x;
//		for (int i = y - 1; i > 0; i--) {
//			potencia = potencia * x;
//		}
//		System.out.println("El resultado es: " + potencia);
//	}
//}

//15.

//Dise�ar un algoritmo que lea una secuencia de 20 n�meros
//reales introducidos por teclado. Al acabar la secuencia, 
//debe mostar el valor m�ximo y el valor m�nimo introducidos.

//import java.util.Scanner;
//
//public class juja101 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//		int valor, mayor = 0, menor = 0, aux;
//
//		System.out.println("Introduzca el primer valor: ");
//
//		valor = scan.nextInt();
//
//		mayor = mayor + valor;
//
//		menor = menor + valor;
//
//		for (int i = 1; i <= 19; i++) {
//			System.out.println("Introduzca un nuevo valor: ");
//			valor = scan.nextInt();
//			if (valor < menor) {
//				menor = valor;
//
//			} else if (valor > mayor) {
//				mayor = valor;
//			}
//
//		}
//		System.out.println("El nuevo valor minimo es: " + menor);
//		System.out.println("El nuevo valor m�ximo es: " + mayor);
//
//	}
//
//}

//16.

//Dise�ar un algoritmo que pida al usuario un n�mero del 1 al 9 y le conteste diciendo si el n�mero es primo o no.
//Por ejemplo, si el usuario introduce un 4 tiene que mostrar el mensaje "El n�mero 4 no es primo". 
//Si el n�mero introducido es menor que 1 o mayor que 9 dar� un mensaje de error.

//import java.util.Scanner;
//
//public class juja101{
//	public static void main(String[]args) {
//		Scanner scan = new Scanner(System.in);
//		int valor;
//		System.out.println("Introduzca un valor: ");
//		valor = scan.nextInt();
//	
//		if (valor == 1||valor == 3 || valor == 5 || valor == 7) {
//			System.out.println("El valor es primo.");
//		} else if (valor== 2 || valor == 4 || valor == 6 || valor == 8 || valor == 9) {
//			System.out.println("El valor no es primo.");
//		} else if (valor<1 || valor>9) {
//			System.out.println("Error.");
//		}
//	}
//}

//17.

//Dise�ar un algoritmo que lea n�meros enteros positivos de teclado y s�lo acepte como v�lidos aquellos que sean 
//mayores que el anterior n�mero le�do. La entrada de datos finaliza cuando se introduzca el n�mero 0.

//import java.util.Scanner;
//
//public class juja101 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int valor, aux;
//
//		System.out.println("Introduzca un valor positivo: ");
//		valor = scan.nextInt();
//
//		System.out.println("Introduzca otro valor positivo: ");
//		aux = scan.nextInt();
//
//		if (valor < 0 || aux < 0) {
//			System.out.println("Ambos valores tienen que ser positivos.");
//		} else {
//			while (valor > 0 && aux > 0) {
//				if (aux > valor) {
//					System.out.println("V�lido.");
//					System.out.println("Introduzca otro valor positivo: ");
//					aux = scan.nextInt();
//					valor = aux;
//				} else {
//					System.out.println("Introduzca otro valor positivo: ");
//					aux = scan.nextInt();
//				}
//			}
//		}
//		if (aux == 0) {
//			System.out.println("FIN.");
//		}
//
//	}
//
//}

//18.

//Dise�ar un algoritmo que lea una lista de 10 n�meros enteros, visualice la suma de los n�meros pares de la lista, 
//cu�ntos pares existen y cu�l es la media aritm�rica de los n�meros impares.

//import java.util.Scanner;
//
//public class juja101 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int valor, sumapar = 0, n = 0, sumaimpar = 0, media = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			System.out.println("Introduzca un valor: ");
//			valor = scan.nextInt();
//			if (valor % 2 == 0) {
//				sumapar = valor + sumapar;
//				n = n + 1;
//
//			} else if (valor % 2 != 0) {
//				sumaimpar = valor + sumaimpar;
//				media = sumaimpar / 5;
//
//			}
//
//		}
//		System.out.println("La suma de los n�meros pares de la lista es: " + sumapar);
//		System.out.println("\nLa cantidad de n�meros pares que existen es: " + n);
//		System.out.println("\nLa media aritm�tica de los n�meros impares es: " + media);
//	}
//
//}

//19.

//Dise�ar un algoritmo que lea un conjunto de n�meros reales, los cuente y calcule y muestre la media, 
//varianza y desviaci�n t�pica del conjunto de n�meros. La media y varianza de los n�meros x1, x2, ..., xn 
//se pueden calcular usando las f�rmulas:


//import java.util.Scanner;
//
//public class juja101 {
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//
//	
//		double n1 = 5;
//		double sum=0;
//		double fact=0;
//		double aux;
//		double n2;
//		
//		
//		for( double i = n1-1 ;i>1;i--) {
//			aux = n1*i;
//			System.out.println("aux es: "+aux);
//			fact = aux*(i-1);
//			System.out.println("fact es: " +fact);
//			n1=aux;
//			System.out.println("n1 es: " + n1);
//	} System.out.println("fact1 es: " + fact);
//
//	
//		
//	System.out.println("final es: " +(1+(1/fact)));
//} 
//	}	
//		
		
	
		
		
//		for(double i = n1-2 ;i>1;i--) {
//		for( i = n1-1 ;i>1;i--) {
//			aux = n1*i;
//			System.out.println("aux es: " +aux);
//			fact = aux*(i-1);
//			System.out.println("fact es: " + fact);
//			n1=aux;
//			System.out.println("n1 es: " + n1);
//	} n1--;System.out.println("fact es: " + fact);
//		}
//			
	
//	System.out.println("el n�mero e es:" + (1+(1/fact)));




//import java.util.Scanner;
//
//public class juja101 {
//	public static void main(String[] args) {
//
//		int valor[] = new int[10];
//		
//		int sumatoria = 0;
//		float media = 0;
//		double varianza = 0.0;
//		double desviacion = 0.0;
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Introduzca 10 numeros. " );
//		
//		for (int i = 0; i < 10; i++) {
//			System.out.print("Ingrese el valor " + (i + 1) + ":");
//			valor[i] = scan.nextInt();
//			sumatoria += valor[i];
//		}
//		
//		scan.close();
//		
//		media = sumatoria / 10;
//		
//		for (int i = 0; i < 10; i++) {
//			double rango;
//			rango = Math.pow(valor[i] - media, 2f); // (valor[i] - media)^2
//			varianza = varianza + rango;
//		}
//		
//		varianza = varianza / 10f;
//		desviacion = Math.sqrt(varianza);
//		System.out.println("Media: " + media);
//		System.out.println("Varianza: " + varianza);
//		System.out.println("Desviaci�n T�pica: " + desviacion);
//	}
//}

//20.

//Dise�ar un algoritmo que lea un n�mero entero de teclado, visualice sus d�gitos y calcule la suma de los d�gitos que sean pares.
//Para extraer los d�gitos de un n�mero usaremos un bucle que divida el n�mero por 10 sucesivamente. El resto de cada divisi�n corresponde
//a cada uno de los d�gitos:

//
//import java.util.Scanner;
//
//public class juja101 {
//	
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int valor[] = new int[10];
//		
//		valor = scan.nextInt();
//	}
//	
//	}

