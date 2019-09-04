import base.Vehicle;
import small.Bike;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Bike("Carburator");
        printlnStringList("Vehicle Type : " + vehicle.getVehicleType(),
                "Machine : " + vehicle.getMachine(),
                "License Type : " + vehicle.getDriverLicense(),
                "Have another seat : " + anotherSeat(vehicle.isHaveAnotherSeat()));
    }

    private static String anotherSeat(boolean haveAnotherSeat) {
        return haveAnotherSeat? "YES" : "NO";
    }

    private static void printlnStringList(String... texts) {
        for (String text: texts) {
            System.out.println(text);
        }
    }
}
