package main;

public class Producto {

	//Atributos superclase Producto:
	
	protected String name;
	protected double prize;
	
	//Constructor superclase Producto:
	
	public Producto(String name, double prize) {
		super();
		this.name = name;
		this.prize = prize;
	}
	
	//Getters y Setters superclase Producto:
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrize() {
		return this.prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	//toString superclase Producto:
	
	public String toString() {
		return "El producto " + this.name + " con un precio de " + this.prize + " € ";
	}	
	
	//Método calcular superclase Producto:
	
	public double calcular(int amount) {
		return this.prize * amount;
	}
}
