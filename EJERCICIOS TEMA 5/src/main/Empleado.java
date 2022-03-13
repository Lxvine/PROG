package main;

//Ejercicio 3 - Superclase Empleado:

public abstract class Empleado {

	//Atributos clase padre Empleado:
	
	protected String name;
	protected int age;
	protected double salary;
	
	protected final int PLUS = 300;
	
	//Constructor Empleado: 
	
	public Empleado(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	//Getters y Setters Empleado:
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	//toString clase Empleado:
	
	@Override
	public String toString() {
		return "El/la empleado/a " + this.name + " de " + this.age + " años de edad cobra un salario de " + this.salary + " €"; 
	}
	
	//Método abstracto que obliga a las subclases de la clase Empleado a implementar esta función.
	
	public abstract void plus();
}
