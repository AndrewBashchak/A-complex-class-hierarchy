public class ElectronicBook extends Book {

    private String format;
    private double fileSize;

    public ElectronicBook(String title, Author author, int publicationYear, String format, double fileSize) {
        super(title, author, publicationYear);
        this.format = format;
        this.fileSize = fileSize;
    }

    public String getInfo() {
        return super.getInfo() + ", Format: " + format + ", Size: " + fileSize + " MB";
    }
}
