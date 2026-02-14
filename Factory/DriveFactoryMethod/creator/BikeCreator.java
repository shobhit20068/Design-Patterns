package Factory.DriveFactoryMethod.creator;

import Factory.DriveFactoryMethod.vehicle.Vehicle;

public class BikeCreator extends  VehicleCreator{
        @Override
        public Vehicle createVehicle() {
            return new Factory.DriveFactoryMethod.vehicle.Bike();
        }
}
