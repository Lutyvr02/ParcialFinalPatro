package ej2;

public class Audifonos extends Decorator{
    private Decorator decorator;
    public Audifonos(Celular celular,int costo) {
        super(celular);
        this.costo =costo;
    }

    private int costo;

    @Override
    public void metodo(){
        int ty2= 0;
        ty2 = decorator.getPrecio()+costo;
        System.out.println("EL precio es de: "+ty2);
        System.out.println("de marca samsung");
    }
}
