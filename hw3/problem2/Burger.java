public class Burger implements Food {
    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Burger";
    }
}
