public class Admin {

    private int adminId;
    private String adminName;
    private String password;

    public Admin(int adminId, String adminName, String password) {
        this.adminId = adminId;
        this.adminName = adminName;
        this.password = password;
    }
    
    public void displayAdminDetails() {

        System.out.println("\n----------- Admin Details -----------");
        System.out.println("Admin ID : " + adminId);
        System.out.println("Admin Name : " + adminName);
    }
}