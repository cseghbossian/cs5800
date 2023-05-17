import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create the weather forecast system
        WeatherForecastSystem weatherForecastSystem = new WeatherForecastSystem();

        // Add weather strategies
        weatherForecastSystem.addStrategy(new WeatherApi());
        weatherForecastSystem.addStrategy(new WeatherGov());
        weatherForecastSystem.addStrategy(new OpenMeteo());

        // Create subscribers
        User user1 = new User("Celine");
        User user2 = new User("Laila");

        // Subscribe users to weather updates
        weatherForecastSystem.subscribe(user1);
        weatherForecastSystem.subscribe(user2);

        // Get weather forecast and notify subscribers
        weatherForecastSystem.notifySubscribers();
    }
}