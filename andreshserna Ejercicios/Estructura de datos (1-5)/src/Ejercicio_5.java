// Programa capas de mostrar por consola los primeros n numeros
// naturales que tienen al menos m digitos d, siendo n, m y d valores
// que el usuario ingresara por consola.
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros naturales que desea buscar: ");
        int n = input.nextInt();

        System.out.print("Ingrese la cantidad de digitos que deben tener los numeros: ");
        int m = input.nextInt();

        System.out.print("Ingrese el digito que deben tener los numeros: ");
        int d = input.nextInt();

        int contador = 0;
        int numeroActual = 0;

        while (contador < n) {
            numeroActual++;

            int digitosD = 0;
            int numeroTemporal = numeroActual;

            while (numeroTemporal > 0) {
                int digito = numeroTemporal % 10;
                if (digito == d) {
                    digitosD++;
                }
                numeroTemporal /= 10;
            }

            if (digitosD >= m) {
                System.out.println(numeroActual);
                contador++;
            }
        }
    }
}

