package main;

public class Bebida {

	//Atributos clase Bebida:
	
		private static int localID = 1;
	
		protected int id, liters;
		protected double price;
		protected String brand;
		
		//Constructor:
		
		public Bebida(int liters, double price, String brand) {
			super();
			this.id = localID++;
			this.liters = liters;
			this.price = price;
			this.brand = brand;
		}
		
		//Setters y Getters clase Bebida:
		
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
		
		//toString clase Bebida:
		
		@Override
		public String toString() {
			return "uwu";
		}
		
}
