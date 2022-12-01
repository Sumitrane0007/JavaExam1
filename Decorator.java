public class Decorator {
    public static void main(String args[])
    {
        Pizza pizza = new MushroomPizza();
        Pizza mPizza = new PizzaWithToppings(new MushroomPizza());
        Pizza cPizza = new PizzaWithToppings(new ChickenPizza());

        System.out.println("\nPlain Pizza with no toppings.");
        pizza.getPizza();

        System.out.println("");

        System.out.println("Pizza with mushroom toppings");
        mPizza.getPizza();

        System.out.println("Pizza with chicken topping-");
        cPizza.getPizza();

    }
}
