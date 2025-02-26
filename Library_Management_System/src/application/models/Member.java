package application.models;

public class Member extends User {
    public Member(int id, String username, String password) {
        super(id, username, password, "Member");
    }

    public void searchBooks() {
        System.out.println("Searching for books...");
    }
}
