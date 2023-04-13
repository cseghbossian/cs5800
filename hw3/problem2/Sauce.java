public class Sauce extends ToppingDecorator {
    public Sauce(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "-- Add Sauce";
    }
}
