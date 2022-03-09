
//Ejercicio 3 - Superclase Empleado:

public class Empleado {

	//Atributos clase padre Empleado:
	
	protected String name;
	protected int age;
	protected double salary;
	protected final int PLUS = 300;
	
	//Constructor Empleado: 
	
	void Empleado(String name, int age, double salary) {
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

	public void setSalary() {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "El empleado " + this.name + " de " + this.age + " años cobra un salario de " + this.salary + " €."; 
	}
}
