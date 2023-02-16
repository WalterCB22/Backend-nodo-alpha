package maps_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MapsPractice {
    static Map<Integer, Product> productsMap = new HashMap<>();
    public static void main(String[] args) {

        Scanner leer  = new Scanner(System.in);
        int index;
        String name;
        double precio;
        System.out.println("(1)Agregar producto\n" +
                "(2)Modificar precio \n" +
                "(3)Eliminar producto \n" +
                "(4)Mostrar productos \n" +
                "(0)Salir");
        int option = leer.nextInt();
        while(option != 0){
            switch (option){
                case 1:
                    System.out.println("Nombre: ");
                    name = leer.next();
                    System.out.println("Precio: ");
                    precio = leer.nextInt();
                    Product product = new Product(name, precio);
                    addProduct(product);
                    break;
                case 2:
                    System.out.println("Modificar precio");
                    System.out.println("ingrese indice del producto a modificar: ");
                    index = leer.nextInt();
                    System.out.println("Ingrese precio actualizado: ");
                    precio = leer.nextDouble();
                    productsMap.get(index).setPrecio(precio);
                    System.out.println("Precio actualizado exitosamente");
                    break;
                case 3:
                    System.out.println("Eliminar producto");
                    System.out.println("Ingrese indice del productoa eliminar: ");
                    index = leer.nextInt();
                    deleteProduct(index);
                    break;
                case 4:
                    System.out.println("Mostrar producto y precio");
                    showProducts();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
            System.out.println("--------------------");
            System.out.println("(1)Agregar producto\n" +
                    "(2)Modificar precio \n" +
                    "(3)Eliminar producto \n" +
                    "(4)Mostrar productos \n" +
                    "(0)Salir");
            option = leer.nextInt();
        }
    }

    //1
    public static void addProduct(Product product){
        productsMap.put(productsMap.size(), product);
        System.out.println("Producto agregado exitosamente");

    }
    //3
    public static void deleteProduct(int index){
        productsMap.remove(index);
        System.out.println("Producto eliminado exitosamente");
    }
    //4
    public static void showProducts(){
        for (Integer i : productsMap.keySet()){
            System.out.println(i + ". " + productsMap.get(i).getName() + ", " + productsMap.get(i).getPrecio());
        }
    }
}
