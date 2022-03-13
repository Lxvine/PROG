package main;

public class Electrodomestico {

	// Atributos superclase Electrodoméstico:

	protected double basePrize, weight;
	protected COLORS color;
	protected CONSUMES consume;
	
	protected static enum COLORS {
		WHITE, BLACK, RED, BLUE, GREY
	};

	protected static enum CONSUMES {
		A, B, C, D, E, F
	};

	

	// Constantes con los valores por defecto que pide el enunciado:

	protected static final COLORS DEFAULT_COLOR = COLORS.WHITE;
	protected static final CONSUMES DEFAULT_CONSUME = CONSUMES.F;
	protected static final double DEFAULT_BASE_PRIZE = 100.00;
	protected static final double DEFAULT_WEIGHT = 5.00;

	// Constructores Electrodoméstico:

	// Constructor por defecto:

	public Electrodomestico() {
		this.basePrize = DEFAULT_BASE_PRIZE;
		this.weight = DEFAULT_WEIGHT;
		this.color = DEFAULT_COLOR;
		this.consume = DEFAULT_CONSUME;
	}

	// Constructor con precio y peso y el color y consumo por defecto:

	public Electrodomestico(double basePrize, double weight) {
		this(basePrize, weight, DEFAULT_COLOR, DEFAULT_CONSUME);
	}

	// Constructor con todos los atributos:

	public Electrodomestico(double basePrize, double weight, COLORS color, CONSUMES consume) {
		this.basePrize = basePrize;
		this.weight = weight;
		this.color = color;
		this.consume = consume;
	}
		
	public Electrodomestico(double basePrize, double weight, String color, char consume) {
		this.basePrize = basePrize;
		this.weight = weight;
		checkColor(color);
		checkEnergyConsumption(consume);
	}
	
	// Getters y Setters:

	public double getBasePrize() {
		return basePrize;
	}

	public void setBasePrize(double basePrize) {
		this.basePrize = basePrize;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public COLORS getColor() {
		return color;
	}

	public void setColor(COLORS color) {
		this.color = color;
	}

	public CONSUMES getEnergyConsume() {
		return consume;
	}

	public void setEnergyConsume(CONSUMES consume) {
		this.consume = consume;
	}

	// toString Electrodomestico:

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + basePrize + ", peso=" + weight + ", color=" + color
				+ ", consumoEnergético=" + consume + "]";
	}

	// Método comprobarConsumoEnergetico:

	private void checkEnergyConsumption(char word) {

		word = Character.toLowerCase(word);

		if (word == 'a' || word == 'b' || word == 'c' || word == 'd' || word == 'e' || word == 'f') {
			System.out.println("Letra correcta.");
			;
		} else
			System.out.println("La letra es por defecto: " + DEFAULT_CONSUME);
	}

	// Método comprobarColor:

	private void checkColor(String color) {

		color = color.toLowerCase();

		if (color.equals("white") || color.equals("black") || color.equals("red") || color.equals("blue")
				|| color.equals("grey")) {
			System.out.println("Color correcto.");
		} else
			System.out.println("El color por defecto es: " + DEFAULT_COLOR);
	}

	// Método precioFinal():

	public double finalPrize() {

		// CONSUME:
		double plus = 0;

		switch (getEnergyConsume()) {

		case A:
			plus *= 100;
			break;
		case B:
			plus *= 80;
			break;
		case C:
			plus *= 60;
			break;
		case D:
			plus *= 50;
			break;
		case E:
			plus *= 30;
			break;
		case F:
			plus *= 10;
			break;
		}
		// WEIGHT:

		if (getWeight() >= 0 && getWeight() < 20) {
			plus += 10;
		} else if (getWeight() >= 20 && getWeight() < 50) {
			plus += 50;
		} else if (getWeight() >= 50 && getWeight() < 80) {
			plus += 80;
		} else if (getWeight() >= 80)
			plus += 100;
		return getBasePrize() + plus;
	}
} 
