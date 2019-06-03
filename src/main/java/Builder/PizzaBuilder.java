package Builder;

public abstract class PizzaBuilder {

    protected Pizza pizza;


    public Pizza getPizza(){
        return pizza;
    }

    public void createPizza(){
         pizza = new Pizza();
    }

    public abstract void buildBase();
    public abstract void buildPate();
    public abstract void buildIngredients();


}
