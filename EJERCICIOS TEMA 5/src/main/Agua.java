package main;

public class Agua extends Almacen{

	//Atributos clase Agua:
	
	private String origin;
	
	//Constructor:
	
	public Agua(int id, int liters, double price, String brand, int sugarPercentage, boolean promotion, String origin) {
		super(id, liters, price, brand);
		this.origin = origin;
	}
	
	//Setters y Getters clase Agua:
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	
}
