package feuStateDesignPattern;

public class Main {

    public static void main(String[] args) {
        Couleur c = new Couleur();
        Couleur c1 = new Couleur();
        Couleur c2 = new Couleur();


        c.setEtatCouleur(new Orange());
        c.changer();

        c1.setEtatCouleur(new Rouge());
        c1.changer();

        c2.setEtatCouleur(new Vert());
        c2.changer();
    }
}
