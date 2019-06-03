package animalSingletonFabrique;

public abstract class Animal {


    public abstract String getCouleur();
    public abstract String getNom();

    public String toString(){
        return "Nom :"+this.getNom()+", couleur: "+this.getCouleur();
    }
}
