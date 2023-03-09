// Crea una clase Contador (si, contador de programcion) con metodos que
// permitan incrementar y decrementar su valor. La clase contendra un
// constructor por defecto, un constructor con parametros, un constructor
// de copia y los setters y getters que corresponden.

public class Contador {
    private int valor;

    // Constructor por defecto
    public Contador() {
        this.valor = 0;
    }

    // Constructor con parámetros
    public Contador(int valor) {
        this.valor = valor;
    }

    // Constructor de copia
    public Contador(Contador contador) {
        this.valor = contador.valor;
    }

    // Métodos de acceso
    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Métodos de la clase
    public void incrementar() {
        this.valor++;
    }

    public void decrementar() {
        this.valor--;
    }
}

