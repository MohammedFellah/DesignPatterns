package Builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaOrientale extends PizzaBuilder {


    public void buildBase() {
        pizza.setBase("Tomate");
    }

    public void buildPate() {
        pizza.setPate("Croustillante");
    }

    public void buildIngredients() {
        List<String> listeOrientale = new ArrayList<String>();
        listeOrientale.add("olives");
        listeOrientale.add("oeufs");
        listeOrientale.add("Merguez");
        pizza.setListeIngrédients(listeOrientale);

    }
}
