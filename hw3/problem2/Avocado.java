public class Avocado extends ToppingDecorator {
    public Avocado(Food food) {
        super(food);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 1.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "-- Add Avocado";
    }
}