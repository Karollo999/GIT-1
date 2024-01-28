import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private final int userId;
    private int penaltyPoints;
    private List<Book> rentedBooks;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        this.penaltyPoints = 0;
        this.rentedBooks = new ArrayList<>();
    }

    public String getName() { return name; }
    public int getUserId() { return userId; }
    public int getPenaltyPoints() { return penaltyPoints; }
    public void addPenaltyPoints(int points) { this.penaltyPoints += points; }
    public void resetPenaltyPoints() { this.penaltyPoints = 0; }
    public List<Book> getRentedBooks() { return rentedBooks; }
    public void rentBook(Book book) { rentedBooks.add(book); book.setRented(true); }
    public void returnBook(Book book) { rentedBooks.remove(book); book.setRented(false); }
}