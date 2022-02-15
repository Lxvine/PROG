import java.util.Scanner;
import java.util.Arrays;

public class Main {

    //1.

    public static int[] randomUni() {
        Scanner scan = new Scanner(System.in);
        int tamaño;
        System.out.println("Introduzca el tamaño del vector: ");
        tamaño = scan.nextInt();

        while (tamaño <= 0) {
            System.out.println("El valor del tamaño del vector debe ser positivo: ");
            tamaño = scan.nextInt();
        }

        int matriz[] = new int[tamaño];
        System.out.print("[ ");
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int) (Math.random() * 100);
            System.out.print(matriz[i] + " ");
        }

        System.out.println("]");
        return matriz;
    }

    public static int busqueda(int vector[], int elemento) {
        int posicion = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == elemento) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }

    //2.

    public static int[][] randomBi(int tamaño) {

        int matriz[][] = new int[tamaño][tamaño];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                System.out.print(matriz[i][j] + " ");
            }
        }
        return matriz;
    }

    public static boolean puntosilla(int vector[][], int fil, int col) {
        int toCheck = vector[fil][col];
        boolean maxFila = true;
        boolean minColumna = true;
        System.out.print("\nFila: \n");
        for (int i = 0; i < vector[fil].length; i++) {
            System.out.print(vector[fil][i] + " ");
            if (toCheck < vector[fil][i]) {
                maxFila = false;
            }
        }
        System.out.println("\n\nColumna: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i][col] + "\n");
            if (toCheck > vector[i][col]) {
                minColumna = false;
            }
        }
        if (maxFila && minColumna) {
            return true;
        }
        System.out.println("");
        return false;
    }

    //3.

    public static void nombre() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca su nombre, la primera letra de su segundo nombre y su primer apellido: ");
        String nombre = scan.nextLine();

        String name[] = nombre.split(" ");
        String aux[] = new String[name.length];
        aux[0] = name[name.length - 1];

        for (int i = 0; i < name.length - 1; i++) {
            aux[i + 1] = name[i].substring(0, 1);
        }
        String dev = "";
        boolean first = true;
        for (String s : aux) {
            if (first) {
                dev += s + ", ";
                first = false;
            } else {
                dev += s + ". ";
            }
        }
        System.out.println(dev);

    }

    public static void menu() {

        Scanner scan = new Scanner(System.in);
        char opcion = 'z';

        while (opcion != 'd') {
            System.out.println("################### BIENVENIDO/A: ###################\n\n"
                    + "Este programa permite ejecutar 4 opciones: \n"
                    + "A) Búsqueda en un vector de un determinado valor y devolverá su posición.\n"
                    + "B) Determinar si el elemento que queremos buscar dentro de una matriz es un punto silla.\n"
                    + "C) Producirá el formato siguiente: Apellido, Primera letra del nombre seguida de un punto y/o Primera letra del segundo nombre seguida de otro punto):\n"
                    + "D) El programa finalizará.\n\n"
                    + "A continuación, introduzca la opción deseada (A, B, C o D): ");

            opcion = scan.next().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':

                    int elemento;
                    System.out.println("Introduzca el elemento a buscar: ");
                    elemento = scan.nextInt();
                    while (elemento < 0) {
                        System.out.println("El elemento no puede ser negativo.\nIntroduzca un elemento positivo: ");
                        elemento = scan.nextInt();
                    }
                    int matriz[] = randomUni();
                    busqueda(matriz, elemento);

                    if (busqueda(matriz, elemento) == -1) {
                        System.out.println("\nEl elemento no se encuentra en el vector.\n");
                    } else {
                        System.out.println("El elemento (" + elemento + ") se encuentra en la posición nº " + (busqueda(matriz, elemento)) + ".");
                    }
                    break;

                case 'b':
                    int tamaño;

                    System.out.println("Introduzca la dimensión de la matriz (al ser cuadrada solo se solicita un valor): ");
                    tamaño = scan.nextInt();

                    while (tamaño <= 0) {
                        System.out.println("La dimensión de la matriz debe ser positivo: ");
                        tamaño = scan.nextInt();
                    }

                    int matriz2[][] = randomBi(tamaño);

                    System.out.print("\n");
                    char repe = 's';

                    do {

                        System.out.println("\nIntroduzca la posición en la fila: ");
                        int fil = scan.nextInt();

                        while (fil < 0 || fil >= tamaño) {
                            System.out.println("\nEl valor de la posición en la fila debe ser positivo y no debe ser igual ni exceder el tamaño de la matriz: ");
                            fil = scan.nextInt();
                        }

                        System.out.println("\nIntroduzca la posición en la columna: ");
                        int col = scan.nextInt();

                        while (col < 0 || col >= (tamaño)) {
                            System.out.println("El valor de la posición en la columna debe ser positivo y no debe ser igual ni exceder eel tamaño de la matriz: ");
                            col = scan.nextInt();
                        }

                        if (puntosilla(matriz2, fil, col) == true) {
                            System.out.println("El valor almacenado en esa posición es un punto silla.");
                        } else {
                            System.out.println("El valor almacenado en esa posición NO es un punto silla.");
                        }

                        System.out.println("\nSi desea volver a comprobar otro elemento introduzca el caracter 's', si no lo desea introduzca cualquier otro caracter:");
                        repe = scan.next().charAt(0);
                    } while (repe == 's');
                    break;

                case 'c':
                    nombre();
                    break;

                case 'd':
                    System.out.println("El programa ha finalizado. ");
                    break;

                default:
                    System.out.println("Seleccione una opción correcta: (A, B, C o D).\n");
            }
        }

    }

    public static void main(String[] args) {

        menu();
    }
}




