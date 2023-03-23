package ej2;

public class RAM extends Decorator{
    private Decorator decorator;
    public RAM(Celular celular, Decorator decorator, int capacidad, int costo) {
        super(celular);
        this.decorator = decorator;
        this.capacidad = capacidad;
        this.costo = costo;
    }
    private int capacidad;

    private int costo;

    @Override
    public void metodo(){
        int ty = 0;
        ty = decorator.getRam()+capacidad;
        int ty2= 0;
        ty2 = decorator.getPrecio()+costo;
        System.out.println("La cantidad de memoria nueva es de: "+ty);
        System.out.println("EL precio es de: "+ty2);
        System.out.println("de marca samsung");
    }
}
