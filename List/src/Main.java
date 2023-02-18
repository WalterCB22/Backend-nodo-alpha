import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Scanner scr = new Scanner(System.in);
        int num,suma = 0; //declaro variables tipo entero
        float media = 0; // Declaro una variable de tipo float para almacenar el promedio

        System.out.print("Ingresa un numero entero: ");
        num = scr.nextInt();

        while(num!=-99){
            numeros.add(num);
            suma += num;// suma = suma +num
            System.out.print("Ingresa un numero entero: ");
            num = scr.nextInt();
        }


        media = (float) suma / numeros.size();// Promedio
        System.out.println("Se han leido " + numeros.size()+ " valor(es) por consola");
        System.out.println("La suma de los numeros leidos es: " + suma);

        System.out.println("La media es igual a: " + media);
        System.out.println("Los valores leidos son: " + numeros);

        System.out.print("Los valores mayores a la media son: ");
        for (Integer i : numeros) {
            if (i > media)
                System.out.print(i+" ");
        }

    }
}