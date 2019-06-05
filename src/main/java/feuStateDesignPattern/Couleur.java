package feuStateDesignPattern;

public class Couleur {
    private EtatCouleur etatCouleur;

    public void setEtatCouleur(EtatCouleur newCouleur) {
        this.etatCouleur = newCouleur;
    }

    public void changer(){
        etatCouleur.changerEtat(this);
    }

}
