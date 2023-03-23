package ej2;

public class Huawei implements Celular{

    private int precio = 100;
    private int ram = 100;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public void metodo() {
        System.out.println("Este es un android");
        System.out.println("este celular tiene una ram de: ");
        System.out.println("La tienda es de pedro");
        System.out.println("los chips son 2");
        System.out.println("la build es 2.0");
        System.out.println("Su precio es: "+getPrecio());
        System.out.println("Su memoria es: "+getRam());
    }
}
