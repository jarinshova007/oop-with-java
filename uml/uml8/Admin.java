package uml8;
public class Admin extends User {
    Admin(int userId, String name, String email) {
            super(userId, name, email);
        }
    
        private void manageProducts() {
            super.login();
            System.out.println("Admin " + getUserName() + " is managing products....");
            super.logout();
    }
    public void displayAdmin() {
        manageProducts();
    }
}
