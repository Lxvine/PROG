import java.util.ArrayList;

public class Piso extends Inmueble{

    //Atributos subclase Piso:

	private int numPîso;
	private char puerta;
	private boolean estudio;
	
	//Constructor subclase Piso:
	
	public Piso(Direccion direccion, int id, int numHab, double m2, double precioVenta, double precioAlquiler,
			ArrayList<Estado> estado, boolean garaje, int numPiso, char puerta, boolean estudio) {
		super(direccion, id, numHab, m2, precioVenta, precioAlquiler, estado, garaje);
		this.numPîso = numPiso;
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

	public int getNumPîso() {
		return numPîso;
	}

	public void setNumPîso(int numPîso) {
		this.numPîso = numPîso;
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
		String toRet = "\nEl Piso " +super.toString() + "\n\tNúmero del piso: " + numPîso + ".\n\tPuerta: " + puerta +".";
		
		if(estudio) {
			toRet += "\n\tEs un estudio.";
		}
		
		return toRet;
	}
	
}

