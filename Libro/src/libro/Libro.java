package libro;

public class Libro {
    private String nombre;
    private String autor;
    private String categoria;

    private Integer numeroPag;

    private  Boolean disponible;

    public Libro() {
        nombre = "";
        autor= "";
        categoria = "";
        numeroPag = 0;
    }
     public Libro (Libro lib){
        this.nombre = lib.getNombre();
        this.autor = lib.getAutor();
        this.categoria = lib.getCategoria();
        this.numeroPag = lib.numeroPag;
     }

    public Libro(String nombre, String autor, String categoria, Integer numeroPag, Boolean disponible) {
        this.nombre = nombre;
        this.autor = autor;
        this.categoria = categoria;
        this.numeroPag = numeroPag;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public void prestar(Boolean libro){
       if (this.disponible.equals(false)){
           System.out.println("No esta disponible");
       }else{
           this.disponible = false;
       }

    }

    public void devolver(Boolean libro){
        if (this.disponible.equals(true)){
            System.out.println("El libro se encuentra disponible");
        }else{
            this.disponible = true;
        }

    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", numeroPag=" + numeroPag +
                ", disponible=" + disponible +
                '}';
    }
}
