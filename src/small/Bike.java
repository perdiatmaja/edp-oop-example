package small;

import base.Vehicle;

public class Bike extends Vehicle {

    public Bike(String machine) {
        super(machine);
        driverLicense = "SIM C";
        vehicleType = "BIKE";
    }

    @Override
    public boolean isHaveAnotherSeat() {
        return true;
    }
}
