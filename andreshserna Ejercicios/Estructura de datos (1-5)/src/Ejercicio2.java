// Desarrollar un programa en Java para mostrar los primeros n
// multiplos de m, siendo n y m valores que el usuario ingresara por consola.

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de múltiplos a mostrar: ");
        int n = sc.nextInt();
        System.out.print("Ingrese el número del cual desea conocer los múltiplos: ");
        int m = sc.nextInt();
        System.out.print("Los primeros " + n + " múltiplos de " + m + " son: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i * m + " ");
        }

    }
}
