package Builder;

public class Serveur {

    public PizzaBuilder pizzaBuilder;


    public void setPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder=pizzaBuilder;

    }

    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }

    public void generatePizza(){
        pizzaBuilder.createPizza();
        pizzaBuilder.buildBase();
        pizzaBuilder.buildPate();
        pizzaBuilder.buildIngredients();

    }
}