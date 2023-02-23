import fraccion.Fraccion;

public class Main {
    public static void main(String[] args) {
        Fraccion f1 = new Fraccion(2,3);
        Fraccion f2 = new Fraccion(3,4);
        Fraccion f3 = new Fraccion(9);


        System.out.println("Sumar "+ f1+" + "+f2+" = "+f1.sumar(f2));

        System.out.println("Sumar "+f1+" + "+f3.getNumerador()+" = "+ f1.sumar(f3.getNumerador()));

        System.out.println("Restar "+ f1+" - "+f2+" = "+f1.restar(f2));

        System.out.println("Restar "+f1+" - "+f3.getNumerador()+" = "+ f1.restar(f3.getNumerador()));

        System.out.println("Multiplicar "+ f1+" *  "+f2+" = "+f1.producto(f2));

        System.out.println("Multiplicar "+f1+" * "+f3.getNumerador()+" = "+ f1.producto(f3.getNumerador()));

        System.out.println("Dividir "+ f1+" ÷ "+f2+" = "+f1.divicion(f2));

        System.out.println("Dividir "+f1+" ÷ "+f3.getNumerador()+" = "+ f1.divicion(f3.getNumerador()));


    }
}