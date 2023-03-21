package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Objects;

class Book {
    String nameAuthor;
    String surnameAuthor;
    String title;

    public Book(String nameAuthor, String surnameAuthor, String title) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
        this.title = title;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public String getSurnameAuthor() {
        return surnameAuthor;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameAuthor, book.nameAuthor) && Objects.equals(surnameAuthor, book.surnameAuthor) && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, surnameAuthor, title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", surnameAuthor='" + surnameAuthor + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
