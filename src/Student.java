public class Student extends Reader {

    public Student(String name) {
        super(name);
    }

    protected int maxBorrowedBooks() {
        return 3;
    }
}
