class HondaFactory implements CarFactory {
    private static HondaFactory instance = null;

    private HondaFactory() {
        // private constructor to prevent instances from being created outside of the class
    }

    public static HondaFactory getInstance() {
        if (instance == null) {
            instance = new HondaFactory();
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Honda is building a car.");
    }

    @Override
    public void repair() {
        System.out.println("Honda is repairing a car.");
    }

    @Override
    public void restore() {
        System.out.println("Honda is restoring a car.");
    }
}