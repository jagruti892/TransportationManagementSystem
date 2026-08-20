// Inheritance
// Car class inherits properties like vehicleId, vehicleNumber,
// and capacity from the Vehicle class.

public class Car : Vehicle
{
    // Car class has its own property as automatic
    private bool automatic;

    public Car(int vehicleId, string vehicleNumber, int capacity, bool automatic)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.automatic = automatic;
    }

    // Method overriding
    public override void displayVehicleDetails()
    {
        Console.WriteLine("\n----------- Car Details -----------");
        Console.WriteLine("Vehicle ID : " + vehicleId);
        Console.WriteLine("Vehicle Number : " + vehicleNumber);
        Console.WriteLine("Capacity : " + capacity);
        Console.WriteLine("Automatic : " + automatic);
    }
}