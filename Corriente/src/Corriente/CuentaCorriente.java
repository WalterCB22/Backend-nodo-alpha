package Corriente;

public class CuentaCorriente {
    private  String titular;
    private Long numeroCuenta;
    private Double saldo;

    // cpntructor con parametros
    public CuentaCorriente(String titular, Long numeroCuenta, Double saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    //Contructor por defecto
    public CuentaCorriente() {
        titular = "";
        numeroCuenta = 0L;
        saldo = 0D;
    }

    //constructor por con copia
    public CuentaCorriente(CuentaCorriente cuentaCorriente){
        this.numeroCuenta= cuentaCorriente.getNumeroCuenta();
        this.saldo= cuentaCorriente.getSaldo(); ;
        this.titular= cuentaCorriente.getTitular();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
