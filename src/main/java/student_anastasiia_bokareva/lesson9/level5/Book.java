package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;
import java.util.Objects;

public class Book {
    private String bookName;
    private String bookAuthor;

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    Book(String name, String author) {
        this.bookName = name;
        this.bookAuthor = author;
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