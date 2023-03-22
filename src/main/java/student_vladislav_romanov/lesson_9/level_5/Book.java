package student_vladislav_romanov.lesson_9.level_5;

import java.util.Objects;

class Book {

    private final String title;
    private final String author;
    private final String publisher;
    private final int publishingYear;
    private final String language;
    private final int paperback;
    private final String isbn;
    private boolean read;

    Book(String title, String author, String publisher, int publishingYear, String language, int paperback, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.language = language;
        this.paperback = paperback;
        this.isbn = isbn;
        this.read = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isRead() {
        return read;
    }

    void setRead() {
        read = true;
    }

    void unsetRead() {
        read = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && paperback == book.paperback && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(language, book.language) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publisher, publishingYear, language, paperback, isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishingYear=" + publishingYear +
                ", language='" + language + '\'' +
                ", paperback=" + paperback +
                ", isbn='" + isbn + '\'' +
                ", read='" + read + '\'' +
                '}';
    }

}
