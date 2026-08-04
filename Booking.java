public class Booking {

    // Private variables (Encapsulation)
    private int bookingId;
    private String bookingDate;
    private int seatNumber;
    private String bookingStatus;

    public Booking(int bookingId, String bookingDate,
                int seatNumber, String bookingStatus) {

        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.seatNumber = seatNumber;
        this.bookingStatus = bookingStatus; 
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
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

    public void displayBookingDetails() {

        System.out.println("\n----------- Booking Details -----------");
        System.out.println("Booking ID : " + getBookingId());
        System.out.println("Booking Date : " + getBookingDate());
        System.out.println("Seat Number : " + getSeatNumber());
        System.out.println("Booking Status : " + getBookingStatus());
    }
}