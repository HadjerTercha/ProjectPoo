public class EBook extends Book {
    private String format;
    
    public EBook(String title, String author, String isbn, String format) {
        super(title, author, isbn);
        this.format = format;
    }
    
    public String getFormat() { return format; }
    public void setFormat(String format) { this.format = format; }
    
    @Override
    public String toString() {
        return super.toString() + " [book email " + format + "]";
    }
}