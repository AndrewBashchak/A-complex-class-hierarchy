import java.util.ArrayList;
import java.util.List;

public class Department {

    private String genre;
    private List<Book> books;

    public Department (String genre) {
        this.genre = genre;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
        } else {
            System.out.println("Book not found");
        }
    }

    public void getInfo() {
        for (Book book : books) {
            System.out.println("Genre: " + genre + ", " + book.getInfo());
        }
    }
}
