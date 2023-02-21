package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Usuario> arrayUsuarios = new ArrayList<>();
        arrayUsuarios.add(new Usuario("123", "Carolina", new CuentaCorriente("g23", (double)20000)));
        arrayUsuarios.add(new Usuario("456", "Juan Pablo", new CuentaCorriente("h45", (double)30000)));

        System.out.println("Id usario");
        String idUser = leer.next();
        Usuario usuario = new Usuario();
        usuario = findUser(idUser, arrayUsuarios);
        double valor = 0;
        int opc = 1;
        while (opc != 0){
            System.out.println("1. ingreso \n" +
                    "2. egreso\n" +
                    "3. reintegro\n" +
                    "4. transferencia\n" +
                    "0. salir");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Cuanto dinero desea ingresar a si cuenta");
                    valor = leer.nextDouble();
                    System.out.println("Saldo antes: " + usuario.getCuenta().getSaldo());
                    usuario.getCuenta().ingreso(valor);
                    System.out.println("Saldo despues: " + usuario.getCuenta().getSaldo());
                    break;
                case 2:
                    System.out.println("Cuanto dinero desea retirar de su cuenta  ");
                    valor = leer.nextDouble();
                    System.out.println("Saldo antes: " + usuario.getCuenta().getSaldo());
                    usuario.getCuenta().egreso(valor);
                    System.out.println("Saldo despues: " + usuario.getCuenta().getSaldo());
                    break;
                case 3:
                    System.out.println("Saldo antes: " + usuario.getCuenta().getSaldo());
                    usuario.getCuenta().reintegro(valor);
                    System.out.println("Saldo despues: " + usuario.getCuenta().getSaldo());
                    break;
                case 4:
                    System.out.println("Id del usuario a transferir");
                    String idAmigo = leer.next();
                    Usuario  amigo = new Usuario();
                    amigo = findUser(idAmigo, arrayUsuarios);
                    System.out.println("Cuanto dinero desea ingresar a si cuenta");
                    valor = leer.nextDouble();
                    System.out.println("Saldo antes: " + usuario.getCuenta().getSaldo());
                    amigo.getCuenta().ingreso(valor);
                    usuario.getCuenta().egreso(valor);
                    System.out.println("Saldo despues: " + usuario.getCuenta().getSaldo());
                    break;
            }
        }
    }
    public static Usuario findUser(String id, ArrayList<Usuario> arrayUsuarios){
        Usuario u = new Usuario();
        for (int i = 0; i < arrayUsuarios.size(); i++) {
            if(arrayUsuarios.get(i).getId().equalsIgnoreCase(id)){
                u = arrayUsuarios.get(i);
            }
        }
        return u;
    }
}
