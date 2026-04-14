package arraylistobject;

public class LibraryManagerTest {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.addBook(101, "Java Programming");
        manager.addBook(102, "Data Structure");
        manager.addBook(101, "Duplicate Book");

        manager.borrowBook(101);
        manager.borrowBook(101);
        manager.borrowBook(999);

        manager.returnBook(101);
        manager.returnBook(101);

        manager.showAllBooks();
        manager.showAvailableBooks();
    }
}