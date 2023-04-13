import java.util.ArrayList;

public class OrderSystem {
    private ArrayList<Food> menu;
    private ArrayList<Order> orders;

    public OrderSystem() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addFoodItem(Food foodItem) {
        menu.add(foodItem);
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void applyLoyaltyDiscount(Customer customer, double totalCost) {
        LoyaltyStatus loyaltyStatus = customer.getLoyaltyStatus();
        double discountedTotalCost = loyaltyStatus.applyDiscount(totalCost);
        System.out.println("Total after discount: " + discountedTotalCost);
    }
}