package main;

public class Repartidor extends Empleado{

	//Atributos subclase Repartidor:
	
	private String zone;
	
	//Constructor subclase Repartidor:
	
	public Repartidor(String name, int age, double salary, String zone) {
		super(name, age, salary);
		this.zone = zone;
	}
	
	//Getters y Setters subclase Repartidor:
	
	public String getZone() {
		return zone;
	}
	
	public void setZone(String zone) {
		this.zone = zone;
	}
	
	//M�todo toString subclase Repartidor:
	
	@Override
	public String toString() {
		return super.toString() +  " y reparte en la " + this.zone + ".";
	}
	
	//M�todo plus subclase Repartidor:
	
	public void plus() {
		if (super.getAge() < 25 && this.zone.equals("zona 3")) {
			super.setSalary(super.getSalary() + super.PLUS);
			System.out.println("\nSe le a�ade el plus al empleado: " + super.getName() + ".\n");
		} 
	}
}
