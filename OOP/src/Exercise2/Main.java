package Exercise2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String letra = "a";
        Contador contador = new Contador();
        System.out.println("a para decrementar, \nd para incrementar, \nw para salir");
        letra = leer.next();
        while (!letra.equalsIgnoreCase("w")){
            if(letra.equalsIgnoreCase("a")){
                contador.decrementar();
                System.out.println("Contador decremento: " + contador.getCont());
            }else if(letra.equalsIgnoreCase("d")){
                contador.incrementar();
                System.out.println("Contador incremento: " + contador.getCont());
            }else {
                System.out.println("Error: debe presionar \na para decrementar, \nd para incrementar, \nw para salir");
            }
            letra = leer.next();
        }
    }
}
