//Desarrollar un programa para mostrar por consola los primeros n numeros primos
// siendo n un valor que se ingresara por consola.
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números primos a mostrar: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;
        while (count < n) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
