
public class Direccion {

	//Atributos clase Direccion:
	
	private String calle, ciudad;
	private int num, piso, cp;
	private char puerta;
	
	//Construcot clase Direccion:
	
	public Direccion() {
		this.calle = "";
		this.num = 0;
		this.piso = 0;
		this.puerta = ' ';
		this.cp = 0;
		this.ciudad = "";
	}
	
	public Direccion(String calle, int num, int piso, char puerta, int cp, String ciudad) {
		this.calle = calle;
		this.num = num;
		this.piso = piso;
		this.puerta = puerta;
		this.cp = cp;
		this.ciudad = ciudad;
	}
	
	//Getters clase Direccion:
	
	public String getCalle() {
		return this.calle;
	} 
	
	public char getPuerta() {
		return this.puerta;
	}
	
	public String getCiudad() {
		return this.ciudad;
	}

	public int getNum() {
		return this.num;
	}

	public int getPiso() {
		return this.piso;
	}
	
	public int getCp() {
		return this.cp;
	}

	//Setters clase Direccion:
	
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public void setPiso (int piso) {
		this.piso = piso;
	}

	public void setCp (int cp) {
		this.cp = cp;
	}
	
	//Método toString clase Dirección:
	
	@Override
	public String toString() {
		return this.calle + ", " + this.num + ", " + this.piso + "º, " + this.puerta + ", " + this.cp + ", " + this.ciudad + ".";
	}
}