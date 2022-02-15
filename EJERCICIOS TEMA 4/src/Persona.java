import java.util.Calendar;

public class Persona {

	// Atributos

	private String nombre, direccion, ciudad;
	private int codigoPostal;
	private Fecha fechaNacimiento;

	// Constructor:

	public Persona() {
		this.nombre = "";
		this.direccion = "";
		this.ciudad = "";
		this.codigoPostal = 0;
		this.fechaNacimiento = new Fecha();
	}

	// Getters:

	public String getNombre() {
		return this.nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public String getCiudad() {
		return this.ciudad;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public Fecha getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	// Setters:

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public void setFechaNacimiento(Fecha fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public boolean esMayorDeEdad() {

		Calendar cal = Calendar.getInstance();
		if (cal.get(Calendar.YEAR) - fechaNacimiento.getAnho() == 18) {
			if (cal.get(Calendar.MONTH) - fechaNacimiento.getMes() == 0) {
				if (cal.get(Calendar.DATE) - fechaNacimiento.getDia() < 0) {
					return false;
				} else {
					return true;
				}
			} else if (cal.get(Calendar.MONTH) - fechaNacimiento.getMes() > 0) {
				return true;
			} else
				return false;

		} else if (cal.get(Calendar.YEAR) - fechaNacimiento.getAnho() > 18) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		String toret = "Nombre: " + getNombre() + "\nFecha Nacimiento:  " + getFechaNacimiento() + "\nDireccion: "
				+ getDireccion() + "\n" + getCodigoPostal() + " " + getCiudad();
		return toret;
	}
}
