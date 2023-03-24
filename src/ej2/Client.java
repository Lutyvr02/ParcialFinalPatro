package ej2;

public class Client {
    public static void main(String[] args) {
        Celular cel = new Android();
        Decorator dec = new Decorator(cel);
        cel = new RAM(cel,dec,110,50);
        cel.metodo();
        cel =new Audifonos(cel,dec,100);
        cel.metodo();
        cel = new Cargador(cel,dec,100);
        cel.metodo();
    }
}
