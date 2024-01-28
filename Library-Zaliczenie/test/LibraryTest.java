import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;*

class LibraryTest {
    private Library library;
    private User user;
    private Book book;

    @BeforeEach
    void setup() {
        library = new Library();
        user = new User("John Doe", 1);
        book = new Book("1984", "George Orwell", 1);
        library.addUser(user);
        library.addBook(book);
    }

    @Test
    void testAddAndRemoveBook() {
        assertEquals(book, library.books.get(book.getBookId()));
        library.removeBook(book.getBookId());
        assertNull(library.books.get(book.getBookId()));
    }

    @Test
    void testAddAndRemoveUser() {
        assertEquals(user, library.users.get(user.getUserId()));
        library.removeUser(user.getUserId());
        assertNull(library.users.get(user.getUserId()));
    }

    @Test
    void testRentBook() {
        library.rentBook(book.getBookId(), user.getUserId());
        assertTrue(book.isRented());
        assertTrue(user.getRentedBooks().contains(book));
    }

    @Test
    void testReturnBookWithinDeadline() {
        library.rentBook(book.getBookId(), user.getUserId());
        library.returnBook(book.getBookId(), user.getUserId(), 0);
        assertFalse(book.isRented());
        assertFalse(user.getRentedBooks().contains(book));
        assertEquals(0, user.getPenaltyPoints());
    }

    @Test
    void testReturnBookPastDeadline() {
        library.rentBook(book.getBookId(), user.getUserId());
        library.returnBook(book.getBookId(), user.getUserId(), 5);
        assertEquals(5, user.getPenaltyPoints());
    }

    @Test
    void testPenaltyPointsAccumulation() {
        library.rentBook(book.getBookId(), user.getUserId());
        library.returnBook(book.getBookId(), user.getUserId(), 3); // 3 penalty points
        library.returnBook(book.getBookId(), user.getUserId(), 7); // 7 penalty points, total should be 10 now
        assertEquals(10, user.getPenaltyPoints());
    }

    @Test
    void testRentingWithMaxPenaltyPoints() {
        user.addPenaltyPoints(10);
        library.rentBook(book.getBookId(), user.getUserId());
        assertFalse(book.isRented()); // User should not be able to rent due to max penalty points
    }
}