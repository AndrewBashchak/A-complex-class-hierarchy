import java.util.ArrayList;
import java.util.List;

public abstract class Reader {

    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    protected abstract int maxBorrowedBooks();

    public void borrowBook(Department department, Book book) {
        if (borrowedBooks.size() < maxBorrowedBooks()) {
            borrowedBooks.add(book);
            department.removeBook(book);
        } else {
            System.out.println(getName() + ": maximum borrowed books reached (limit: " + maxBorrowedBooks() + ")");
        }

    }

    public void getBorrowedBooks() {
        System.out.println(getName() + " borrowed books: ");
        if (borrowedBooks.isEmpty()) {
            System.out.println("(none)");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book.getInfo());
            }
        }
    }
}
