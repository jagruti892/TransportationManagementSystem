import java.util.Scanner;

public class Vehicle {

  int vehicleID;
  String vehicleNumber;
  String vehicleType;
  String vehicleSubType;
  int capacity;
  int availableSeats;
  String status;

  public Vehicle(int vehicleID, String vehicleNumber, String vehicleType, String vehicleSubType, int capacity, int availableSeats,
      String status) {
    this.vehicleID = vehicleID;
    this.vehicleNumber = vehicleNumber;
    this.vehicleType = vehicleType;
    this.vehicleSubType=vehicleSubType;
    this.capacity = capacity;
    this.availableSeats = availableSeats;
    this.status = status;
  }

  public void displayVehicleDEtails() {
    System.out.println("--------Vehicle Deatils-------");
    System.out.println("Vehicle ID :" + vehicleID);
    System.out.println("Vehicle Number :" + vehicleNumber);
    System.out.println("Vehicle Type :" + vehicleType);
    System.out.println("Vehicle Sub Type :" + vehicleSubType);
    System.out.println("Capacity :" + capacity);
    System.out.println("Available Seats :" + availableSeats);
    System.out.println("Status :" + status);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter vehicle ID : ");
    int id = sc.nextInt();
    sc.nextLine();

    System.out.println("Enter vehicle Number");
    String number = sc.nextLine();

    System.out.println("Enter vehicle type: ");
    String type = sc.nextLine();

    System.out.println("Enter vehicle Sub type: ");
    String subtype = sc.nextLine();

    System.out.println("Enter capacity :");
    int capacity = sc.nextInt();

    System.out.print("Enter Available Seats: ");
    int seats = sc.nextInt();
    sc.nextLine();

    System.out.print("Enter Status: ");
    String status = sc.nextLine();

    Vehicle v1=new Vehicle(id, number, type, subtype, capacity, seats, status);

    v1.displayVehicleDEtails();

    sc.close();

  }
}
