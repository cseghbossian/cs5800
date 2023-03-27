class AirbusFactory implements AirplaneFactory {
    private static AirbusFactory instance = null;

    private AirbusFactory() {
        // private constructor to prevent instances from being created outside of the class
    }

    public static AirbusFactory getInstance() {
        if (instance == null) {
            instance = new AirbusFactory();
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