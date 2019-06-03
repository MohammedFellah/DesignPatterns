package fabrique;

import java.util.List;

public class PizzaFactory {


        public static Pizza getPizza(String base,String nom, String pate, List<String> listIngredients){
            if("Tomate".equalsIgnoreCase(base)) return new BaseTomate(nom,pate,listIngredients);
            else if("Creme".equalsIgnoreCase(base)) return new BaseCreme(nom,pate,listIngredients);

            return null;
        }
    }


