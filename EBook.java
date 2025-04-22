public class EBook extends Book {
    private String format;
    
    public EBook(String title, String author, String isbn, String format) {
        super(title, author, isbn);
        this.format = format;
    }
    
    @Override
    public String getBookType() {
        return "E-Book (" + format + ")";
    }
    
    public String getFormat() { return format; }
}