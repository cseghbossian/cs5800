// MastercraftFactory class
public class MastercraftFactory implements BoatFactory {
    private static MastercraftFactory instance = null;

    private MastercraftFactory() {}

    public static MastercraftFactory getInstance() {
        if (instance == null) {
            instance = new MastercraftFactory();
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Mastercraft is building a boat.");
    }

    @Override
    public void repair() {
        System.out.println("Mastercraft is repairing a boat.");
    }

    @Override
    public void restore() {
        System.out.println("Mastercraft is restoring a boat.");
    }
}