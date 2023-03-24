package ej1;

public class Zona extends Component{
  //  (nombre, numeroHabitantes, poa),
    private String nombre;

    private String poa;

    public Zona(int gente, String nombre, String poa) {
        super(gente);
        this.nombre = nombre;
        this.poa = poa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoa() {
        return poa;
    }

    public void setPoa(String poa) {
        this.poa = poa;
    }

    @Override
    public void operacion() {
        System.out.println("El nombre de este lugar es: "+getNombre());
        System.out.println("La cantida de gente en este lugar es de: "+getGente());
        System.out.println("El POA es: "+getPoa());
    }

    @Override
    public void add(Component component) {
        System.out.println("No se hace nada aqui");
    }

    @Override
    public void remove(Component component) {
        System.out.println("No se hace nada aqui");
    }

    @Override
    public Component get(int i) {
        System.out.println("No se hace nada aqui");
        return null;
    }
}
