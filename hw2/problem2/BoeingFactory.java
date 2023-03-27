class BoeingFactory implements AirplaneFactory {
    private static BoeingFactory instance = null;

    private BoeingFactory() {
        // private constructor to prevent instances from being created outside of the class
    }

    public static BoeingFactory getInstance() {
        if (instance == null) {
            instance = new BoeingFactory();
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Boeing is building an airplane.");
    }

    @Override
    public void repair() {
        System.out.println("Boeing is repairing an airplane.");
    }

    @Override
    public void restore() {
        System.out.println("Boeing is restoring an airplane.");
    }
}