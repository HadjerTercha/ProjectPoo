public class Borrower {
    private String name;
    private String studentId;
    
    public Borrower(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    // Getters
    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    
    // Setters
    public void setName(String name) { this.name = name; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    
    public String toString() {
        return name + " (" + studentId + ")";
    }
}