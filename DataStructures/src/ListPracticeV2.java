import java.util.ArrayList;
import java.util.Scanner;

public class ListPracticeV2 {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arrayNums = new ArrayList<>();
        System.out.println("Ingrese todos los numeros (-99 para cancelar):");
        int num = in.nextInt();
        while(num != -99){
            arrayNums.add(num);
            num = in.nextInt();
        }

        System.out.println("Cantidad de numeros leidos: " + arrayNums.size());
        System.out.println("Suma de todos los numeros: " + addNumbers(arrayNums));
        System.out.println("Media: " + media(arrayNums));
        System.out.println("numeros mayores y menores que la media");
        biggerThanMedia(arrayNums);
    }
    public static double addNumbers(ArrayList<Integer> arrayNums) {
        int sum = 0;
        for (int num : arrayNums) {
            sum += num;
        }
        return sum;
    }
    public static double media(ArrayList<Integer> arrayNums) {
        return addNumbers(arrayNums)/arrayNums.size();
    }
    public static void biggerThanMedia(ArrayList<Integer> arrayNums) {
        double media = media(arrayNums);
        for (int num : arrayNums) {
            if(num > media){
                System.out.println(num + " mayor");
            }else{
                System.out.println(num + " menor");
            }
        }
    }

    public static void showNumbers(ArrayList<Integer> arrayNums) {
        for (Integer num : arrayNums) {
            System.out.println(num);
        }
    }
}
