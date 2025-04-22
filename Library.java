import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Borrower> borrowers;
    private ArrayList<BorrowingProcess> borrowings;
    
    public Library() {
        books = new ArrayList<>();
        borrowers = new ArrayList<>();
        borrowings = new ArrayList<>();
    }
    
    // إضافة كتاب
    public void addBook(Book book) {
        books.add(book);
    }
    
    // إضافة مستعير
    public void addBorrower(Borrower borrower) {
        borrowers.add(borrower);
    }
    
    // عملية الإعارة
    public void borrowBook(Book book, Borrower borrower) {
        borrowings.add(new BorrowingProcess(book, borrower));
    }
    
    // عرض الكتب
    public void displayBooks() {
        System.out.println("=== الكتب في المكتبة ===");
        for(Book book : books) {
            System.out.println(book);
        }
    }
}