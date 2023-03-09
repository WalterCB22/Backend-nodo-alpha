// Programa que lea una serie de valores numericos
// enteros desde el teclado y los guarde en un ArrayList
// de tipo Integer. La lectura de numeros enteros termina
// cuando se introduce el valor -99. Este valor no se guarda
// en el ArrayList. A continuacion el programa muestra por pantalla
// el numero de valores que se han leido, su suma y su
// media. Por ultimo se mostraran todos los valores leidos, indicando
// cuantos de ellos son mayores que la media

import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        while (numero != -99) {
            System.out.print("Introduce un numero entero (-99 para terminar): ");
            numero = scanner.nextInt();
            if (numero != -99) {
                numeros.add(numero);
            }
        }

        int cantidadNumeros = numeros.size();
        int sumaNumeros = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            sumaNumeros += numeros.get(i);
        }

        double mediaNumeros = (double) sumaNumeros / cantidadNumeros;

        System.out.println("Cantidad de numeros leidos: " + cantidadNumeros);
        System.out.println("Suma de numeros leidos: " + sumaNumeros);
        System.out.println("Media de numeros leidos: " + mediaNumeros);

        int cantidadMayoresQueMedia = 0;
        for (int i = 0; i < cantidadNumeros; i++) {
            if (numeros.get(i) > mediaNumeros) {
                cantidadMayoresQueMedia++;
            }
        }

        System.out.println("Numeros leidos:");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.print(numeros.get(i) + " ");
        }
        System.out.println("\nCantidad de numeros mayores que la media: " + cantidadMayoresQueMedia);
    }
}
