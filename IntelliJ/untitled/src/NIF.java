import java.util.Scanner;

public class NIF {

    Scanner scan = new Scanner(System.in);

    // Atributos:

    public int nif;
    public char letra;

    // Constructor vacío:

    public NIF() {
        this.nif = 0;
        this.letra = 'a';
    }

    // Contructor parámetros (apartado b):

    public NIF(int nif) {
        this.nif = nif;
        this.letra = letra(nif);
    }

    // Getters:

    public int getNif() {
        return this.nif;
    }

    public char getLetra() {
        return this.letra;
    }

    // Setters:

    public void setNif(int nif) {
        this.nif = nif;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public char leer() {

        System.out.println("Introduzca los 8 dígitos del DNI: ");
        String dni = scan.next();

        while (dni.length() < 8 || dni.length() > 8) {
            System.out.println("Los dígitos del DNI no son correctos. Introduzca de nuevo los 8 dígitos del DNI: ");
            dni = scan.next();
        }

        return letra(Integer.parseInt(dni));

    }

    private char letra(int dni) {
        char array[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };

        int uwu = dni % 23;

        char letra = array[uwu];

        return letra;
    }

    public String toString() {
        return getNif() + "-" + getLetra();
    }

}
