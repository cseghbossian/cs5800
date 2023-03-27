class PorscheFactory implements CarFactory {

    private static PorscheFactory instance = null;

    private PorscheFactory() {}

    public static PorscheFactory getInstance() {
        if (instance == null) {
            instance = new PorscheFactory();
        }
        else {
            System.out.println("Instance already exists.");
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Porsche is building a car.");
    }

    @Override
    public void repair() {
        System.out.println("Porsche is repairing a car.");
    }

    @Override
    public void restore() {
        System.out.println("Porsche is restoring a car.");
    }
}
