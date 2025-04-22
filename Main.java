public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        
        // إنشاء كتب
        Book book1 = new Book("تعلم الجافا", "أحمد علي", "123-456");
        EBook ebook1 = new EBook("البرمجة الكائنية", "سارة محمد", "789-012", "PDF");
        PhysicalBook pbook1 = new PhysicalBook("أساسيات البرمجة", "خالد حسن", "345-678", 5);
        
        // إنشاء مستعيرين
        Borrower borrower1 = new Borrower("محمد", "2024001");
        Borrower borrower2 = new Borrower("فاطمة", "2024002");
        
        // إضافة للمكتبة
        library.addBook(book1);
        library.addBook(ebook1);
        library.addBook(pbook1);
        library.addBorrower(borrower1);
        library.addBorrower(borrower2);
        
        // عمليات إعارة
        library.borrowBook(book1, borrower1);
        library.borrowBook(ebook1, borrower2);
        
        // عرض المحتوى
        library.displayBooks();
    }
}