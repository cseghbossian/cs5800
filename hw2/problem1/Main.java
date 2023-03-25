public class Main {
    public static void main(String[] args) {

        // Part 1

        Pizza pizza0 = new Pizza.PizzaBuilder("Pizza Hut", "S")
                .addTopping("Olives")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .build();
        pizza0.eat();

        Pizza pizza1 = new Pizza.PizzaBuilder("Pizza Hut", "M")
                .addTopping("Olives")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Spinach")
                .build();
        pizza1.eat();

        Pizza pizza2 = new Pizza.PizzaBuilder("Pizza Hut", "L")
                .addTopping("Olives")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Spinach")
                .addTopping("Spicy Pork")
                .addTopping("Ham")
                .addTopping("Pineapples")
                .build();
        pizza2.eat();

        // Part 2

        Pizza pizza3 = new Pizza.PizzaBuilder("Pizza Hut", "L")
                .addTopping("Olives")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .build();
        pizza3.eat();

        Pizza pizza4 = new Pizza.PizzaBuilder("Pizza Hut", "M")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Spinach")
                .addTopping("Spicy Pork")
                .addTopping("Ham")
                .addTopping("Pineapples")
                .build();
        pizza4.eat();

        Pizza pizza5 = new Pizza.PizzaBuilder("Little Caesar", "S")
                .addTopping("Mushrooms")
                .build();
        pizza5.eat();

        Pizza pizza6 = new Pizza.PizzaBuilder("Little Caesar", "S")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .build();
        pizza6.eat();

        Pizza pizza7 = new Pizza.PizzaBuilder("Dominoes", "S")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Spinach")
                .addTopping("Spicy Pork")
                .build();
        pizza7.eat();

        Pizza pizza8 = new Pizza.PizzaBuilder("Dominoes", "L")
                .addTopping("Mushrooms")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .build();
        pizza8.eat();
    }
}