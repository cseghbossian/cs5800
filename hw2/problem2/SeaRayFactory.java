// SeaRayFactory class
public class SeaRayFactory implements BoatFactory {
    private static SeaRayFactory instance = null;

    private SeaRayFactory() {}

    public static SeaRayFactory getInstance() {
        if (instance == null) {
            instance = new SeaRayFactory();
        }
        else {
            System.out.println("Instance already exists.");
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Sea Ray is building a boat.");
    }

    @Override
    public void repair() {
        System.out.println("Sea Ray is repairing a boat.");
    }

    @Override
    public void restore() {
        System.out.println("Sea Ray is restoring a boat.");
    }
}