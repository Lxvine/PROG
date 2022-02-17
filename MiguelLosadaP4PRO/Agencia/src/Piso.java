import java.util.ArrayList;

public class Piso {

    //Atributos clase Piso:

    private Direccion direccion;
    private int id = 0, m2;
    private double precioVenta, precioAlquiler;
    private ArrayList<Estado> estado;

    //Constructor clase Piso:

    public Piso(Direccion direccion, int id, int m2, double precioVenta, double precioAlquiler, ArrayList<Estado> estado) {
        this.direccion = direccion;
        this.id = id;
        this.m2 = m2;
        this.precioVenta = precioVenta;
        this.precioAlquiler = precioAlquiler;
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

    public double getPrecioVenta() {
        return this.precioVenta;
    }
    
    public double getPrecioAlquiler() {
    	return this.precioAlquiler;
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

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public void setPrecioAlquiler(double precioAlquiler) {
    	this.precioAlquiler = precioAlquiler;
    }
    
    public void setEstado(ArrayList<Estado> estado) {
    	this.estado = estado;
    }
    
    //Método toString clase Piso:

    @Override
    public String toString() {
    	return "\nID: " + getId() + ".\n" + "Dirección: " + getDireccion() + "\n" + "Metros Cuadrados: " 
    + getM2() + " m2.\n" + "Precio de venta: " + getPrecioVenta() + " €." + "\nPrecio de alquiler: " + getPrecioAlquiler() + " €.\n" + "Estado: " + getEstado() + ".";
    }
}

