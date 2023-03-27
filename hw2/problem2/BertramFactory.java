// BertramFactory class
public class BertramFactory implements BoatFactory {
    private static BertramFactory instance = null;

    private BertramFactory() {}

    public static BertramFactory getInstance() {
        if (instance == null) {
            instance = new BertramFactory();
        }
        else {
            System.out.println("Instance already exists.");
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Bertram is building a boat.");
    }

    @Override
    public void repair() {
        System.out.println("Bertram is repairing a boat.");
    }

    @Override
    public void restore() {
        System.out.println("Bertram is restoring a boat.");
    }
}