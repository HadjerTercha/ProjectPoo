public class BorrowingProcess {
    private Book book;
    private Borrower borrower;
    
    public BorrowingProcess(Book book, Borrower borrower) {
        this.book = book;
        this.borrower = borrower;
    }
    
    public Book getBook() { return book; }
    public Borrower getBorrower() { return borrower; }
    
    public String toString() {
        return borrower + " استعار " + book;
    }
}