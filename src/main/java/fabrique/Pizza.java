package fabrique;

import java.util.List;

public abstract class Pizza {

    public abstract String getNom();
    public abstract String getPate();
    public abstract List<String> getListIngredients();

    public String toString(){
        return this.getNom()+", Pate :"+this.getPate()+", Ingrédients :"+this.getListIngredients();
    }

}
