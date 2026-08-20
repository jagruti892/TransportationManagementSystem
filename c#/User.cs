public class User
{
    private int userId;
    private string userName;
    private string emailId;
    private string contactNumber;
    private string password;

    public User(int userId, string userName, string emailId,
                string contactNumber, string password)
    {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.password = password;
    }

    public void displayUserDetails()
    {
        Console.WriteLine("\n----------- User Details -----------");
        Console.WriteLine("User ID : " + userId);
        Console.WriteLine("User Name : " + userName);
        Console.WriteLine("Email ID : " + emailId);
        Console.WriteLine("Contact Number : " + contactNumber);
    }
}