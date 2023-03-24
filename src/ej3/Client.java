package ej3;

public class Client {
    public static void main(String[] args) {


        Universidad uni = new Universidad("UPB", 100, "Ser cool");

        Colegio col = new Colegio("San Ignacio", 100, "Ser solidario");

        Escuela esc = new Escuela("San Jorge", 20, "No ser flojo");

        Twitter twitter = new Twitter(uni);

        Whats whats = new Whats(col);

        Facebook facebook = new Facebook(esc);

        twitter.Mostrar();
        whats.Mostrar();
        facebook.Mostrar();
    }
}