import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Food> items = new ArrayList<>();

    public void addItem(Food item) {
        items.add(item);
    }

    public double getTotalCost() {
        double totalCost = 0.0;
        for (Food item : items) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
}

