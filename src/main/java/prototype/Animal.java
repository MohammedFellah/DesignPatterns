package prototype;

public abstract class Animal implements Cloneable {

    public abstract String getNom();
    public abstract  String getCouleur();

    public abstract Animal makeCopy();
    public abstract Animal updateAnimal(String newCouleur, String newNom);

}
