// Inheritance
// Bus class inherits properties like vehicleId, vehicleNumber,
// and capacity from the Vehicle class.

public class Bus : Vehicle
{
    // Bus class has its own property as a charging port
    private readonly bool chargingPort;

    public Bus(int vehicleId, string vehicleNumber, int capacity, bool chargingPort)
    // : means Bus inherits from Vehicle
        : base(vehicleId, vehicleNumber, capacity)
    {
        this.chargingPort = chargingPort;
    }

    // Method overriding
    public override void displayVehicleDetails()
    {
        Console.WriteLine("\n----------- Bus Details -----------");
        Console.WriteLine("Vehicle ID : " + vehicleId);
        Console.WriteLine("Vehicle Number : " + vehicleNumber);
        Console.WriteLine("Capacity : " + capacity);
        Console.WriteLine("Charging Port : " + chargingPort);
    }
}
