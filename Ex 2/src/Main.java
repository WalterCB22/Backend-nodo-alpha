import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite un numero cualquiera: ");
        int num = scanner.nextInt();
        System.out.print("Digite la cantidad de multiplos a mostrar: ");
        int cant = scanner.nextInt();

        for (int i=0; i<=cant; i++){

            System.out.println(num + "*" + i + " = "+ (num * i));


        }

    }
}