class AirbusFactory implements AirplaneFactory {
    private static AirbusFactory instance = null;

    private AirbusFactory() {}

    public static AirbusFactory getInstance() {
        if (instance == null) {
            instance = new AirbusFactory();
        }
        else {
            System.out.println("Instance already exists.");
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Airbus is building an airplane.");
    }

    @Override
    public void repair() {
        System.out.println("Airbus is repairing an airplane.");
    }

    @Override
    public void restore() {
        System.out.println("Airbus is restoring an airplane.");
    }
}