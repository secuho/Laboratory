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

    public void borrowBook(int bookId) {
        boolean count = false;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (!book.isBorrowed()) {
                    book.borrowBook();
                } else {
                    System.out.println("이미 대출 중입니다.");
                    return;
                }
                count = true;
            }
        }
        if (!count) {
            System.out.println("해당 책이 존재하지 않습니다.");
            return;
        }
    }

    public void returnBook(int bookId) {
        boolean count = false;
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                if (book.isBorrowed()) {
                    book.returnBook();
                } else {
                    System.out.println("이미 반납된 책입니다.");
                    return;
                }
                count = true;
            }
        }
        if (!count) {
            System.out.println("해당 책이 존재하지 않습니다.");
            return;
        }
    }

    public void showAllBooks() {
        System.out.println("전체 책 목록: ");
        for (Book book : books) {
            String status;
            if (book.isBorrowed()) {
                status = "대출 중";
            } else {
                status = "대출 가능";
            }
            System.out.println("책 번호: " + book.getBookId() + ", 제목: " + book.getTitle() + ", 상태: " + status);
        }
    }

    public void showAvailableBooks() {
        System.out.println("대출 가능한 책 목록: ");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("책 번호: " + book.getBookId() + ", 제목: " + book.getTitle());
            }
        }
    }


}
