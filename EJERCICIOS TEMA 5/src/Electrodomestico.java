
public class Electrodomestico {
	
	//Atributos superclase Electrodoméstico:
	
	private double basePrize, weight; 
	private static enum colors {WHITE,BLACK,RED,BLUE,GREY}; 
	private static enum consumes {A,B,C,D,E,F};
	private colors color;
	private consumes consume;
	
	//Constantes con los valores por defecto que pide el enunciado:
	
	private static final colors DEFAULT_COLOR = colors.WHITE;
	private static final consumes DEFAULT_CONSUME = consumes.F;
	private static final double DEFAULT_BASE_PRIZE = 100.00;
	private static final double DEFAULT_WEIGHT = 5.00;
	
	//Constructores Electrodoméstico:
	
	//Constructor por defecto:
	
	public Electrodomestico() {
		this.basePrize = DEFAULT_BASE_PRIZE;
		this.weight = DEFAULT_WEIGHT;
		this.color = DEFAULT_COLOR;
		this.consume = DEFAULT_CONSUME;
	}
	
	//Constructor con precio y peso y el color y consumo por defecto:
	
	public Electrodomestico(double basePrize, double weight) {
		this.basePrize = basePrize;
		this.weight = weight;
		this.color= DEFAULT_COLOR;
		this.consume = DEFAULT_CONSUME;
	}
	
	//Constructor con todos los atributos:
	
	public Electrodomestico(double basePrize, double weight, colors color, consumes consume) {
		this.basePrize = basePrize;
		this.weight = weight;
		this.color = color;
		this.consume = consume;
	}
	
	//Getters y Setters:
	
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
	public colors getColor() {
		return color;
	}
	public void setColor(colors color) {
		this.color = color;
	}
	public consumes getEnergyConsume() {
		return consume;
	}
	public void setEnergyConsume(consumes consume) {
		this.consume = consume;
	}
	
	//toString Electrodomestico:
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + basePrize + ", peso=" + weight + ", color=" + color
				+ ", consumoEnergético=" + consume + "]";
	}
	
	//Método Letra correcta:
	
	void comprobarConsumoEnergetico(char word) {
		if (word == 'A' || word == 'B' || word == 'C' || word == 'D' || word == 'E' || word == 'F') {
			System.out.println("Letra correcta.");;
		} else {
			System.out.println("La letra es por defecto: " + DEFAULT_CONSUME);
		}
	}
	
	//Método Color correcto:
	
	
	
}