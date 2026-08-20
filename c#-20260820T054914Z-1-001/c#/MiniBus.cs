// Inheritance
// MiniBus class inherits properties like vehicleId, vehicleNumber,
// and capacity from the Vehicle class.

public class MiniBus : Vehicle
{
    // MiniBus class has its own property as AC
    private bool ac;

    public MiniBus(int vehicleId, string vehicleNumber, int capacity, bool ac)
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.ac = ac;
    }

    // Method overriding
    public override void displayVehicleDetails()
    {
        Console.WriteLine("\n----------- MiniBus Details -----------");
        Console.WriteLine("Vehicle ID : " + vehicleId);
        Console.WriteLine("Vehicle Number : " + vehicleNumber);
        Console.WriteLine("Capacity : " + capacity);
        Console.WriteLine("AC Available : " + ac);
    }
}