package Exercise1;

public class CuentaCorriente {
    private String numCuenta;
    private Double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String numCuenta, Double saldo) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
    }
    public void ingreso(double valor){
        saldo += valor;
    }
    public void transferencia(){

    }
    public void egreso(double valor){
        saldo -= valor;
    }
    public void reintegro(double valor){
        saldo += valor;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
