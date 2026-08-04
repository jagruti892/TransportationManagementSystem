public class Taxi extends Vehicle {

    private String driverName;

    public Taxi(int vehicleId, String vehicleNumber, int capacity, String driverName) {

        super(vehicleId, vehicleNumber, capacity);
        this.driverName = driverName;
    }

    @Override
    public void displayVehicleDetails() {

        System.out.println("\n----------- Taxi Details -----------");
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Capacity : " + capacity);
        System.out.println("Driver Name : " + driverName);
    }
}