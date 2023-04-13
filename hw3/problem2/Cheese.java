
public class Cheese extends ToppingDecorator {
    public Cheese(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "-- Add Cheese";
    }
}