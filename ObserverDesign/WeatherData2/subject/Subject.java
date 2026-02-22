package ObserverDesign.WeatherData2.subject;

import ObserverDesign.WeatherData2.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
