package fabrique;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> orientale = new ArrayList<String>();
        orientale.add("olives");
        orientale.add("Oeufs");
        orientale.add("Merguez");

        List<String> savoyarde = new ArrayList<String>();
        savoyarde.add("poulet");
        savoyarde.add("creme fraiche");
        savoyarde.add("lardons");

        Pizza pizza1 = PizzaFactory.getPizza("Tomate","Orientale","Fine",orientale);
        Pizza pizza2 = PizzaFactory.getPizza("Creme","Savoyarde","Classique", savoyarde);

        System.out.println("la premiere pizza est  : " + pizza1);
        System.out.println("la deuxieme pizza est : " + pizza2);

    }
}
