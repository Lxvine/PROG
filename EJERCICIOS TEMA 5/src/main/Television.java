package main;

public class Television extends Electrodomestico {

	// Atributos televisión:

	public int resolution;
	public boolean tdtTuner;

	// Constantes con valores por defecto:

	protected static final int DEFAULT_RESOLUTION = 20;
	protected static final boolean DEFAULT_TDT_TUNER = false;

	// Constructores subclases Television:

	// a) Constructor por defecto:

	public Television() {
		super();
		this.resolution = DEFAULT_RESOLUTION;
		this.tdtTuner = DEFAULT_TDT_TUNER;
	}

	// b) Constructor con precio y peso. El resto por defecto:

	public Television(double basePrize, double weight) {
		this.basePrize = basePrize;
		this.weight = weight;
		this.color = DEFAULT_COLOR;
		this.consume = DEFAULT_CONSUME;
		this.resolution = DEFAULT_RESOLUTION;
		this.tdtTuner = DEFAULT_TDT_TUNER;
	}

	// c) Constructor con la resolución, sintonizador TDT y el resto de atributos
	// heredados.

	public Television(double basePrize, double weight, COLORS color, CONSUMES consume, int resolution,
			boolean tdtTuner) {
		super(basePrize, weight, color, consume);
		this.resolution = resolution;
		this.tdtTuner = tdtTuner;
	}

	// Getters y Setters subclase Televisión:

	public int getResolution() {
		return this.resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public boolean getTdtTuner() {
		return this.tdtTuner;
	}

	public void setTdtTuner(boolean tdtTuner) {
		this.tdtTuner = tdtTuner;
	}

	public double finalPrize() {
		double plus = super.finalPrize();

		if (resolution > 40) {
			plus += plus * 0.3;
		}
		if (tdtTuner) {
			plus += 50;
		}
		return plus;
	}
}
