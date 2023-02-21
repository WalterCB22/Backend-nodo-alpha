package Exercise2;

import java.awt.event.KeyListener;

public class Contador {

    private int cont;

    public Contador(){
        this.cont = 0;
    }
    public Contador(int cont) {
        this.cont = cont;
    }
    public Contador(Contador contador){
        this.cont = contador.cont;
    }

    public void incrementar(){
        cont++;
    }
    public void decrementar(){
        cont --;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }
}
