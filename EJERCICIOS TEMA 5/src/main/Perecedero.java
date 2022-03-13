package main;

public class Perecedero extends Producto{

	//Atributos subclase Perecedero:
	
	public int daysToExpire;	
	
	//Constructor subclase Perecedero:

	public Perecedero(String name, double prize, int daysToExpire) {
		super(name, prize);
		this.daysToExpire = daysToExpire;
	}
	
	//Getters y Setters subclase Perecedero:
	
	public int getDaysToExpire() {
		return this.daysToExpire;
	}
	
	public void setDaysToExpire(int daysToExpire) {
		this.daysToExpire = daysToExpire;
	}
	
	//toString subclase Perecedero:

	public String toString() {
		return super.toString() + " caduca en " + this.daysToExpire + " días.";
	}
	
	//Método calcular subclase Perecedero:
	
	public double calcular(int amount) {
		if(daysToExpire == 1) {
			return super.getPrize()/4;
		} else if (daysToExpire == 2) {
			return super.getPrize()/3;
		} else return super.getPrize()/2;
	}
	
}
