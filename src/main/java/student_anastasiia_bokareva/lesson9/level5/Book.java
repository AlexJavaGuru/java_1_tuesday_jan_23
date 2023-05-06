package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthor;
    private boolean read;
    private boolean unread;

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    public boolean isUnread() {
        return unread;
    }

    public void setUnread(boolean unread) {
        this.unread = unread;
    }

    Book(String name, String author) {
        this.bookName = name;
        this.bookAuthor = author;
        this.read = false;
        this.unread = false;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book other = (Book) o;
        return Objects.equals(this.bookName, other.bookName) &&
                Objects.equals(this.bookAuthor, other.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bookName, this.bookAuthor);
    }

}