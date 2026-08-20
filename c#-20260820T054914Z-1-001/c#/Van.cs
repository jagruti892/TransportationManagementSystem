// Inheritance
// Van class inherits properties like vehicleId, vehicleNumber,
// and capacity from the Vehicle class.

public class Van : Vehicle
{
    // Van class has its own property as loadCapacity
    private double loadCapacity;

    public Van(int vehicleId, string vehicleNumber, int capacity, double loadCapacity)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.loadCapacity = loadCapacity;
    }

    // Method overriding
    // Displays van details
    public override void displayVehicleDetails()
    {
        Console.WriteLine("\n----------- Van Details -----------");
        Console.WriteLine("Vehicle ID : " + vehicleId);
        Console.WriteLine("Vehicle Number : " + vehicleNumber);
        Console.WriteLine("Capacity : " + capacity);
        Console.WriteLine("Load Capacity : " + loadCapacity + " kg");
    }
}