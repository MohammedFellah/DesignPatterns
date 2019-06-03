package strategy;

import strategy.strategyPackage.IFly;

public class Animal {

    private String nom;
    private String couleur;

    //on créé une instance de l'interface IFly qui contient la méthode Fly
    public IFly flyingType;

    public Animal(String nom, String couleur) {
        this.nom = nom;
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public String getCouleur() {
        return couleur;
    }


    public String tryToFly(){
        return flyingType.fly();
    }

    public void setAbilityToFly(IFly ability){
        flyingType = ability;
    }

    public String toString(){
        return this.nom+", "+this.couleur;
    }

}
