public abstract class ToppingDecorator implements Food {
    protected Food food;

    public ToppingDecorator(Food food) {
        this.food = food;
    }

    @Override
    public double getPrice() {
        return food.getPrice();
    }

    @Override
    public String getDescription() {
        return food.getDescription();
    }
}