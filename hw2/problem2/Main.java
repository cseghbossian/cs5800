public class Main {
    public static void main(String[] args) {
        // create factory creator instance
        FactoryCreator factoryCreator = AbstractFactory.getInstance();

        // create car factories
        CarFactory hondaFactory = factoryCreator.createCarFactory("Honda");
        CarFactory porscheFactory = factoryCreator.createCarFactory("Porsche");
        CarFactory teslaFactory1 = factoryCreator.createCarFactory("Tesla");

        // create airplane factories
        AirplaneFactory airbusFactory = factoryCreator.createAirplaneFactory("Airbus");
        AirplaneFactory boeingFactory = factoryCreator.createAirplaneFactory("Boeing");
        AirplaneFactory embraerFactory = factoryCreator.createAirplaneFactory("Embraer");

        // attempt to create a second TeslaFactory and AirbusFactory
        CarFactory teslaFactory2 = factoryCreator.createCarFactory("Tesla");
        AirplaneFactory airbusFactory2 = factoryCreator.createAirplaneFactory("Airbus");

    }
}