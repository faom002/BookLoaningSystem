package BookSystem;

public class LoanRecord {
    String user;
    String bookType;
    int bookId;
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "LoanRecord" +
                "user='" + user + '\'' +
                ", bookType='" + bookType + '\'' +
                ", bookId=" + bookId +
                ", id=" + id;
    }
}
