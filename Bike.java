public class Bike extends Vehicle {

    private boolean helmetAvailable;

    public Bike(int vehicleId, String vehicleNumber, int capacity, boolean helmetAvailable) {

        super(vehicleId, vehicleNumber, capacity);
        this.helmetAvailable = helmetAvailable;
    }

    @Override
    public void displayVehicleDetails() {

        System.out.println("\n----------- Bike Details -----------");
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Capacity : " + capacity);
        System.out.println("Helmet Available : " + helmetAvailable);
    }
}