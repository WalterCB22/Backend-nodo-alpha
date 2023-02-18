import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static  float precio;
    private static  String producto;

    public static void main(String[] args) {
        Map<String, Float> tienda = new HashMap<>();
        Scanner src = new Scanner(System.in);
        byte valor;
        do {
            System.out.println("1. - Introducir Producto");
            System.out.println("2. - Modifcar Precio");
            System.out.println("3. - Mostrar todos los productos");
            System.out.println("4. - Eliminar producto");
            System.out.println("5. - Salir");
            System.out.print("Ingrese el numero de la opcion que desea: ");
            valor = src.nextByte();
            switch (valor) {
                case 1:
                    introducirProd(tienda);
                    break;

                case 2:
                    modificarPrecio(tienda);
                    break;

                case 3:
                    mostrarProductos(tienda);
                    break;

                case 4:
                    eliminarProducto(tienda);
                    break;

                default:
                    System.out.println("\nIngrese un valor que corresponda a la lista\n");
            }


        } while (valor != 5);

    }


    public static void introducirProd( Map<String, Float> tienda) {
        Scanner src = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        producto = src.next();
        System.out.print("Ingrese el precio del producto: ");
        precio = src.nextFloat();
        tienda.put(producto, precio);
        System.out.println("\n¡Generado con exito!\n");

    }

    public static void modificarPrecio(Map<String, Float> tienda) {

        if (tienda.isEmpty()) {
            System.out.println("\nEsta vacia\n");
        } else {
            Scanner src = new Scanner(System.in);
            System.out.println("Ingrese el nombre del producto: ");
            producto = src.next();
            if (tienda.containsKey(producto)) {
                System.out.println("Ingrese el  nuevo precio del producto: ");
                precio = src.nextFloat();
                tienda.replace(producto, precio);
                System.out.println("\n¡Modificado!\n");

            } else {
                System.out.println("\nNo existe un producto nombrado: " + producto);
            }

        }

    }

    public static void mostrarProductos(Map<String, Float> tienda) {
        if (tienda.isEmpty()) {
            System.out.println("\n¡Esta vacia \n");
        } else {
            System.out.println();
            for (String i : tienda.keySet()) {
                System.out.println("Producto: " + i + " - Precio:  " + tienda.get(i));
            }
            System.out.println();
        }
    }

    public static void eliminarProducto(Map<String, Float> tienda) {
        if (tienda.isEmpty()) {
            System.out.println("\nEsta vacia\n");
        } else {
            Scanner src = new Scanner(System.in);
            System.out.println("Ingrese el nombre del producto: ");
            producto = src.next();
            if (tienda.containsKey(producto)) {
                tienda.remove(producto);
                System.out.println("\n¡Removido!\n");
            } else {
                System.out.println("\n¡No existe un producto nombrado: " + producto);
            }

        }


    }

}