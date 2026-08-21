// inheritance 
// minbus class inherits proprties like vehicleid vehicleNumber and capacity from vehicle class
public class MiniBus extends Vehicle {
// minbus class has its own property as a ac
    private boolean ac;

    public MiniBus(int vehicleId, String vehicleNumber, int capacity, boolean ac) {

        super(vehicleId, vehicleNumber, capacity);
        this.ac = ac;
    }

    @Override
    public void displayVehicleDetails() {

        System.out.println("\n----------- MiniBus Details -----------");
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Capacity : " + capacity);
        System.out.println("AC Available : " + ac);
    }
}
