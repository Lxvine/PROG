package main;

public class Agua extends Bebida{

	//Atributos clase Agua:
	
	private String origin;
	
	//Constructor:
	
	public Agua(int liters, double price, String brand, int sugarPercentage, boolean promotion, String origin) {
		super(liters, price, brand);
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
