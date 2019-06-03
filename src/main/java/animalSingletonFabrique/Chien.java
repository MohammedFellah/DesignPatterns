package animalSingletonFabrique;

public class Chien extends Animal {

    private String couleur;
    private String nom;

    private static Chien chien = new Chien("Blanc","rex");

    private Chien(String couleur,String nom){
        this.couleur=couleur;
        this.nom=nom;
    }


    public String getCouleur() {
        return this.couleur;
    }

    public String getNom() {
        return this.nom;
    }

    public static Chien getInstanceChien(){
        return chien;
    }
}
