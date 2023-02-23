import contador.Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contador cont = new Contador(0);
        Scanner scr = new Scanner(System.in);
        byte option;


        do{
            System.out.println("Si desea incrementar el contador digite 1");
            System.out.println("Si desea decrementar el contador digite 2");
            System.out.println("Si ver el  valor del contador digite 3");
            System.out.println("Si desea salir digite 0");
            System.out.print("Digite la opcion aqui: ");
            option = scr.nextByte();

            switch (option) {
                case 1 -> cont.incrementarCont();
                case 2 -> cont.decrementarCont();
                case 3 -> System.out.println(cont.getCont());
                default -> System.out.println("La opcion no se encuentra en la lista");
            }
        } while (option!=0);


    }
}