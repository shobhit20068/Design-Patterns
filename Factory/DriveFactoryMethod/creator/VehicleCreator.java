package Factory.DriveFactoryMethod.creator;

import Factory.DriveFactoryMethod.vehicle.Vehicle;

public abstract class VehicleCreator {
    public abstract Vehicle createVehicle();

    public void drive() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
