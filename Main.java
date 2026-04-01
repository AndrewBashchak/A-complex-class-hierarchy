public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Andrew Bashchak",2006);
        Author author2 = new Author("Dmytro Svitlyk",2006);

        Book book1 = new Book("How to scam people", author1, 2020);
        Book book2 = new Book("Tactics for throwing smoke grenades in CS2", author2, 2025);
        Book book3 = new Book("Phrases taken out of context", author1, 2026);
        
        Department genre = new Department("Easy Ainur");

        genre.addBook(book1);
        genre.addBook(book2);
        genre.addBook(book3);
    }
}