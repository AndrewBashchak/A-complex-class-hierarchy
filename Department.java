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


}