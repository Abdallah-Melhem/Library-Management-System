package application.models;

public class Librarian extends User {
    public Librarian(int id, String username, String password) {
        super(id, username, password, "Librarian");
    }

    public void manageBooks() {
        System.out.println("Managing books...");
    }
}
