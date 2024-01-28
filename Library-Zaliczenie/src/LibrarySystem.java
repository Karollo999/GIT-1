public class LibrarySystem {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell", 1);
        User user1 = new User("John Doe", 1);

        library.addBook(book1);
        library.addUser(user1);
        library.rentBook(1, 1);
        library.returnBook(1, 1, 5);

        System.out.println("User penalty points: " + user1.getPenaltyPoints());
        user1.resetPenaltyPoints();
        System.out.println("User penalty points after reset: " + user1.getPenaltyPoints());
    }
}