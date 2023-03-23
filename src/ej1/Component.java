package ej1;

public abstract class Component {
    private int gente;

    public int getGente() {
        return gente;
    }

    public void setGente(int gente) {
        this.gente = gente;
    }

    public Component(int gente) {
        this.gente = gente;
    }

    public abstract void operacion();
    public abstract void add(Component component);
    public abstract void remove(Component component);
    public abstract Component get(int i);
}
