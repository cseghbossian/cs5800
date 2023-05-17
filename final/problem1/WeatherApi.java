import java.util.ArrayList;
import java.util.List;

class WeatherApi implements WeatherStrategy {
    @Override
    public WeatherData getWeather(String location) {
        System.out.println("Fetching weather data from WeatherAPI for location: " + location);

        float temperature = 25.0f;
        float humidity = 0.65f;
        float chanceOfRain = 0.2f;
        List<Float> weatherApiData = new ArrayList<>();

        return new WeatherApiData(temperature, humidity, chanceOfRain, weatherApiData);
    }
}