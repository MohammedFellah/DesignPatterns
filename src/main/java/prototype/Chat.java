package prototype;

public class Chat extends Animal{

    private String couleur;
    private String nom;

    public Chat(String couleur, String nom) {
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
        Chat chat1 = null;

        try {
            chat1 = (Chat) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return chat1;

    }

    public Animal updateAnimal(String newCouleur, String newNom) {
        return new Chat(newCouleur,newNom);
    }


    public String toString(){
        return "** "+this.getNom()+"** , **"+this.getCouleur()+"**";
    }
}
