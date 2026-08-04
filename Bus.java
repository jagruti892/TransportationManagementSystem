public class Bus extends Vehicle {

    private boolean chargingPort;

    public Bus(int vehicleId, String vehicleNumber, int capacity, boolean chargingPort) {

        super(vehicleId, vehicleNumber, capacity);
        this.chargingPort = chargingPort;
    }

    @Override
    public void displayVehicleDetails() {

        System.out.println("\n----------- Bus Details -----------");
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Capacity : " + capacity);
        System.out.println("Charging Port : " + chargingPort);
    }
}