package base;

public abstract class Vehicle {

    private boolean startEngine;

    protected String driverLicense;

    private String machine;

    protected String vehicleType;

    public Vehicle(String machine) {
        this.machine = machine;
    }

    public abstract boolean isHaveAnotherSeat();

    public String getDriverLicense() {
        return driverLicense;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getMachine() {
        return machine;
    }

    public boolean isStartEngine() {
        return startEngine;
    }

    public void setStartEngine(boolean startEngine) {
        this.startEngine = startEngine;
    }
}
