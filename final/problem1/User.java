class User implements Observer {
    private String id;

    public User(String id) {
        this.id = id;
    }

    @Override
    public void update(WeatherData data) {
        System.out.println("User " + id + " received weather update: Temperature: " + data.getTemperature()
            + ", Humidity: " + data.getHumidity() + ", Chance of Rain: " + data.getChanceOfRain());
    }
}