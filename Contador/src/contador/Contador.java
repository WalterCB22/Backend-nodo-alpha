package contador;

public class Contador {
    private  Integer cont;

    public Contador(Integer cont) {
        this.cont = cont;
    }

    public Integer getCont() {
        return cont;
    }
    public Contador(Contador cont){
        this.cont = cont.getCont();
    }

    public void setCont(Integer cont) {
        this.cont = cont;
    }

    public  void incrementarCont(){
        cont++;
    }

    public void decrementarCont(){
        cont--;
    }
}
