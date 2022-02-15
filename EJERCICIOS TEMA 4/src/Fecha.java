
public class Fecha {

	// Atributos:

	private int dia, mes, anho;

	// Constructor vacío:

	public Fecha() {
		this.dia = 0;
		this.mes = 1;
		this.anho = 0;
	}

	// Constructor con parámetros:

	public Fecha(int dia, int mes, int anho) {
		this.dia = 19;
		this.mes = 12;
		this.anho = 2024;
	}

	// Getters:

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAnho() {
		return this.anho;
	}

	// Setters:

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	public boolean fechaCorrecta(int dia, int mes, int anho) {
		if (anho < 0 || anho > 2050) {
			return false;
		}

		switch (this.mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (this.dia < 0 || this.dia > 31) {
				return false;
			}
			break;
		case 2:

			if (esBisiesto(this.anho) == true) {
				if (this.dia < 0 || this.dia > 29) {
					return false;
				}
				break;

			} else if (esBisiesto(this.anho) == false) {
				if (this.dia < 0 || this.dia > 28) {
					return false;
				}

				break;
			}
		case 4:
		case 6:
		case 9:
		case 11:
			if (this.dia < 0 || this.dia > 30) {
				return false;
			}
			break;
		default:
			return false;
		}
		return true;
	}

	private boolean esBisiesto(int anho) {
		if ((this.anho % 4 == 0) && ((this.anho % 100 != 0) || (this.anho % 400 == 0))) {
			return true;
		} else
			return false;
	}
	
	public void diaSiguiente(int dia, int mes, int anho) {
		setDia(+1);
		if (fechaCorrecta(this.dia, this.mes, this.anho)==false) {
			setMes(+1); 
			setDia(1);
		}
	}
	
	public boolean esMayorQue(Fecha f) {
		if (this.anho == f.getAnho()) {
			if (this.mes == f.getMes()) {
				if (this.dia < f.getDia()) {
					return false;
				} else 
					return true;
			} else if (this.mes < f.getMes()) {
				return false;
			} else
				return true;
		} else if (this.anho < f.getAnho()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		if (fechaCorrecta(this.dia, this.mes, this.anho) == false) {
			return "La fecha no es correcta.";
		} else {
			if (this.dia < 10 && this.mes < 10) {
				return "0" + this.dia + "-" + "0" + this.mes + "-" + this.anho;
			} else if (this.mes < 10) {
				return this.dia + "-" + "0" + this.mes + "-" + this.anho;
			} else if (this.dia < 10) {
				return "0" + this.dia + "-" + this.mes + "-" + this.anho;
			} else {
				return this.dia + "-" + this.mes + "-" + this.anho;
			}
		}
	}
}
