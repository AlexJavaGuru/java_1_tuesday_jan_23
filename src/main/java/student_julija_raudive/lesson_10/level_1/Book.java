package student_julija_raudive.lesson_10.level_1;

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
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Book book)) return false;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }


}
