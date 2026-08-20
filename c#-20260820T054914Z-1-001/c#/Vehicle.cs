// Abstract Parent Class
public abstract class Vehicle
{
    protected int vehicleId;
    protected string vehicleNumber;
    protected int capacity;

    public Vehicle(int vehicleId, string vehicleNumber, int capacity)
    {
        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
    }

    public abstract void displayVehicleDetails();
}