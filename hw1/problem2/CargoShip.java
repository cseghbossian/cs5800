public class CargoShip extends Ship {

    // Variales
    private int cargoCapacity;

    // Constructor
    public CargoShip(String name, String year, int cargoCapacity) {
        super(name, year);
        this.cargoCapacity = cargoCapacity;
    }

    // Accessor
    public int getCargoCapacity() {
        return cargoCapacity;
    }

    // Mutator
    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Print
    @Override
    public void print() {
        System.out.println("Name: " + getName() + "\nCargo Capacity: " + getCargoCapacity() + " tons");
    }
}