// inheritance 
// van class inherits proprties like vehicleid vehicleNumber and capacity from vehicle class 
public class Van extends Vehicle {
// van class has its own property as a loadCapacity
    private double loadCapacity;

    public Van(int vehicleId, String vehicleNumber, int capacity, double loadCapacity) {

        super(vehicleId, vehicleNumber, capacity);
        this.loadCapacity = loadCapacity;
    }

    @Override
    //displays van details
    public void displayVehicleDetails() {
        System.out.println("\n----------- Van Details -----------");
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Capacity : " + capacity);
        System.out.println("Load Capacity : " + loadCapacity + " kg");
    }
}
