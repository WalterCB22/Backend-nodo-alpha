
import java.util.Scanner;
//Ejercicio 1
public class NumerosPares {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantN = 1;
        while (cantN != 0){
            System.out.println("Cuantos numeros pares quieres imprimir?: ");
            cantN = in.nextInt();
            for (int i=1; i<=cantN; i++){
                if(i%2 == 0){
                    System.out.println(i);
                }else{
                    cantN++;
                }
            }
        }


    }
}
