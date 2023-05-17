import java.util.ArrayList;
import java.util.List;

class WeatherGovData extends WeatherData {
    private List<Float> weatherGovData;

    public WeatherGovData(float temperature, float humidity, float chanceOfRain, List<Float> weatherGovData) {
        super(temperature, humidity, chanceOfRain);
        this.weatherGovData = weatherGovData;
    }

    public List<Float> getWeatherGovData() {
        return weatherGovData;
    }
}
