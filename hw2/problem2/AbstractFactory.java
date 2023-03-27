// Abstract Factory for creating car and airplane factories
interface FactoryCreator {
    CarFactory createCarFactory();
    AirplaneFactory createAirplaneFactory();
    BoatFactory createBoatFactory(String factoryName);
}

class AbstractFactory implements FactoryCreator {
    private static AbstractFactory instance = null;

    private static AbstractFactory() {}

    public AbstractFactory getInstance() {
        if (instance == null) {
            instance = new AbstractFactory();
        }
        return instance;
    }

    @Override
    public CarFactory createCarFactory(String factoryName) {
        if (factoryName.equalsIgnoreCase("Honda")) {
            return new HondaFactory();
        } else if (factoryName.equalsIgnoreCase("Porsche")) {
            return new PorscheFactory();
        } else if (factoryName.equalsIgnoreCase("Tesla")) {
            return new TeslaFactory();
        } else {
            Sytem.out.println("Invalid car factory name.");
        }
    }

    @Override
    public AirplaneFactory createAirplaneFactory(String factoryName) {
        if (factoryName.equalsIgnoreCase("Airbus")) {
            return new AirbusFactory();
        } else if (factoryName.equalsIgnoreCase("Boeing")) {
            return new BoeingFactory();
        } else if (factoryName.equalsIgnoreCase("Embraer")) {
            return new EmbraerFactory();
        } else {
            Sytem.out.println("Invalid ariplane factory name.");
        }
    }


    @Override
    public BoatFactory createBoatFactory(String factoryName) {
        if (factoryName.equalsIgnoreCase("Bertram")) {
            return new BertramFactory();
        } else if (factoryName.equalsIgnoreCase("SeaRay")) {
            return new SeaRayFactory();
        } else if (factoryName.equalsIgnoreCase("Mastercraft")) {
            return new MastercraftFactory();
        } else {
            Sytem.out.println("Invalid boat factory name.");
        }
    }

}