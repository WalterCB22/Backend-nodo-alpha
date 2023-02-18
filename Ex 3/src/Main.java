import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int cont;
        byte salir;
       do {
           System.out.println("Digite un numero");
           num = scanner.nextInt();
           cont = 0;
           for (int i=1; i<=num; i++){
               if (num%i ==0){
                   cont++;
               }
           }
           if (cont==2){
               System.out.println("Es primo");
           }else {
               System.out.println("No es primo");
           }

           System.out.println("Para salir digite 0, para continuar digite uno diferente");
           salir = scanner.nextByte();
       }while (salir !=0);

    }
}