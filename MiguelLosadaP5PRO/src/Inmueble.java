import java.util.ArrayList;

public class Inmueble implements Taxeable{

	// Atributos superclase Inmueble:

	private int id, numHab;
	private Direccion direccion;
	private double m2, precioVenta, precioAlquiler;
	private ArrayList<Estado> estado;
	private boolean garaje;

	// Constructor superclase Inmueble:

	public Inmueble(Direccion direccion, int id, int numHab, double m2, double precioVenta, double precioAlquiler,
			ArrayList<Estado> estado, boolean garaje) {
		this.direccion = direccion;
		this.id = id;
		this.numHab = numHab;
		this.m2 = m2;
		this.precioVenta = precioVenta;
		this.precioAlquiler = precioAlquiler;
		this.estado = estado;
		this.garaje = garaje;
	}

	// Constructor por defecto superclase Inmueble:

	public Inmueble() {
		this.direccion = direccion;
		this.id = 0;
		this.numHab = 0;
		this.m2 = 0;
		this.precioVenta = 0;
		this.precioAlquiler = 0;
		this.garaje = true;
	}

	// Getters y Setters subclase Inmueble:

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumHab() {
		return numHab;
	}

	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getPrecioAlquiler() {
		return precioAlquiler;
	}

	public void setPrecioAlquiler(double precioAlquiler) {
		this.precioAlquiler = precioAlquiler;
	}

	public ArrayList<Estado> getEstado() {
		return estado;
	}

	public void setEstado(ArrayList<Estado> estado) {
		this.estado = estado;
	}

	public boolean isGaraje() {
		return garaje;
	}

	public void setGaraje(boolean garaje) {
		this.garaje = garaje;
	}

	// Método toString superclase Inmueble:

	@Override
	public String toString() {

        String toRet = "con ID " + id + ":\n\tDireccion: " + direccion + "\n\tNumero de habitaciones: " + numHab  + ".\n\tTamaño en m2: "
                + m2 + " m2.\n\tEstado: " + estado ;

        if (precioVenta > 0.0) {
            toRet += "\n\tPrecio de venta: " + precioVenta + " €.";
        } if (precioVenta != 0) {
			toRet += "\n\tEl precio de la venta con impuestos es: " + sumImpuestosVenta() + " €.";
		} if (precioAlquiler > 0.0) {
            toRet += "\n\tPrecio de alquiler: " + precioAlquiler + " €.";
		} if (precioAlquiler !=0) {
			toRet += "\n\tEl precio del alquiler con impuestos es: " + sumImpuestosAlquiler() + " €.";
		}

        if (garaje) {
            toRet += ".\n\tPosee garaje.";
        }

        return toRet;

    }
	
	public double sumImpuestosVenta() {
		double preciofinal = getPrecioVenta()+(getPrecioVenta()*ITP/100)+(getPrecioVenta()*IVA/100);
		Math.round(preciofinal);
		return Math.round(preciofinal);
	}
	
	public double sumImpuestosAlquiler() {
		double preciofinal = getPrecioAlquiler()+(getPrecioAlquiler()*ITP/100)+(getPrecioAlquiler()*IVA/100);
		return Math.round(preciofinal);
	}
	

}
