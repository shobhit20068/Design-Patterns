package ObserverDesign.WeatherMonitoring.subscribers;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
