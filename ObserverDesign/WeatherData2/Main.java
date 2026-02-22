package ObserverDesign.WeatherData2;

import ObserverDesign.WeatherData2.observer.LobbyDisplay;
import ObserverDesign.WeatherData2.observer.PhoneApp;
import ObserverDesign.WeatherData2.observer.Website;
import ObserverDesign.WeatherData2.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        PhoneApp phoneApp = new PhoneApp(weatherData);
        Website website = new Website(weatherData);
        LobbyDisplay lobbyDisplay = new LobbyDisplay(weatherData);

        weatherData.setMeasurements(56,45,34);

        weatherData.removeObserver(lobbyDisplay);

        weatherData.setMeasurements(45,32,12);

        weatherData.registerObserver(lobbyDisplay);

        weatherData.notifyObservers();
    }
}
