package ej1;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private String nombre;

    private String poa;
    private int total;
    private final List<Component> lista = new ArrayList<>();
    public Composite(int gente, String nombre, String poa) {
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
        for (Component component:lista){
            component.operacion();
            setGente(total+=component.getGente());
        }
        System.out.println();
        System.out.println("El nombre de este lugar es: "+getNombre());
        System.out.println("La cantidad de gente sera de: "+getGente());
        System.out.println("El POA es: "+getPoa());
    }

    @Override
    public void add(Component component) {
        lista.add(component);
    }

    @Override
    public void remove(Component component) {
        lista.remove(component);

    }

    @Override
    public Component get(int i) {
        if (i > lista.size()){
            System.out.println("No hay nada en esta posicion");
        } else {
            return lista.get(i);
        }
        return null;
    }
}
