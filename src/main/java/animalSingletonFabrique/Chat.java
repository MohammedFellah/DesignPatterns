package animalSingletonFabrique;

public class Chat extends Animal {

    private String couleur;
    private String nom;

    private static Chat chat = new Chat("Orange","Garfield");

    private Chat(String couleur, String nom){
        this.couleur=couleur;
        this.nom=nom;
    }

    public String getCouleur() {
        return this.couleur;
    }

    public String getNom() {
        return this.nom;
    }

    public static Chat getInstanceChat(){
        return chat;
    }
}
