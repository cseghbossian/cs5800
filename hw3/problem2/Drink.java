
public class Drink implements Food {
    @Override
    public double getPrice() {
        return 1.0;
    }

    @Override
    public String getDescription() {
        return "Drink";
    }
}