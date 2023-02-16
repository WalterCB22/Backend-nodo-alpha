import java.util.Scanner;
public class NumerosNaturales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cantNumEnt, nRepe, nSelected;
        System.out.println("Cantidad de numeros a imprimir");
        cantNumEnt = in.nextInt();
        System.out.println("numero de veces que va a tener el numero");
        nRepe = in.nextInt();
        System.out.println("Numero que va a tener");
        nSelected = in.nextInt();

        int numInicio = numInicio(nRepe);
        for(int i=0; i<cantNumEnt; i++){
            if(haveNumero(nRepe, nSelected, numInicio)){
                System.out.println(numInicio);
            }else{
                cantNumEnt++;
            }
            numInicio++;
        }
    }
    public static int numInicio(int nRepe){
        String numInicio = "1";
        for(int i=1; i<nRepe; i++){
            numInicio += "0";
        }
        return Integer.parseInt(numInicio);
    }
    public static boolean haveNumero(int nRepe, int nSelected, int num){
        boolean haveNumero = false;
        int cantN = 0;
        char c;
        String numString = Integer.toString(num);
        for(int i=0; i<numString.length(); i++){
            c = numString.charAt(i);
            if(Character.toString(c).equalsIgnoreCase(String.valueOf(nSelected))){
                cantN++;
            }
        }
        if(cantN == nRepe){
            haveNumero = true;
        }
        return haveNumero;
    }
}
