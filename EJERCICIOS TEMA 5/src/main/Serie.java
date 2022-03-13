package main;

public class Serie implements Entregable{
	
	//Atributos clase Serie:
	
	private String title, genre, creator;
	private int seasons;
	private boolean delivered;
	
	//Constantes por defecto de los atributos de la clase Serie:
	
	private static final int DEFAULT_SEASONS = 3;
	private static final boolean DEFAULT_DELIVERED = false;
	
	//Constructores:
	
	// a) Constructor por defecto:
	
	public Serie() {
		super();
		this.seasons = DEFAULT_SEASONS;
		this.delivered = DEFAULT_DELIVERED;
	}
	
	// b) Constructor con titulo y creador:
	
	public Serie(String title, String creator) {
		super();
		this.title = title;
		this.seasons = DEFAULT_SEASONS;
		this.delivered = DEFAULT_DELIVERED;
		this.creator = creator;
	}
	
	// c) Constructor con todos los atributos, excepto el entregado:
	
	public Serie(String title, String genre, String creator, int seasons) {
		super();
		this.title = title;
		this.seasons = seasons;
		this.genre = genre;
		this.creator = creator;
	}
	
	//Setters y getters superclase Serie:
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getSeasons() {
		return this.seasons;
	}
	
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getCreator() {
		return this.creator;
	}
	
	public void setCreator(String creator) {
		this.creator = creator;
	}
	
	@Override
	public String toString() {
		return "La serie '" + this.title + "' de '" + this.genre + "' con '" + this.seasons + "' temporada/as, con '" + this.creator + "' como creador."; 
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
		
		if (object instanceof Serie) {
			
			Serie aux = (Serie) object;
			
			if(this.getSeasons() < aux.getSeasons()) {
				System.out.println(this.getTitle() + " tiene menos temporadas que " + aux.getTitle() + ".");
			} else if (this.getSeasons() > aux.getSeasons()) {
				System.out.println(this.getTitle() + " tiene más temporadas que " + aux.getTitle() + ".");
			} else System.out.println(this.getTitle() + " tiene las mismas temporadas que " + aux.getTitle() + ".");
			
		} else System.out.println("Los dos objetos no son del tipo Serie.");
	}
}
