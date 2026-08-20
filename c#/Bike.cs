// Inheritance
// Bike class inherits properties like vehicleId, vehicleNumber,
// and capacity from the Vehicle class.

public class Bike : Vehicle
{
    // Bike class has its own property as helmetAvailable
    private bool helmetAvailable;

    public Bike(int vehicleId, string vehicleNumber, int capacity, bool helmetAvailable)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.helmetAvailable = helmetAvailable;
    }

    // Method overriding
    public override void displayVehicleDetails()
    {
        Console.WriteLine("\n----------- Bike Details -----------");
        Console.WriteLine("Vehicle ID : " + vehicleId);
        Console.WriteLine("Vehicle Number : " + vehicleNumber);
        Console.WriteLine("Capacity : " + capacity);
        Console.WriteLine("Helmet Available : " + helmetAvailable);
    }
}