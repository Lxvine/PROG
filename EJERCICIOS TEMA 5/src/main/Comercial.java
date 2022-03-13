package main;

public class Comercial extends Empleado{

	//Atributos subclase Comercial:
	
	private double comission;
	
	//Constructor subclase Comercial:

	public Comercial(String name, int age, double salary, double comission) {
		super(name, age, salary);
		this.comission = comission;
	}
	
	//Getters y Setters:
	
	public double getComission() {
		return this.comission;
	}
	
	public void setComission(double comission) {
		this.comission = comission;
	}
	
	//toString subclase Comercial:
	
	@Override
	public String toString() {
		return super.toString() +  " y una comisi�n de " + this.comission + " �.";
	}	
	
	//M�todo plus subclase Comercial:
	
	public void plus() {
		if (super.age > 30 && comission > 200) {
			super.setSalary(super.getSalary() + super.PLUS);
			System.out.println("\nSe le a�ade el plus al empleado: " + super.getName() + ".\n");
		} 
	}
}
