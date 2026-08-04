
public class Driver {

    private int driverId;
    private String driverName;
    private String phoneNumber;
    private String licenseNumber;
    private int experience;
    private String availabilityStatus;

    public Driver(int driverId, String driverName, String phoneNumber,
                String licenseNumber, int experience,
                String availabilityStatus) {

        this.driverId = driverId;
        this.driverName = driverName;
        this.phoneNumber = phoneNumber;
        this.licenseNumber = licenseNumber;
        this.experience = experience;
        this.availabilityStatus = availabilityStatus;
    }

    public void displayDriverDetails() {

        System.out.println("\n----------- Driver Details -----------");
        System.out.println("Driver ID : " + driverId);
        System.out.println("Driver Name : " + driverName);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("License Number : " + licenseNumber);
        System.out.println("Experience : " + experience + " Years");
        System.out.println("Availability : " + availabilityStatus);
    }
}