package student_dmitry_kupcus.lesson_9.level_5;

public class Book {
    String bookAuthor;
    String bookName;
    boolean read;

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public Book(String bookName, String bookAuthor) {
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }


}
