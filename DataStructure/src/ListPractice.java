import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListPractice {
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

    public static double addNumbers(ArrayList<Integer> arrayNums){
        return arrayNums.stream().mapToInt(Integer::intValue).sum();
    }
    public static double media(ArrayList<Integer> arrayNums){
        return addNumbers(arrayNums)/arrayNums.size();
    }
    public static void biggerThanMedia(ArrayList<Integer> arrayNums){
        double media = media(arrayNums);
        arrayNums.stream().forEach(integer -> {
            if(integer > media){
                System.out.println(integer + " mayor");
            }else{
                System.out.println(integer + " menor");
            }
        });
    }
    public static void showNumbers(ArrayList<Integer> arrayNums){
        arrayNums.stream().forEach(System.out::println);
    }

}
