package BookSystem;

public class Books {
    int id;
    String author;
    String language;
    String freeTrialPeriod;
    int year;
    String numberOfHardCopies;
    String bookTitle;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFreeTrialPeriod() {
        return freeTrialPeriod;
    }

    public void setFreeTrialPeriod(String freeTrialPeriod) {
        this.freeTrialPeriod = freeTrialPeriod;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumberOfHardCopies() {
        return numberOfHardCopies;
    }

    public void setNumberOfHardCopies(String numberOfHardCopies) {
        this.numberOfHardCopies = numberOfHardCopies;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", language='" + language + '\'' +
                ", freeTrialPeriod='" + freeTrialPeriod + '\'' +
                ", year=" + year +
                ", numberOfHardCopies='" + numberOfHardCopies + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }
}
