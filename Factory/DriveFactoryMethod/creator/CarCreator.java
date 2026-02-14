package Factory.DriveFactoryMethod.creator;

import Factory.DriveFactoryMethod.vehicle.Vehicle;

public class CarCreator extends VehicleCreator {
    @Override
    public Vehicle createVehicle() {
        return new Factory.DriveFactoryMethod.vehicle.Car();
    }
}
