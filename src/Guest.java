public class Guest extends Reader {

    public Guest(String name) {
        super(name);
    }

    protected int maxBorrowedBooks() {
        return 1;
    }
}
