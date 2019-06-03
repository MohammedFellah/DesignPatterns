package Builder;

import java.util.List;
import java.util.ArrayList;

public class Pizza {

    private String base;
    private String pate;
    private List<String> listeIngrédients;

    public void setBase(String base) {
        this.base = base;
    }

    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setListeIngrédients(List<String> listeIngrédients) {
        this.listeIngrédients = listeIngrédients;
    }

    public String toString(){
        return "Base :"+base+", Pate :"+pate+", Ingrédients :"+listeIngrédients;
    }




}
