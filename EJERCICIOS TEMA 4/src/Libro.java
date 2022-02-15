//1.

//CLASE

public class Libro {

//ATRIBUTOS

	private String ISBN, Autor, Titulo;
	private int NumPags;

//MÉTODOS CONSTRUCTORES

	public Libro() {
		this.ISBN = "";
		this.Autor = "";
		this.Titulo = "";
		this.NumPags = 0;
	}

	public Libro(String ISBN, String Autor, String Titulo, int NumPags) {
		this.ISBN = ISBN;
		this.Autor = Autor;
		this.Titulo = Titulo;
		this.NumPags = NumPags;
	}

//GETTERS

	public String getISBN() {
		return this.ISBN;
	}

	public String getAutor() {
		return this.Autor;
	}

	public String getTitulo() {
		return this.Titulo;
	}

	public int getNumPags() {
		return this.NumPags;
	}

//SETTERS

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}

	public void setTitulo(String Titulo) {
		this.Titulo = Titulo;
	}

	public void setAutor(String Autor) {
		this.Autor = Autor;
	}

	public void setNumPags(int NumPags) {
		this.NumPags = NumPags;
	}

//TO STRING	

	@Override
	public String toString() {
		return "El libro " + getTitulo() + " con ISBN " + getISBN() + " creado por el autor " + getAutor() + " tiene "
				+ getNumPags() + " páginas.";
	}

}
