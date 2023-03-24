package ej2;

public class Cargador extends Decorator{
    private Decorator decorator;
    public Cargador(Celular celular, Decorator decorator, int costo) {
        super(celular);
        this.decorator = decorator;
        this.costo = costo;
    }

    private int costo;

    @Override
    public void metodo(){
        int ty2= 0;
        ty2 = decorator.getPrecio()+costo;
        System.out.println("EL precio es de: "+ty2);
        System.out.println("de marca samsung");
        System.out.println("Su tamaño es de 8 pulgadas");
    }
}
