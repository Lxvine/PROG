import java.util.ArrayList;

public class Casa extends Inmueble{

	//Atributos subclase Casa:
	
	private boolean piscina, jardin;
	
	//Constructor subclase Casa:
	
	public Casa(Direccion direccion, int id, int numHab, double m2, double precioVenta, double precioAlquiler,
			ArrayList<Estado> estado, boolean garaje, boolean piscina, boolean jardin) {
		super(direccion, id, numHab, m2, precioVenta, precioAlquiler, estado, garaje);
		this.piscina = piscina;
		this.jardin = jardin;
	}	
	
	//Constructor vacío subclase Casa:
	
	public Casa() {
		super();
	}

	//Getters y Setters subclase Casa:
	
	public boolean isPiscina() {
		return piscina;
	}
	
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	
	public boolean isJardin() {
		return jardin;
	}
	
	public void setJardin(boolean jardin) {
		this.jardin = jardin;
	}

	//Método toString subclase Casa:
	
	@Override
	public String toString() {
		String toRet = "\nLa Casa " + super.toString();
		
		if (piscina) {
			toRet += "\n\tPosee piscina.";
		} if (jardin) {
			toRet += "\n\tPosee jardín.";
		} 
		
		return toRet;
	}
	
}
