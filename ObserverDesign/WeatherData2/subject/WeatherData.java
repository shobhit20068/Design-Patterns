package ObserverDesign.WeatherData2.subject;

import ObserverDesign.WeatherData2.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temp;
    private float humidity;
    private float pressure;
    private final List<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(temp,humidity,pressure);
        }
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }
}
