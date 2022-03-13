package main;

public class Videojuego implements Entregable {

	// Atributos clase Videojuego:

	private String title, genre, company;
	private int estimatedHours;
	private boolean delivered;

	// Constantes por defecto de los atributos de la clase Videojuego:

	private final int DEFAULT_ESTIMATED_HOURS = 10;
	private final boolean DEFAULT_DELIVERED = false;

	// Constructores clase Videojuego:

	// a) Constructor por defecto:

	public Videojuego() {
		super();
		this.estimatedHours = DEFAULT_ESTIMATED_HOURS;
		this.delivered = DEFAULT_DELIVERED;
	}

	public Videojuego(String title, int estimatedHours) {
		super();
		this.title = title;
		this.estimatedHours = estimatedHours;
	}

	public Videojuego(String title, String genre, String company, int estimatedHours) {
		super();
		this.title = title;
		this.genre = genre;
		this.company = company;
		this.estimatedHours = estimatedHours;
	}

	// Setters y Getters clase Videojuego:

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(int estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	@Override
	public String toString() {
		return "El videojuego '" + this.title + "' de estilo '" + this.genre + "' hecho por la comañía' " + this.company + "' de '"
				+ this.estimatedHours + "' horas de duración.";
	}

	@Override
	public void delivered() {
		this.delivered = true;
	}

	@Override
	public void returned() {
		this.delivered = false;
	}

	@Override
	public boolean isDelivered() {
		return this.delivered;
	}

	@Override
	public void compareTo(Object object) {

		Videojuego aux = (Videojuego) object;
		if (object instanceof Videojuego) {
			if (this.getEstimatedHours() < aux.getEstimatedHours()) {
				System.out.println(this.getTitle() + " es más corto que " + aux.getTitle() + ".");
			} else if (this.getEstimatedHours() > aux.getEstimatedHours()) {
				System.out.println(this.getTitle() + " es más largo que " + aux.getTitle() + ".");
			} else
				System.out.println(this.getTitle() + " es igual de largo que " + aux.getTitle() + ".");
		} else System.out.println("Los dos objetos no son del tipo videojueg.");
	}

}
