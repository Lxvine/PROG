 
public class Empleado {

	// ATRIBUTOS:

	private String nif, nombre;
	private int horasExtraMes, numHijos, irpf;
	private double sueldoBase;
	private boolean casado;
	private static double importeHoraExtra;

	// CONSTRUCTOR vac�o:

	public Empleado() {
		nif = "";
		this.nombre = "";
		this.sueldoBase = 0.0;
		this.horasExtraMes = 0;
		this.numHijos = 0;
		this.irpf = 0;
		this.casado = false;
		this.importeHoraExtra = 13.4;
	}

	// CONSTRUCTOR con par�metros:

	public Empleado(String nif, String nombre, int sueldoBase, int horasExtraMes, int numHijos, double irpf,
			boolean casado, double importeHoraExtra) {
		this.nif = nif;
		this.nombre = "";
		this.sueldoBase = 0.0;
		this.horasExtraMes = 0;
		this.numHijos = 0;
		this.irpf = 0;
		this.casado = false;
		this.importeHoraExtra = 10.9;
	}

	// GETTERS:

	public String getNif() {
		return this.nif;
	}

	public String getNombre() {
		return this.nombre;
	}

	public double getSueldoBase() {
		return this.sueldoBase;
	}

	public int getHorasExtraMes() {
		return this.horasExtraMes;
	}

	public int getNumHijos() {
		return this.numHijos;
	}

	public int getIrpf() {
		return this.irpf;
	}

	public boolean isCasado() {
		return this.casado;
	}

	public double getImporteHorasExtra() {
		return this.importeHoraExtra;
	}

	// SETTERS:

	public void setNif(String nif) {
		this.nif = nif;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public void setHoraExtraMes(int horasExtraMes) {
		this.horasExtraMes = horasExtraMes;
	}

	public void setNumHijos(int numHijos) {
		this.numHijos = numHijos;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public void setImporteHoraExtra(int importeHoraExtra) {
		this.importeHoraExtra = importeHoraExtra;
	}

	public double complementoHorasExtra() {
		return this.horasExtraMes * Empleado.importeHoraExtra;
	}
	
	public double sueldoBruto() {
		return getSueldoBase() + complementoHorasExtra();
	}
	public double sueldoNeto() {
		return sueldoBruto() - retenciones();
	}
	
	private int irpfFinal() {
		int toret = getIrpf();
		if(isCasado()) toret = toret - 1;
		toret = toret - 1 * getNumHijos();
		return toret;
	}
	
	public double retenciones() {
		return (sueldoBruto() + irpfFinal()/100);
	}

	@Override
	public String toString() {
		return  this.nif + " " + this.nombre 
				+ "\nSueldo base: " + this.sueldoBase 
				+ "\nHoras Extra: " + this.horasExtraMes 
				+ "\ntipo IRPF: " + this.irpf
				+ "\nCasado: " + (this.casado? "S�": "No") 
				+ "\nN�mero de Hijos: " + this.numHijos;
	}
}
