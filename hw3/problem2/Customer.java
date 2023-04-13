public class Customer {
    private String name;
    private LoyaltyStatus loyaltyStatus;

    public Customer(String name, double totalSpent) {
        this.name = name;
        this.loyaltyStatus = new LoyaltyStatus(totalSpent);
    }

    public String getName() {
        return name;
    }

    public LoyaltyStatus getLoyaltyStatus() {
        return loyaltyStatus;
    }

    public void setLoyaltyStatus(LoyaltyStatus loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }
}

