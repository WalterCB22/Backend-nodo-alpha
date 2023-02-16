
import java.util.Scanner;
public class Multiplos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 0, n = 0;
        System.out.println("Numero: ");
        m = in.nextInt();
        System.out.println("Cantidad de multiplos: ");
        n = in.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("Multiplo " + i + ": " + (i*m));
        }
    }
}
