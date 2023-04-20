package student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;


    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.id = 1L;
        this.yearOfIssue = yearOfIssue;}

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

    public String getYearOfIssue() {
        return this.yearOfIssue;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year =' " + yearOfIssue + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author) && yearOfIssue.equals(book.yearOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author);
    }

    @Override
    public int compareTo(Book book) {
        return author.compareTo(book.author);
    }
}


