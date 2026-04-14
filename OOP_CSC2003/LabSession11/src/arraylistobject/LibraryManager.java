package arraylistobject;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<Book> books;

    public LibraryManager() {
        books = new ArrayList<>();
    }

    public void addBook(int bookId, String title) {
        int count = 0;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("이미 존재하는 책 번호입니다.");
            return;
        } else {
            books.add(new Book(bookId, title));
        }


    }
}
