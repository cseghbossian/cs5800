import java.util.ArrayList;
import java.util.List;

class OpenMeteo implements WeatherStrategy {
    @Override
    public WeatherData getWeather(String location) {
        System.out.println("Fetching weather data from Open-Meteo for location: " + location);

        float temperature = 22.0f;
        float humidity = 0.75f;
        float chanceOfRain = 0.6f;
        List<Float> openMeteoData = new ArrayList<>();

        return new OpenMeteoData(temperature, humidity, chanceOfRain, openMeteoData);
    }
}