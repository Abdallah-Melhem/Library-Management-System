package application.models;

public class Admin extends User {
    public Admin(int id, String username, String password) {
        super(id, username, password, "Admin");
    }

    public void manageUsers() {
        System.out.println("Managing users...");
    }
}

