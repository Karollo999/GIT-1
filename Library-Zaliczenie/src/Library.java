import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> books = new HashMap<>();
    private Map<Integer, User> users = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void removeBook(int bookId) {
        books.remove(bookId);
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public void removeUser(int userId) {
        users.remove(userId);
    }

    public void rentBook(int bookId, int userId) {
        Book book = books.get(bookId);
        User user = users.get(userId);
        if (user.getPenaltyPoints() < 10 && !book.isRented()) {
            user.rentBook(book);
        }
    }

    public void returnBook(int bookId, int userId, int daysPastDeadline) {
        Book book = books.get(bookId);
        User user = users.get(userId);
        if (book.isRented()) {
            user.returnBook(book);
            if (daysPastDeadline > 0) {
                int newPenaltyPoints = Math.min(user.getPenaltyPoints() + daysPastDeadline, 10);
                user.addPenaltyPoints(newPenaltyPoints);
            }
        }
    }
}