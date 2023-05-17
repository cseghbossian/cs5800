import java.util.ArrayList;
import java.util.List;

// Weather data classes

class WeatherData {
    private float temperature;
    private float humidity;
    private float chanceOfRain;
    private List<User> subscribers;

    public WeatherData(float temperature, float humidity, float chanceOfRain) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.chanceOfRain = chanceOfRain;
        this.subscribers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getChanceOfRain() {
        return chanceOfRain;
    }

    public void notifySubscribers() {
        for (User subscriber : subscribers) {
            subscriber.update(this);
        }
    }
}
