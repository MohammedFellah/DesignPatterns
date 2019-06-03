package fabrique;

import java.util.List;

public class BaseCreme extends Pizza {

    private String nom;
    private String Pate;
    private List<String> ListIngredients;


    public BaseCreme(String nom, String pate, List<String> listIngredients) {
        this.Pate = pate;
        this.ListIngredients = listIngredients;
        this.nom=nom;
    }

    public String getNom() {
        return this.nom;
    }

    public String getPate() {
        return this.Pate;
    }

    public List<String> getListIngredients() {
        return this.ListIngredients;
    }
}
