
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        System.out.println("Ingrese un numero");
        for (int x = 2; x <= num; x++) {
            if (esPrimo(x)) {
                System.out.println(x + " es primo");
            }
        }

    }


    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}


