package ej1;

public class Client {
    public static void main(String[] args) {


        //    public Zona(int gente, String nombre, String poa) {
        Zona z1 = new Zona(100, "Irpavi 2", "1234");
        Zona z2 = new Zona(100, "Irpavi 2", "1234");
        Zona z3 = new Zona(100, "Irpavi 2", "1234");
        Zona z4 = new Zona(100, "Irpavi 2", "1234");
        Zona z5 = new Zona(100, "Irpavi 2", "1234");
        Zona z6 = new Zona(100, "Irpavi 2", "1234");
        Zona z7 = new Zona(100, "Irpavi 2", "1234");
        Zona z8 = new Zona(100, "Irpavi 2", "1234");


        Composite urbe = new Composite(0,"Zona sur1","123123");

        urbe.add(z1);
        urbe.add(z2);
        urbe.operacion();

        Composite urbe1 = new Composite(0,"Zona sur2","123123");

        urbe1.add(z3);
        urbe1.add(z4);
        urbe1.operacion();


        Composite urbe2 = new Composite(0,"Zona sur3","123123");

        urbe2.add(z5);
        urbe2.add(z6);
        urbe2.operacion();

        Composite urbe3 = new Composite(0,"Zona sur4","123123");

        urbe3.add(z7);
        urbe3.add(z8);
        urbe3.operacion();

        Composite departamento = new Composite(0,"La Paz","123123");

        departamento.add(urbe);
        departamento.add(urbe1);

        Composite departamento1 = new Composite(0,"Cochabamba","1231233123");

        departamento1.add(urbe2);
        departamento1.add(urbe3);

        Composite bolivia = new Composite(0,"bolivia","46346");

        bolivia.add(departamento1);
        bolivia.add(departamento);

        bolivia.operacion();

    }
}
