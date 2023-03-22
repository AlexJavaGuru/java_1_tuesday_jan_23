package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Objects;

class Book {
    private String nameAuthor;
    private String surnameAuthor;
    private String title;
    private StateBook stateBook;

    public Book(String nameAuthor, String surnameAuthor, String title, StateBook stateBook) {
        this.nameAuthor = nameAuthor;
        this.surnameAuthor = surnameAuthor;
        this.title = title;
        this.stateBook = stateBook;
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

    public StateBook getStateBook() {
        return stateBook;
    }

    public void setStateBook(StateBook stateBook) {
        this.stateBook = stateBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameAuthor, book.nameAuthor) && Objects.equals(surnameAuthor, book.surnameAuthor) && Objects.equals(title, book.title) && stateBook == book.stateBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", surnameAuthor='" + surnameAuthor + '\'' +
                ", title='" + title + '\'' +
                ", stateBook=" + stateBook +
                '}';
    }
}
