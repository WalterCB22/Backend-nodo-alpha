
import java.util.Scanner;
public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantDivisores = 0;
        boolean isPrimo = false;
        int num = 1;

        while (num != 0){
            System.out.println("-------------------");
            System.out.println("Ingrese numero");
            num = in.nextInt();
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
            if (isPrimo == true){
                System.out.println("Es primo");
            }else{
                System.out.println("No es primo");
            }
            cantDivisores = 0;
        }
    }
}
