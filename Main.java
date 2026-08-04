public class Main {

    public static void main(String[] args) {

        // Creating Objects
        User user = new User(1,"Jagruti","jagruti@gmail.com","9876543210","12345");
        Admin admin = new Admin(101,"Admin","admin123");
        Driver driver = new Driver(201,"Rahul","9876501234","GA12345678", 5,"Available");
        Route route = new Route(301,"Panaji","Margao",35, "45 Minutes");
        Booking booking = new Booking(401,"02-08-2026", 15,"Confirmed");

// Abstraction and Object Referencing
        Vehicle vehicle;
        vehicle = new Bus(501,"GA07AB1234",50,true);

        // Display details
        admin.displayAdminDetails();
        user.displayUserDetails();
        driver.displayDriverDetails();
        route.displayRouteDetails();
        vehicle.displayVehicleDetails();
        booking.displayBookingDetails();

    }
}