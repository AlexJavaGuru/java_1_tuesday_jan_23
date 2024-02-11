package student_ilya_tihonov.lesson_10.BookLibraryApplication.book;

import java.util.Objects;

public class Book {
    private Long id;
    private String title;
    private String author;
    private String yearOfIssue;

    public Book(String author, String title, String yearOfIssue) {
        this.author = author;
        this.title = title;
        this.yearOfIssue = yearOfIssue;
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

    public String getYearOfIssue() {
        return this.yearOfIssue;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id.equals(book.id) && title.equals(book.title) && author.equals(book.author) && yearOfIssue.equals(book.yearOfIssue);
    }

    public int hashCode() {
        return Objects.hash(id, title, author, yearOfIssue);
    }

}

