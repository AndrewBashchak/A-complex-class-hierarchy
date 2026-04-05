import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private String address;
    private int foundationYear;
    private List<Department> departments;

    public Library(String name, String address, int foundationYear) {
        this.name = name;
        this.address = address;
        this.foundationYear = foundationYear;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addBook(Book book, Department department) {
        department.addBook(book);
    }

    public void removeBook(Book book, Department department) {
            department.removeBook(book);
    }

    public void getInfo() {
        System.out.println("Library name: " + name + ", Address: " + address + ", Year of foundation: " + foundationYear + "\nAvailable books:");
        for (Department genre : departments) {
            genre.getInfo();
        }
    }
}
