package uml8;

abstract class User {
    private int userId;
    private String name;
    private String email;

    User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    // login
    public void login() {
        System.out.println(name + " logged in");
    }

    // logout
    public void logout() {
        System.out.println(name + " successfully logged out!");
    }

    // getters
    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
}
