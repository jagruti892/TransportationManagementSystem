public class User {

    private int userId;
    private String userName;
    private String emailId;
    private String contactNumber;
    private String password;

    public User(int userId, String userName, String emailId, String contactNumber, String password) {
        this.userId = userId;
        this.userName = userName;
        this.emailId = emailId;
        this.contactNumber = contactNumber;
        this.password = password;
    }

    public void displayUserDetails() {
        System.out.println("\n----------- User Details -----------");
        System.out.println("User ID : " + userId);
        System.out.println("User Name : " + userName);
        System.out.println("Email ID : " + emailId);
        System.out.println("Contact Number : " + contactNumber);
    }
}