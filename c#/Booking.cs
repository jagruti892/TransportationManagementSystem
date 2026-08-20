// Encapsulation
public class Booking
{
    // Private variables
    private int bookingId;
    private string bookingDate;
    private string bookedBy;
    private int seatNumber;
    private string bookingStatus;

    public Booking(int bookingId, string bookingDate, string bookedBy,int seatNumber, string bookingStatus)
    {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.bookedBy = bookedBy;
        this.seatNumber = seatNumber;
        this.bookingStatus = bookingStatus;
    }

    // Getter methods
    public int getBookingId()
    {
        return bookingId;
    }

    public string getBookingDate()
    {
        return bookingDate;
    }

    public string getbookedBy()
    {
        return bookedBy;
    }

    public int getSeatNumber()
    {
        return seatNumber;
    }

    public string getBookingStatus()
    {
        return bookingStatus;
    }

    // Setter method
    public void setBookingStatus(string bookingStatus)
    {
        this.bookingStatus = bookingStatus;
    }

    // Displays booking details
    public void displayBookingDetails()
    {
        Console.WriteLine("\n----------- Booking Details -----------");
        Console.WriteLine("Booking ID : " + getBookingId());
        Console.WriteLine("Booking Date : " + getBookingDate());
        Console.WriteLine("Booked By : " + getbookedBy());
        Console.WriteLine("Seat Number : " + getSeatNumber());
        Console.WriteLine("Booking Status : " + getBookingStatus());
    }
}