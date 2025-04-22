public abstract class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    //constracter
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    
    // Getters and Setters
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    
    public void setAvailable(boolean available) { isAvailable = available; }
    
    // طريقة مجردة
    public abstract String getBookType();
    
    @Override
    public String toString() {
        return String.format("%s by %s (ISBN: %s) - %s", 
            title, author, isbn, isAvailable ? "Available" : "Borrowed");
    }
}