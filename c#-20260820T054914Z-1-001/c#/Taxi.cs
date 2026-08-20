// Inheritance
// Taxi class inherits properties like vehicleId, vehicleNumber,
// and capacity from the Vehicle class.

public class Taxi : Vehicle
{
    // Taxi class has its own property as driverName
    private string driverName;

    public Taxi(int vehicleId, string vehicleNumber, int capacity, string driverName)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.driverName = driverName;
    }

    // Method overriding
    public override void displayVehicleDetails()
    {
        Console.WriteLine("\n----------- Taxi Details -----------");
        Console.WriteLine("Vehicle ID : " + vehicleId);
        Console.WriteLine("Vehicle Number : " + vehicleNumber);
        Console.WriteLine("Capacity : " + capacity);
        Console.WriteLine("Driver Name : " + driverName);
    }
}