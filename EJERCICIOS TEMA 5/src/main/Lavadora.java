package main;

public class Lavadora extends Electrodomestico {

	// Atributos subclase Lavadora:

	private double load;

	// Constantes con

	private static final double DEFAULT_LOAD = 5;

	// Constructores subclase:

	// a) Constructor por defecto:

	public Lavadora() {
		this.load = DEFAULT_LOAD;
		this.basePrize = DEFAULT_BASE_PRIZE;
		this.weight = DEFAULT_WEIGHT;
		this.color = DEFAULT_COLOR;
		this.consume = DEFAULT_CONSUME;
	}

	// b) Constructor con el precio y peso. El resto por defecto:

	public Lavadora(double basePrize, double weight) {
		this.load = DEFAULT_LOAD;
		this.basePrize = basePrize;
		this.weight = weight;
		this.color = DEFAULT_COLOR;
		this.consume = DEFAULT_CONSUME;
	}

	// c) Constructor con la carga y el resto de atributos heredados.

	public Lavadora(double basePrize, double weight, COLORS color, CONSUMES consume, double load) {
		super(basePrize, weight, color, consume);
		this.load = load;
	}

	// Getter y Setter de load:

	public double getLoad() {
		return this.load;
	}

	public void setLoad(double load) {
		this.load = load;
	}

	// Método precioFinal subclase Lavadora:

	public double finalPrize() {
		double plus = super.finalPrize();

		if (getLoad() > 30.0) {
			plus += 50;
		}
		return plus;
	}
}
