import java.util.ArrayList;
import java.util.Scanner;

public class main {

	private static void ejercicio1() {

		// Objetos Ejercicio1:

		Libro libro1 = new Libro("1212123131455", "Ken Follet", "Los Pilares de la Tierra", 502);
		Libro libro2 = new Libro("4141251245123", "Tolkien", "El hobbit", 450);

		// Mostramos su estado:

		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		// Modificamos el atributo NumPags del libro1:

		libro1.setNumPags(299);
		System.out.println(libro1.toString());

		// Comparamos quien tiene mas paginas:

		if (libro1.getNumPags() > libro2.getNumPags()) {
			System.out.println(libro1.getTitulo() + " tiene m�s p�ginas.");
		} else {
			System.out.println(libro2.getTitulo() + " tiene m�s p�ginas.");
		}
	}

	private static void ejercicio2() {

		Scanner scan = new Scanner(System.in);

		String nombre, numero;
		double tipo, importe;

		// Objeto cuenta1 sin par�metros (ejecu�ndo el constructor por defecto):

		Cuenta cuenta1 = new Cuenta();

		System.out.print("Nombre: ");
		cuenta1.setNombre_Cliente(scan.nextLine());
		System.out.print("N�mero de cuenta: ");
		cuenta1.setNumero_Cuenta(scan.nextLine());
		System.out.print("Tipo de inter�s: ");
		cuenta1.setTipo_Interes(scan.nextDouble());
		System.out.print("Saldo: ");
		cuenta1.setSaldo(scan.nextInt());

		// Objeto cuenta2 con par�metros:

		Cuenta cuenta2 = new Cuenta("Paco", "94712123123513", 12.3, 543);

		Cuenta cuenta3 = new Cuenta(cuenta1);

		// INGRESO

		System.out.print("Introduzca el valor del Ingreso: ");
		cuenta2.Ingreso(scan.nextInt());

		// REINTEGRO

		System.out.print("Introduzca el valor del Reintegro: ");
		cuenta2.Reintegro(scan.nextInt());

		// TRANSFERENCIA

		System.out.print("Introduzca el importe de la transferencia: ");

		cuenta1.Transferencia(cuenta2, scan.nextDouble());

		// CUENTA 1 y 2

		System.out.println(cuenta1.toString());
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());
	}

	private static void ejercicio3() {

		Contador contador1 = new Contador(0);

		System.out.println(contador1.toString());

		contador1.incrementar();

		System.out.println(contador1.toString());

		contador1.decrementar();

		System.out.println(contador1.toString());
	}

	private static void ejercicio4() {

		Fracciones fraccion1 = new Fracciones(8, 16);

		Fracciones fraccion2 = new Fracciones(14, 2);

		Fracciones fraccion3 = new Fracciones();

		// Operaciones

		Fracciones suma = fraccion1.sumar(fraccion2);
		Fracciones resta = fraccion1.restar(fraccion2);
		Fracciones multiplicacion = fraccion1.multiplicar(fraccion2);
		Fracciones division = fraccion1.dividir(fraccion2);

		// Resultados

		System.out.println(fraccion1.toString());
		System.out.println(fraccion2.toString());
		System.out.println(fraccion3.toString());
		System.out.println(suma);
		System.out.println(resta);
		System.out.println(multiplicacion);
		System.out.println(division);
	}

	private static void ejercicio5() {
		Scanner scan = new Scanner(System.in);

		String nombre, nif;
		int irpf, horasExtra, numHijos;
		boolean casado;
		double sueldoBase, importeHoraExtra;

		Empleado empleado1 = new Empleado("35567493-R", "Carlito", 999, 14, 2, 2.3, true, 12);
		Empleado empleado2 = new Empleado();

		Empleado[] arrayEmpleados;
		System.out.println("Introduzca la cantidad de empleados que el programa ha de tratar: ");

		System.out.println("Introduzca el DNI del empleado: ");
		empleado1.setNif(nif = scan.next());
		System.out.print("Introduzca el nombre del empleado: ");
		empleado1.setNombre(nombre = scan.nextLine());
		System.out.print("Introduzca el sueldo base del empleado: ");
		empleado1.setSueldoBase(sueldoBase = scan.nextDouble());
		System.out.println("Introduzca la cantidad de horas extra hechas este mes por el empleado: ");
		empleado1.setHoraExtraMes(horasExtra = scan.nextInt());
		System.out.println("Introduzca la cantidad de hijos del empleado: ");
		empleado1.setNumHijos(numHijos = scan.nextInt());
		System.out.println("teclee 'true', si el empleado est� casado, o 'false' si no est� casado: ");
		empleado1.setCasado(casado = scan.nextBoolean());
		System.out.println("Introduzca el porcentaje de irpf del empleado: ");
		empleado1.setIrpf(irpf = scan.nextInt());

		System.out.println(empleado1.toString());
		System.out.println(empleado2.toString());

		System.out.println(
				"El complemento calculado de '" + horasExtra + "' horas extra a: '" + empleado1.getImporteHorasExtra()
						+ "' euros/hora es: " + empleado1.complementoHorasExtra() + " euros.");
		System.out.println("El sueldo Bruto es: " + empleado1.sueldoBruto());
		System.out.println("El irpf final es: " + empleado1.retenciones());

	}

	private static void ejercicio6() {
		NIF nif1 = new NIF(35584753);
		System.out.println(nif1.toString());
		System.out.println(nif1.leer());
	}
	
	private static void ejercicio7() {
		 Fecha fecha1 = new Fecha(1,6,1995);
		 System.out.println(fecha1.toString());
//		 System.out.println(fecha1.diaSiguiente(1, 6, 1995));
	}

	private static void ejercicio8() {

		Personas persona1 = new Personas();
		persona1.leerPersonas();
		
	}
	
	public static void main(String[] args) {

//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
		ejercicio8();
	}
}
