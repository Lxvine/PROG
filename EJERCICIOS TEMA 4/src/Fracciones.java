//4.

public class Fracciones {

	int numerador, denominador;

	// Constructor por defecto:

	public Fracciones() {
		this.numerador = 0;
		this.denominador = 0;
	}

	// Contructor con parámetros:

	public Fracciones(int numerador, int denominador) {
		this.numerador = numerador;
		if (denominador == 0) {
			denominador = 1;
		}
		this.denominador = denominador;
		simplificar();
	}

	// GETTERS

	public int getNumerador() {
		return this.numerador;
	}

	public int getDenominador() {
		return this.denominador;
	}

	// SETTERS

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	// Máximo Común Divisor:

	private int mcd() {
		int a = Math.max(numerador, denominador);
		int b = Math.min(numerador, denominador);
		
		int resultado = 0;
		
		do {
			resultado = b;
			b = a % b;
			a = resultado;
		} while(b != 0);
		
		return resultado;
	}

	// Simplificar:

	private void simplificar() {
		int n = mcd();
		numerador = numerador / n;
		denominador = denominador / n;
	}

	// SUMA

	public Fracciones sumar(Fracciones f) {
        Fracciones aux = new Fracciones();
        aux.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        aux.denominador = this.denominador * f.denominador;
        aux.simplificar();                                                  
        return aux;
    }
	
	// RESTAR
	
	public Fracciones restar(Fracciones f) {
        Fracciones aux = new Fracciones();
        aux.numerador = this.numerador * f.denominador - this.denominador * f.numerador;
        aux.denominador = this.denominador * f.denominador;
        aux.simplificar(); 
        return aux;
    }
	
	// MULTIPLICAR
	
	public Fracciones multiplicar(Fracciones f) {
        Fracciones aux = new Fracciones();
        aux.numerador = this.numerador * f.numerador;
        aux.denominador = this.denominador * f.denominador;
        aux.simplificar();  
        return aux;
    }
	
	// DIVIDIR
	
	 public Fracciones dividir(Fracciones f) {
	        Fracciones aux = new Fracciones();
	        aux.numerador = this.numerador * f.denominador;
	        aux.denominador = this.denominador * f.numerador;
	        aux.simplificar(); 
	        return aux;
	    }

	@Override
	public String toString() {
		return "La fracción resulta como numerador el valor '" + this.numerador + "' y como denominador el valor '"
				+ this.denominador + "'.";
	}
}
