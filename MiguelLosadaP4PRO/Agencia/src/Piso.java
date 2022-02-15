import java.util.ArrayList;

public class Piso {

    //Atributos clase Piso:

    private Direccion direccion;
    private int id = 0, m2;
    private double precio;
    private ArrayList<Estado> estado;

    //Constructor clase Piso:

    public Piso(Direccion direccion, int id, int m2, double precio, ArrayList<Estado> estado) {
        this.direccion = direccion;
        this.id = id;
        this.m2 = m2;
        this.precio = precio;
        this.estado = estado; 
    }

    //Getters clase Piso:

    public Direccion getDireccion() {
        return this.direccion;
    }

    public int getId() {
        return this.id;
    }

    public int getM2() {
        return this.m2;
    }

    public double getPrecio() {
        return this.precio;
    }
    
    public ArrayList<Estado> getEstado(){
    	return this.estado;
    }

    //Setters clase Piso:

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setEstado(ArrayList<Estado> estado) {
    	this.estado = estado;
    }
    
    //Método toString clase Piso:

    @Override
    public String toString() {
    	return "\nID: " + getId() + ".\n" + "Dirección: " + getDireccion() + "\n" + "Metros Cuadrados: " 
    + getM2() + " m2.\n" + "Precio: " + getPrecio() + " €.\n" + "Estado: " + getEstado() + ".";
    }
}

