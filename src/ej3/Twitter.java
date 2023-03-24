package ej3;

public class Twitter implements RedSocial{
    Estudio estudio;
    public Twitter(Estudio estudio){
        this.estudio =estudio;
    }

    @Override
    public void Mostrar() {
        System.out.println();
        System.out.println("Mediante el uso de Twitter: ");
        estudio.nivel();
    }
}
