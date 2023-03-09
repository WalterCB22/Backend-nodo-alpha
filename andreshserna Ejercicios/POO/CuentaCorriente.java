//Crea una clase CuentaCorriente, con los metodos: ingreso, egreso, reintegro y transferencia.
// La clase contendrá un constructor por defecto, uno con parametros y otro que recibira una
// CuentaCorriente de la cual copiara todos sus datos. Ademas se deben desarrollar los metodos
// de acceso (para cada variable de instancia de la clase, desarrollar un metodo set y otro get.
// Por ejemplo: si la clase tiene una variable double saldo, sus metodos de acceso sera: double
// getSaldo() y void setSaldo(double s)). Los prototipos de los metodos y constructores deberan
// ser discutidos y diseñados en equipo
public class CuentaCorriente {
    private String titular;
    private double saldo;

    // Constructor por defecto
    public CuentaCorriente() {
        this.titular = "";
        this.saldo = 0;
    }

    // Constructor con parámetros
    public CuentaCorriente(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Constructor de copia
    public CuentaCorriente(CuentaCorriente cuenta) {
        this.titular = cuenta.titular;
        this.saldo = cuenta.saldo;
    }

    // Métodos de acceso
    public String getTitular() {
        return this.titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos de la clase
    public void ingreso(double cantidad) {
        this.saldo += cantidad;
    }

    public void egreso(double cantidad) {
        if (cantidad <= this.saldo) {
            this.saldo -= cantidad;
        } else {
            System.out.println("Error: saldo insuficiente");
        }
    }

    public void reintegro(double cantidad) {
        this.ingreso(cantidad);
    }

    public void transferencia(double cantidad, CuentaCorriente cuentaDestino) {
        if (cantidad <= this.saldo) {
            this.egreso(cantidad);
            cuentaDestino.ingreso(cantidad);
        } else {
            System.out.println("Error: saldo insuficiente");
        }
    }
}

