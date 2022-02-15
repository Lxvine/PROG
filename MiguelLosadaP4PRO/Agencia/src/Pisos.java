import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Pisos {

    private ArrayList<Piso> pisos = new ArrayList<>();

    public ArrayList<Piso> generarPisos() {
        ArrayList<Piso> pisos = new ArrayList<>();
        pisos.add(new Piso("Calle de Sanjurjo Badía 11, 3º- B. 36201 Vigo.", 4, 43, 367.80));
        pisos.add(new Piso("Plaza de la estrella 25, 1º- C. 36202 Vigo.", 2, 52, 320.00));
        pisos.add(new Piso("Calle de Urzáiz 16, 5º- D. 36201 Vigo.", 5, 81, 490.10));
        pisos.add(new Piso("Calle Álvaro Cunqueiro 5, 3º- C. 36204 Vigo.", 6, 79, 210400.00));
        pisos.add(new Piso("Calle Alexandre Bóveda 1, 6º- A. 36203 Vigo.", 7, 132, 370300.33));
        pisos.add(new Piso("Plaza del rey 12, 3º- B. 36202 Vigo.", 1, 103, 400.20));
        pisos.add(new Piso("Calle Alcalde Gregorio Espino 11, 1º- D. 36202 Vigo.", 8, 128, 301200.70));
        pisos.add(new Piso("Calle Luis Taboada 15, 2º- C. 36201 Vigo.", 9, 97, 240000.20));
        pisos.add(new Piso("Plaza de la Princesa 7, 1º- A. 36202 Vigo.", 3, 66, 389.10));
        pisos.add(new Piso("Calle Areal 18, 7º- B. 36201 Vigo.", 10, 44, 157800.90));
        return pisos;
    }

    public void añadePiso(){
        Scanner scan = new Scanner (System.in);

        Piso piso = new Piso();

        generarPisos();

        System.out.println("A continuación se va a añadir un nuevo piso al archivo.");
        System.out.println("Introduzca la dirección del piso a añadir: ");
        piso.setDireccion(scan.nextLine());
        piso.setId(piso.size(+1)));
        System.out.println("Introduzca los metros cuadrados del piso: ");
        piso.setPrecio(scan.nextInt());
        System.out.println("Introduzca el precio del piso: ");
        piso.setPrecio(scan.nextDouble());

        pisos.add(piso);

        mostrar();
    }

    public void mostrar() {
        ArrayList<Piso> autoPiso = generarPisos();
        for (int i = 0; i < autoPiso.size(); i++) {
            System.out.println(generarPisos().get(i).getDireccion());
        }
    }

}
