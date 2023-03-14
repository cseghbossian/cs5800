public class Main {
    public static void main(String[] args) {
        Ship[] ships = new Ship[3];
        ships[0] = new Ship("Ship Celine", "1997");
        ships[1] = new CruiseShip("Carnival Cruise Ship", "2023", 3333);
        ships[2] = new CargoShip("The Fancy Cargo Ship", "2023", 44444);

        for (Ship ship : ships) {
            ship.print();
        }
    }
}