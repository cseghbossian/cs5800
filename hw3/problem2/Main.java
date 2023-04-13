public class Main {
    
    public static void main(String[] args) {


        // Create fo0d
        Food burger = new Burger();
        Food fries = new Fries();
        Food drink = new Drink();

        // Add toppings to the burger
        burger = new Cheese(burger);
        burger = new Avocado(burger);

        // Create customer
        Customer customer = new Customer("Celine", 60.0);

        // Create order
        Order order = new Order();
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(drink);

        // Create ordre system
        OrderSystem orderSystem = new OrderSystem();

        orderSystem.addFoodItem(burger);
        orderSystem.addFoodItem(fries);
        orderSystem.addFoodItem(drink);

        // Place order
        orderSystem.placeOrder(order);

        // Apply discount
        orderSystem.applyLoyaltyDiscount(customer, order.getTotalCost());
    }
}
