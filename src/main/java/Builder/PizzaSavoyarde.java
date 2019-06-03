package Builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaSavoyarde extends PizzaBuilder {


    public void buildBase() {
        pizza.setBase("Creme fraiche");
    }

    public void buildPate() {
        pizza.setPate("Moelleuse");
    }

    public void buildIngredients() {
        List<String> listeSavoyarde = new ArrayList<String>();
        listeSavoyarde.add("Poulet");
        listeSavoyarde.add("lardons");
        listeSavoyarde.add("frommage");
        pizza.setListeIngrédients(listeSavoyarde);

    }
}
