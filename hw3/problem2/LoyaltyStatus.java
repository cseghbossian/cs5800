public class LoyaltyStatus {


    private double totalSpent;

    public LoyaltyStatus(double totalSpent) {
        this.totalSpent = totalSpent;
    }

    public double applyDiscount(double totalCost) {
        if (totalSpent >= 50.0) {
            return totalCost * 0.9; 
        } else {
            return totalCost;
        }
    }
}
