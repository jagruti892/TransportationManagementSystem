//Encapsulation 
public class Booking {

    // Private variables 
    private int bookingId;
    private String bookingDate;
    private String bookedBy;
    private int seatNumber;
    private String bookingStatus;

    public Booking(int bookingId, String bookingDate, String bookedBy, int seatNumber, String bookingStatus) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookedBy= bookedBy;
        this.seatNumber = seatNumber;
        this.bookingStatus = bookingStatus; 
    }
// getter methods 
    public int getBookingId() {
        return bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getbookedBy(){
        return bookedBy;
    }
    public int getSeatNumber() {
        return seatNumber;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }
// displays booking details 
    public void displayBookingDetails() {
        System.out.println("\n----------- Booking Details -----------");
        System.out.println("Booking ID : " + getBookingId());
        System.out.println("Booking Date : " + getBookingDate());
        System.out.println("Booked By : " + getbookedBy());
        System.out.println("Seat Number : " + getSeatNumber());
        System.out.println("Booking Status : " + getBookingStatus());
    }
}