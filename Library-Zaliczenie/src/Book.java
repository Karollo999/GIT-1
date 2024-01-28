public class Book {
    private String title;
    private String author;
    private final int bookId;
    private boolean isRented;

    public Book(String title, String author, int bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.isRented = false;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getBookId() { return bookId; }
    public boolean isRented() { return isRented; }
    public void setRented(boolean rented) { isRented = rented; }
}
