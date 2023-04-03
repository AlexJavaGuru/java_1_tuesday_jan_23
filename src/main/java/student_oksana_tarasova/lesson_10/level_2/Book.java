package student_oksana_tarasova.lesson_10.level_2;

import java.util.Collection;
import java.util.Objects;

public class Book implements Comparable <Book>{
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    public Book(String title, String author, String yearOfIssue) {
        this.title = title;
        this.author = author;
        this.yearOfIssue = yearOfIssue;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(yearOfIssue, book.yearOfIssue);
    }

    //Objects.equals(id, book.id) && / усли не убрать, копирует дубликаты в HashSet
    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearOfIssue);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfIssue='" + yearOfIssue + '\'' +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return author.compareTo(book.author);
    }

    
}
