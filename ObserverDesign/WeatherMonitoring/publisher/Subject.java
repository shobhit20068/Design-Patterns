package ObserverDesign.WeatherMonitoring.publisher;

import ObserverDesign.WeatherMonitoring.subscribers.Observer;

public interface Subject {
    public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
