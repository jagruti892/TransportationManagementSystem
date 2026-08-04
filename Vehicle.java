// Abstract Parent Class
public abstract class Vehicle {

    protected int vehicleId;
    protected String vehicleNumber;
    protected int capacity;

    public Vehicle(int vehicleId, String vehicleNumber, int capacity) {

        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
    }

    public abstract void displayVehicleDetails();
}
