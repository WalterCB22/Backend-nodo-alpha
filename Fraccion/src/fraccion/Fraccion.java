package fraccion;

public class Fraccion {
    private Integer numerador;
    private Integer denominador;

    public Fraccion(Integer numerador){
        this.numerador = numerador;
        this.denominador = 1;

    }
    public Fraccion(Integer numerador, Integer denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    //metodo Get numerador
    public Integer getNumerador() {
        return numerador;
    }

    //metodo Set numerador
    public void setNumerador(Integer numerador) {
        this.numerador = numerador;
    }

    //metodo Get  denominador
    public Integer getDenominador() {
        return denominador;
    }

    //metodo Set denominador
    public void setDenominador(Integer denominador) {
        this.denominador = denominador;
    }


    //metodo sumar fracciones.

      public Fraccion sumar(Fraccion f1){
        Integer nuevoNumerador= numerador * f1.denominador + denominador * f1.numerador;
        Integer nuevoDenominador = denominador * f1.denominador;
        Fraccion nuevaFraccion = new Fraccion(nuevoNumerador, nuevoDenominador);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }


    //metodo sumar enteros
    public  Fraccion sumar(Integer f1){
        Integer nuevoNumerador= numerador  + denominador * f1;
       Fraccion nuevaFraccion = new Fraccion(nuevoNumerador,denominador);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    //metodo restar fracciones
    public Fraccion restar (Fraccion f1){
        Integer nuevoNumerador= numerador * f1.denominador - denominador * f1.numerador;
        Integer nuevoDenominador = denominador * f1.denominador;
        Fraccion nuevaFraccion = new Fraccion(nuevoNumerador, nuevoDenominador);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    //metodo restar enteros
    public Fraccion restar (Integer f1){
        Integer nuevoNumerador= numerador  - denominador * f1;
        Fraccion nuevaFraccion = new Fraccion(nuevoNumerador,denominador);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    public Fraccion producto(Fraccion f1){
        Integer nuevoNumerador= numerador * f1.numerador;
        Integer nuevoDenominador = denominador * f1.denominador;
        Fraccion nuevaFraccion = new Fraccion(nuevoNumerador, nuevoDenominador);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    //metodo restar enteros
    public Fraccion producto(Integer f1){
        Integer nuevoNumerador= numerador * f1;
        Fraccion nuevaFraccion = new Fraccion(nuevoNumerador, denominador);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }
    public Fraccion divicion(Fraccion f1){
        Integer nuevoNumerador= numerador * f1.denominador;
        Integer nuevoDenominador = denominador * f1.numerador;
        Fraccion nuevaFraccion = new Fraccion(nuevoNumerador, nuevoDenominador);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    //metodo restar enteros
    public Fraccion divicion(Integer f1){
        Integer nuevoDenominador= denominador * f1;
        Fraccion nuevaFraccion = new Fraccion(numerador, nuevoDenominador);
        nuevaFraccion.simplificar();
        return nuevaFraccion;
    }

    private int mcd() {
        int u = Math.abs(numerador);//valor absoluto del numerador
        int v = Math.abs(denominador); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    private void simplificar(){
        int n = mcd(); //se calcula el mcd de la fracción
        numerador = numerador / n;
        denominador = denominador / n;
    }


    @Override
    public String toString() {
        return numerador+"/" +denominador;

    }
}
