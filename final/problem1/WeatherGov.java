import java.util.ArrayList;
import java.util.List;

class WeatherGov implements WeatherStrategy {
    @Override
    public WeatherData getWeather(String location) {
        
        System.out.println("Fetching weather data from Weather.gov for location: " + location);
        float temperature = 23.5f;
        float humidity = 0.7f;
        float chanceOfRain = 0.4f;
        List<Float> weatherGovData = new ArrayList<>();

        return new WeatherGovData(temperature, humidity, chanceOfRain, weatherGovData);
    }
}