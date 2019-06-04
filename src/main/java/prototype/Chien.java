package prototype;

public class Chien extends Animal {

    private String couleur;
    private String nom;

    public Chien(String couleur, String nom) {
        this.couleur = couleur;
        this.nom = nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getNom() {
        return nom;
    }

    public Animal makeCopy() {
        Chien chien1 = null;
        try {
            chien1 = (Chien) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return chien1;
    }

    public Animal updateAnimal(String newCouleur, String newNom) {
        return new Chien(newCouleur,newNom);
    }

    public String toString(){
        return "**"+this.getNom()+"** , **"+this.getCouleur()+"**";
    }
}
