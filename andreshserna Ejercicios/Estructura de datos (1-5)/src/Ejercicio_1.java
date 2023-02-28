//Programa capas de mostrar los primeros n numeros pares,
// siendo n un valor que el usuario ingresará por consola:

// importamos scanner para ser utilizado en este ejercicio
import java.util.Scanner;
public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor n (# de numeros pares): ");
        int n = sc.nextInt();
        int num = 2; // Empezamos con el primer número par, que es 2
        System.out.print("Los primeros " + n + " números pares son: ");
        for (int i = 0; i < n; i++) {
            System.out.print(num + " ");

            num += 2; // Sumamos 2 al número anterior para obtener el siguiente número par
        }
    }
}