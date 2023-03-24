package ej3;

public class Whats implements RedSocial{
    Estudio estudio;
    public Whats(Estudio estudio){
        this.estudio =estudio;
    }

    @Override
    public void Mostrar() {
        System.out.println();
        System.out.println("Mediante el uso de Whatsapp: ");
        estudio.nivel();
    }
}
