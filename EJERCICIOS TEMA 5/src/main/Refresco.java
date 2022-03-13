package main;

public class Refresco extends Almacen{

	//Atributos clase Refresco:
	
	private int  sugarPercentage;
	private boolean promotion;
	
	//Constructor clase Refresco:
	
	public Refresco(int id, int liters, double price, String brand, int sugarPercentage, boolean promotion) {
		super(id, liters, price, brand);
		this.sugarPercentage = sugarPercentage;
		this.promotion = promotion;
	}
	
	//Setters y getters subclase refresco:
	
	public int getSugarPercentage() {
		return sugarPercentage;
	}
	public void setSugarPercentage(int sugarPercentage) {
		this.sugarPercentage = sugarPercentage;
	}
	
	public boolean getPromotion() {
		return promotion;
	}
	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}
	
	
}
