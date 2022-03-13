package main;

public class NoPerecedero extends Producto{

	public String type;
	
	//Constructor subclase noPerecedero:
	
	public NoPerecedero(String name, double prize, String type) {
		super(name, prize);
		this.type = type;
	}
	
	//Getters y Setters:
	
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	//toString subclase NoPerecedero:
	
	public String toString() {
		return super.toString() + "es de tipo " + this.type;
	}
	
	//Método calcular subclase NoPerecedero:
	
	public double calcular(int amount) {
		return super.getPrize() * amount;
	}
}
