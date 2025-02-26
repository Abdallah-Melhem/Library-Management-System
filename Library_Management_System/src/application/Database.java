package application;

import java.sql.*;

public class Database {
    private static final String URL = "jdbc:sqlite:library.db";

    public static Connection connect() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void setupDatabase() {
        try (Connection conn = connect(); Statement stmt = conn.createStatement()) {
            String createUsersTable = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "username TEXT UNIQUE, " +
                    "password TEXT, " +
                    "role TEXT)";

            String createBooksTable = "CREATE TABLE IF NOT EXISTS books (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "title TEXT, " +
                    "author TEXT, " +
                    "isbn TEXT UNIQUE, " +
                    "available INTEGER)";

            String createTransactionsTable = "CREATE TABLE IF NOT EXISTS transactions (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "book_id INTEGER, " +
                    "user_id INTEGER, " +
                    "borrow_date TEXT, " +
                    "return_date TEXT, " +
                    "FOREIGN KEY(book_id) REFERENCES books(id), " +
                    "FOREIGN KEY(user_id) REFERENCES users(id))";

            stmt.execute(createUsersTable);
            stmt.execute(createBooksTable);
            stmt.execute(createTransactionsTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
