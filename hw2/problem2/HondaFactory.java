class HondaFactory implements CarFactory {
    private static HondaFactory instance = null;

    private HondaFactory() {}

    public static HondaFactory getInstance() {
        if (instance == null) {
            instance = new HondaFactory();
        }
        else {
            System.out.println("Instance already exists.");
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