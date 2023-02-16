
import java.util.Scanner;
public class nNumerosPrimos {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Cuantos numeros primos desea imprimir? ");
        int n = in.nextInt();
        for (int i = 1; i<=n; i++){
            if(isPrimo(i)){
                System.out.println(i);
            }else{
                n++;
            }
        }
    }
    public static boolean isPrimo(int num){
        boolean isPrimo = false;
        int cantDivisores = 0;
        for(int i = 1; i<=num; i++){
            if(num%i == 0){
                cantDivisores = cantDivisores + 1;
                if(cantDivisores == 3){
                    isPrimo = false;
                    break;
                }else{
                    isPrimo = true;
                }
            }
            if(cantDivisores == 1){
                isPrimo = false;
            }
        }
        return isPrimo;
    }
}
