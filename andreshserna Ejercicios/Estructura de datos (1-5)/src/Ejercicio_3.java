//Desarrollar un programa para informar si un numero n es primo o no, siendo
//n un valor que el usuario ingresará por consola.

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int n = sc.nextInt();

        if (esPrimo(n)) {
            System.out.println(n + " es un número primo");
        } else {
            System.out.println(n + " no es un número primo");
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}