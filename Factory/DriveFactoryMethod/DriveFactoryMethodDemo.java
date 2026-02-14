package Factory.DriveFactoryMethod;

import Factory.DriveFactoryMethod.creator.BikeCreator;
import Factory.DriveFactoryMethod.creator.CarCreator;
import Factory.DriveFactoryMethod.creator.VehicleCreator;

public class DriveFactoryMethodDemo {
    public static void main(String[] args) {
        VehicleCreator vehicleCreator;

        vehicleCreator = new CarCreator();
        vehicleCreator.drive();

        vehicleCreator = new BikeCreator();
        vehicleCreator.drive();


    }
}
