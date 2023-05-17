import java.util.ArrayList;
import java.util.List;

class WeatherForecastSystem implements Subject {
    private List<WeatherStrategy> strategies;
    private List<Observer> subscribers;

    public WeatherForecastSystem() {
        this.strategies = new ArrayList<>();
        this.subscribers = new ArrayList<>();
    }

    public void addStrategy(WeatherStrategy strategy) {
        strategies.add(strategy);
    }

    public void removeStrategy(WeatherStrategy strategy) {
        strategies.remove(strategy);
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (WeatherStrategy strategy : strategies) {
            String location = "Pomona"; // Provide the desired location
            WeatherData weatherData = strategy.getWeather(location);
            weatherData.notifySubscribers();
        }
    }

    public WeatherData getWeatherForecast(String location) {
        return null;
    }
}