//3.

//CLASE

public class Contador {

//ATRIBUTOS

    private int cont;

//CONSTRUCTORES

    // Constructor por defecto:

    public Contador() {
        this.cont = 0;
    }

    // Constructor con parámetros iniciales:

    public Contador(int cont) {
        if(cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }

    }

//GETTERS

    public int cont() {
        return this.cont;
    }

//SETTERS

    public void cont(int cont) {
        this.cont = cont;
    }

//INCREMENTAR

    public void incrementar() {
        this.cont ++;
    }

    public void decrementar() {
        if(this.cont > 0) {
            this.cont --;
        }
    }

    @Override
    public String toString() {
        return "El valor del contador es: " + this.cont;
    }

}
