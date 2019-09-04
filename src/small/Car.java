package small;

import base.Vehicle;

public class Car extends Vehicle {

    public Car(String machine) {
        super(machine);
        vehicleType = "CAR";
        driverLicense = "SIM A";
    }

    @Override
    public boolean isHaveAnotherSeat() {
        return true;
    }
}
