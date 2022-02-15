import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personas {

    //Declaración del ArrayList "personas"

    private List<Persona> personas = new ArrayList<>();

    void leerPersona() {
        Scanner scan = new Scanner(System.in);

        Persona persona = new Persona();

        System.out.println("Introduzca el nombre de la persona: ");
        persona.setNombre(scan.nextLine());
        System.out.println("Introduzca la dirección de la persona: ");
        persona.setDireccion(scan.nextLine());
        System.out.println("Introduzca la ciudad de residencia de la persona: ");
        persona.setCiudad(scan.nextLine());
        System.out.println("Introduzca el Código Postal de la persona en cuestión: ");
        persona.setCodigoPostal(scan.nextInt());

        System.out.println("A continuación se pide la fecha de Nacimiento: ");
        System.out.println("Introduzca el día de nacimiento:");
        persona.getFechaNacimiento().setDia(scan.nextInt());
        System.out.println("Introduzca el mes de nacimiento: ");
        persona.getFechaNacimiento().setMes(scan.nextInt());
        System.out.println("Introduzca el año de nacimiento: ");
        persona.getFechaNacimiento().setAnho(scan.nextInt());

        personas.add(persona);
    }

    void leerPersonas() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de personas a tratar: ");

        int x = scan.nextInt();

        while (x == 0) {
            System.out.println("La cantidad debe ser mayor a 0. \nIntroduzca la cantidad de personas a tratar: ");
            x = scan.nextInt();
        }

        for (int i=0; i<x; i++) {
            leerPersona();

        }
    }

    void mostrar() {
        for (int i)
    }

}
