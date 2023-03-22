package student_vladislav_romanov.lesson_9.level_5;

import java.util.Arrays;
import java.util.Objects;

class Book {

    String title;
    String author;
    String publisher;
    int publishingYear;
    String language;
    int paperback;
    int weight;
    int[] dimensions;
    String isbn;

    Book(String title, String author, String publisher, int publishingYear, String language, int paperback, int weight, int height, int width, String isbn) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.language = language;
        this.paperback = paperback;
        this.weight = weight;
        this.dimensions = new int[] {height, width};
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && paperback == book.paperback && weight == book.weight && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(publisher, book.publisher) && Objects.equals(language, book.language) && Arrays.equals(dimensions, book.dimensions) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, author, publisher, publishingYear, language, paperback, weight, isbn);
        result = 31 * result + Arrays.hashCode(dimensions);
        return result;
    }
}
