package ObserverDesign.WeatherData2.observer;

import ObserverDesign.WeatherData2.subject.WeatherData;

public class Website implements Observer{
    float temp;
    float pressure;
    float humidity;
    WeatherData weatherData;

    public Website(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("[Website] : temp: " + temp + ", humidity : "
                + humidity + ", pressure: " + pressure);
    }
}
