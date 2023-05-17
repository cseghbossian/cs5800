import java.util.ArrayList;
import java.util.List;

class OpenMeteoData extends WeatherData {
    private List<Float> openMeteoData;

    public OpenMeteoData(float temperature, float humidity, float chanceOfRain, List<Float> openMeteoData) {
        super(temperature, humidity, chanceOfRain);
        this.openMeteoData = openMeteoData;
    }

    public List<Float> getOpenMeteoData() {
        return openMeteoData;
    }
}