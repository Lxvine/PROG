package main;

public class Almacen {
	
	//Atributos clase Almacén:
	
	private int id, liters;
	private double price;
	private String brand;
	
	//Constructor:
	
	public Almacen(int id, int liters, double price, String brand) {
		super();
	}
	
	//Setters y Getters clase Almacén:
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLiters() {
		return liters;
	}
	public void setLiters(int liters) {
		this.liters = liters;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	

}
