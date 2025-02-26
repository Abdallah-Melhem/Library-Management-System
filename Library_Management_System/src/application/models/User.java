package application.models;

public abstract class User {
    protected int id;
    protected String username;
    protected String password;
    protected String role;

    public User(int id, String username, String password, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() { return username; }
    public String getRole() { return role; }
}
