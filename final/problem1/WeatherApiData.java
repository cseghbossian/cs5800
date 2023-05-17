import java.util.ArrayList;
import java.util.List;

class WeatherApiData extends WeatherData {
    private List<Float> weatherApiData;

    public WeatherApiData(float temperature, float humidity, float chanceOfRain, List<Float> weatherApiData) {
        super(temperature, humidity, chanceOfRain);
        this.weatherApiData = weatherApiData;
    }

    public List<Float> getWeatherApiData() {
        return weatherApiData;
    }
}