package fabrique;

import java.util.List;

public class BaseTomate extends Pizza {


    private String nom1;
    private String Pate1;
    private List<String> ListIngredients1;


    public BaseTomate(String nom1,String pate1, List<String> listIngredients1) {
        this.Pate1 = pate1;
        this.ListIngredients1 = listIngredients1;
        this.nom1=nom1;
    }

    public String getNom() {
        return this.nom1;
    }

    public String getPate() {
        return this.Pate1;
    }

    public List<String> getListIngredients() {
        return this.ListIngredients1;
    }
}
