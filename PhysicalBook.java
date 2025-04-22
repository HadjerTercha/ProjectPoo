public class PhysicalBook extends Book {
    private int shelfNumber;
    
    public PhysicalBook(String title, String author, String isbn, int shelfNumber) {
        super(title, author, isbn);
        this.shelfNumber = shelfNumber;
    }
    
    public int getShelfNumber() { return shelfNumber; }
    public void setShelfNumber(int shelfNumber) { this.shelfNumber = shelfNumber; }
    
    @Override
    public String toString() {
        return super.toString() + " [كتاب ورقي - رف: " + shelfNumber + "]";
    }
}