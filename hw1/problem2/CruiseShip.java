public class CruiseShip extends Ship {

    // Variables
    private int maxPassengers;

    // Constructor
    public CruiseShip(String name, String year, int maxPassengers) {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }

    // Accessor
    public int getMaxPassengers() {
        return maxPassengers;
    }

    // Mutator
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Print
    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nMax Passengers: " + getMaxPassengers());
    }
}