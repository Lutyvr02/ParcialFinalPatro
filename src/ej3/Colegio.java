package ej3;

public class Colegio implements Estudio{
    private String nombre;
    private int capacidad;
    private String requisito;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    public Colegio(String nombre, int capacidad, String requisito) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.requisito = requisito;
    }

    @Override
    public void nivel() {
        System.out.println("El nombre del colegio es: "+getNombre());
        System.out.println("Los requisitos son: "+getRequisito());
        System.out.println("La capacidad es: "+getNombre());
        System.out.println("Los estudiantes son 65");

    }
}
