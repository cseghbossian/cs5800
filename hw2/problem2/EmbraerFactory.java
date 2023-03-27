class EmbraerFactory implements AirplaneFactory {
    private static EmbraerFactory instance = null;

    private EmbraerFactory() {
        // private constructor to prevent instances from being created outside of the class
    }

    public static EmbraerFactory getInstance() {
        if (instance == null) {
            instance = new EmbraerFactory();
        }
        return instance;
    }

    @Override
    public void build() {
        System.out.println("Embraer is building an airplane.");
    }

    @Override
    public void repair() {
        System.out.println("Embraer is repairing an airplane.");
    }

    @Override
    public void restore() {
        System.out.println("Embraer is restoring an airplane.");
    }
}