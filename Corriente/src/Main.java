import Corriente.CuentaCorriente;

public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("Brayan", 54678944587L, 3500000.0);

        System.out.println("Titular: "+cuenta1.getTitular());
        System.out.println("Numero de cuenta: "+cuenta1.getNumeroCuenta());
        System.out.println("Saldo: "+cuenta1.getSaldo());


    }
}