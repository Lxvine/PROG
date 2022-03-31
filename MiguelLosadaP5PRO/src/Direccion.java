import java.util.ArrayList;

public class Direccion {

	//Atributos clase Direccion:
	
	private String nombre;
	private int num, cp;
	private TipoDeVia tipoDeVia; 
	
	//Construcot clase Direccion:
	
	public Direccion() {
		this.tipoDeVia = TipoDeVia.CAMINO;
		this.nombre = "";
		this.num = 0;
		this.cp = 0;
	}
	
	public Direccion(TipoDeVia tipoDeVia, String nombre, int num, int cp) {
		this.tipoDeVia = tipoDeVia;		
		this.nombre = nombre;
		this.num = num;
		this.cp = cp;
	}
	
	//Getters clase Direccion:
	
	public String getNombre() {
		return this.nombre;
	} 
	
	public int getNum() {
		return this.num;
	}
	
	public int getCp() {
		return this.cp;
	}
	
	public TipoDeVia getTipoDeVia() {
		return this.tipoDeVia;
	}

	//Setters clase Direccion:
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public void setCp (int cp) {
		this.cp = cp;
	}

	public void setTipoDeVia (TipoDeVia tipoDeVia) {
		this.tipoDeVia = tipoDeVia;
	}
	
	//Método toString clase Dirección:
	
	@Override
	public String toString() {
		return this.tipoDeVia + " " + this.nombre + ", número " + this.num + ", " + "con CP " + this.cp + ".";
	}
}