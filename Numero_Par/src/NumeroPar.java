import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte salir = 1;
        int num;
        do {
            System.out.print("Ingrese un numero: ");
            num = scanner.nextInt();


            System.out.println("Lista de numeros pares");
            for (int i=2; i<=num; i=i+2){
                System.out.println(i);
            }

            System.out.print("Para salir digite 0, para continuar digite otro numero: ");
            salir = scanner.nextByte();

        }while (salir !=0);
    }
}
