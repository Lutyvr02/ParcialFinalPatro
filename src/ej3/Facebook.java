package ej3;

public class Facebook implements RedSocial{
    Estudio estudio;
    public Facebook(Estudio estudio){
        this.estudio =estudio;
    }

    @Override
    public void Mostrar() {
        System.out.println();
        System.out.println("Mediante el uso de Facebook: ");
        estudio.nivel();
    }
}
