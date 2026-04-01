package studyclass;

public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        book1.title = "Harry Potter";
        book1.author = "J. K. Rowling";
        book1.pages = 500;

        book2.title = "The Hobbit";
        book2.author = "J. R. R. Tolkien";
        book2.pages = 780;

        book3.title = "Crime and Punishment";
        book3.author = "Fyodor Dostoevsky";
        book3.pages = 420;

        book2.readIt();

        System.out.println("Book 1: " + book1.title + " / " + book1.author + " / " + book1.pages + "pages");
        System.out.println("Book 2: " + book2.title + " / " + book2.author + " / " + book2.pages + "pages");
        System.out.println("Book 3: " + book3.title + " / " + book3.author + " / " + book3.pages + "pages");
    }
}
