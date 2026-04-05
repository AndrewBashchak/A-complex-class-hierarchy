public class Book {

    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getInfo() {
        return "Title: " + title +
                ", " + author.getInfo() +
                ", Year of publication: " + publicationYear;
    }
}
