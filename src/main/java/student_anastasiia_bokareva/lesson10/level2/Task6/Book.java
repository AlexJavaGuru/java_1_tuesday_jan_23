package student_anastasiia_bokareva.lesson10.level2.Task6;

import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String year;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Book(String author, String title, String year) {
        this.author = author;
        this.title = title;
        this.year=year;

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
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }
}
