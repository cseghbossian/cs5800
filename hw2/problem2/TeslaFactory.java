public class TeslaFactory implements CarFactory {
    private static TeslaFactory instance = null;

    private TeslaFactory() {}

    public static TeslaFactory getInstance() {
        if (instance == null) {
            instance = new TeslaFactory();
        }
        else {
            System.out.println("Instance already exists.");
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Tesla is building a car.");
    }

    @Override
    public void repair() {
        System.out.println("Tesla is repairing a car.");
    }

    @Override
    public void restore() {
        System.out.println("Tesla is restoring a car.");
    }
}