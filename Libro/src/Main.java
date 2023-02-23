import libro.Libro;


public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Harry Potter", "Rowling", "Aventura", 100,true);
        System.out.println(libro1);

        libro1.prestar(true);
        System.out.println(libro1);
        libro1.devolver(true);
        System.out.println(libro1);



    }
}