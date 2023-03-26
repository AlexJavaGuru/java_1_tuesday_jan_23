package student_andrejs_cekalins.lesson_9.level_5;


import java.util.Objects;

class Book {
    private String bookTitle;
    private String author;

    Book(String bookTitle, String author) {
        this.bookTitle = bookTitle;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author);
    }
}
