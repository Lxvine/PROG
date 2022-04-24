import java.util.ArrayList;

public class Piso extends Inmueble{

    //Atributos subclase Piso:

	private int numPiso;
	private char puerta;
	private boolean estudio;
	
	//Constructor subclase Piso:
	
	public Piso(Direccion direccion, int id, int numHab, double m2, double precioVenta, double precioAlquiler,
			ArrayList<Estado> estado, boolean garaje, int numPiso, char puerta, boolean estudio) {
		super(direccion, id, numHab, m2, precioVenta, precioAlquiler, estado, garaje);
		this.numPiso = numPiso;
		this.puerta = puerta;
		if(numHab==1) {
			this.estudio = true;
		} else {
			this.estudio = false;
		}

	}
	
	//Constructor vacío subclase Piso:
	
	public Piso() {
		super();
	}

	//Getters y Setters subclase Piso:

	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		this.numPiso = numPiso;
	}

	public char getPuerta() {
		return puerta;
	}

	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}

	public boolean isEstudio() {
		return estudio;
	}

	public void setEstudio(boolean estudio) {
		this.estudio = estudio;
	}

	//Método toString subclase Piso:
	
	@Override
	public String toString() {
		String toRet = "\nEl Piso " +super.toString() + "\n\tNúmero del piso: " + numPiso + ".\n\tPuerta: " + puerta +".";
		
		if(getNumHab()==1) {
			toRet += "\n\tEs un estudio.";
		} 
		
		return toRet;
	}
	
}

