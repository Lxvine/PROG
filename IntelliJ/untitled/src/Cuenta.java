//2.

//CLASE

public class Cuenta {

//ATRIBUTOS

    private String nombreCliente, numeroCuenta;
    private double tipoInteres, saldo;

//MÉTODOS CONSTRUCTORES

// a) Constructor por defecto/sin parámetros:

    public Cuenta() {
        this.nombreCliente = "";
        this.numeroCuenta = "";
        this.tipoInteres = 0;
        this.saldo = 0;
    }

// b) Constructor con todos los parámetros:

    public Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, double Saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = Saldo;
    }

// c) Constructor copia:

    public Cuenta(final Cuenta c) {
        this.nombreCliente = c.nombreCliente;
        this.numeroCuenta = c.numeroCuenta;
        this.tipoInteres = c.tipoInteres;
        this.saldo = c.saldo;
    }

// d) GETTERS

    public String getNombre_Cliente() {
        return this.nombreCliente;
    }

    public String getNumero_Cuenta() {
        return this.numeroCuenta;
    }

    public double getTipo_Interes() {
        return this.tipoInteres;
    }

    public double getSaldo() {
        return this.saldo;
    }

//	SETTERS

    public void setNombre_Cliente(String s) {
        this.nombreCliente = s;
    }

    public void setNumero_Cuenta(String s) {
        this.numeroCuenta = s;
    }

    public void setTipo_Interes(double s) {
        this.tipoInteres = s;
    }

    public void setSaldo(int s) {
        this.saldo = s;
    }

    // e) Método Ingreso:

    public boolean Ingreso(double s) {
        boolean ingresoCorrecto = true;
        if (s < 0) {
            ingresoCorrecto = false;
            System.out.println(" --- La cantidad a ingresar es negativa, por tanto el saldo es el mismo.");
        } else {
            saldo = saldo + s;
        }
        return ingresoCorrecto;
    }

    // Método Reintegro:

    public boolean Reintegro(double s) {
        boolean reintegroCorrecto = true;
        if (s < 0) {
            reintegroCorrecto = false;
            System.out.println(
                    " --- La cantidad a retirar es negativa, por tanto el saldo se queda como estaba en un principio.");
        } else {
            saldo -= s;
        }
        return reintegroCorrecto;
    }

    // f) Método Transferencia:

    public void Transferencia(Cuenta cuentaDestino, double importe) {
        if (getSaldo() >= importe) {
            this.saldo -= importe;
            cuentaDestino.Ingreso(importe);
        }
    }

    @Override
    public String toString() {
        return "El Cliente '" + getNombre_Cliente() + "' con número de cuenta '" + getNumero_Cuenta()
                + "' a tipo de Interés '" + getTipo_Interes() + "' tiene un saldo de: '" + getSaldo() + " EUROs'.";
    }

}
