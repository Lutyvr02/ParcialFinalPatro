package ej2;

public class Decorator implements Celular{
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

    private Celular celular;

    public Decorator(Celular celular){
        this.celular = celular;
    }
    @Override
    public void metodo() {
        System.out.println("Mejorando celular'");
    }
}
