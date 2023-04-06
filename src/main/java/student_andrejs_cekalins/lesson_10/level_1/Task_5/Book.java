package student_andrejs_cekalins.lesson_10.level_1.Task_5;

import java.util.Objects;

class Book {
    private String title;
    private String author;

    Book(String author, String title) {
        this.author = author;
        this.title = title;
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
        if (!(o instanceof Book book)) return false;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(title,author);
    }
}
