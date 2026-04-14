package arraylistobject;

public class Book {
    private int bookId;
    private String title;
    private boolean isBorrowed;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
        }
    }
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        }
    }
}
