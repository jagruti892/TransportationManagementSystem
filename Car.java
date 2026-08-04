public class Car extends Vehicle {

    private boolean automatic;

    public Car(int vehicleId, String vehicleNumber, int capacity, boolean automatic) {

        super(vehicleId, vehicleNumber, capacity);
        this.automatic = automatic;
    }

    @Override
    public void displayVehicleDetails() {

        System.out.println("\n----------- Car Details -----------");
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Capacity : " + capacity);
        System.out.println("Automatic : " + automatic);
    }
}