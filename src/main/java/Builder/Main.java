package Builder;

public class Main {

    public static void main(String[] args) {
        Serveur serveur = new Serveur();

        PizzaBuilder pizzaOrientale = new PizzaOrientale();
        PizzaBuilder pizzaSavoyarde = new PizzaSavoyarde();

        serveur.setPizzaBuilder(pizzaOrientale);
        serveur.generatePizza();

        Pizza pizza = serveur.getPizza();
        System.out.println(pizza);


        serveur.setPizzaBuilder(pizzaSavoyarde);
        serveur.generatePizza();
        Pizza pizza1 = serveur.getPizza();
        System.out.println(pizza1);


    }
}
