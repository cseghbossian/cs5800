import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String pizzaChain;
    private String size;
    private List<String> toppings;

    public static class PizzaBuilder {
        private String pizzaChain;
        private String size;
        private List<String> toppings = new ArrayList<>();

        public PizzaBuilder(String pizzaChain, String size) {
            this.pizzaChain = pizzaChain;
            this.size = size;
        }

        public PizzaBuilder addTopping(String topping) {
            toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }

    private Pizza(PizzaBuilder builder) {
        this.pizzaChain = builder.pizzaChain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        System.out.println("I'm eating the following pizza:");
        System.out.println("Size: " +size);
        System.out.println("Toppings: ");
        for (String topping : toppings) {
            System.out.println(topping);
        }
        System.out.println("Purchased from: " + pizzaChain + "\n");
    }
}
