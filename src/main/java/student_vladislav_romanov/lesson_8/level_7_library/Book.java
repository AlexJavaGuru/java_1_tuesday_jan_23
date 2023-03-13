package student_vladislav_romanov.lesson_8.level_7_library;

import java.util.Date;
import java.util.Objects;

class Book {

    private long id;
    private String title;
    private String author;
    private String genre;
    private long place;
    private long reservedBy;
    private long takenBy;
    private Date takenDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getPlace() {
        return place;
    }

    public void setPlace(long place) {
        this.place = place;
    }

    public long getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(long reservedBy) {
        this.reservedBy = reservedBy;
    }

    public long getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(long takenBy) {
        this.takenBy = takenBy;
    }

    public Date getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(Date takenDate) {
        this.takenDate = takenDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && place == book.place && reservedBy == book.reservedBy && takenBy == book.takenBy && title.equals(book.title) && author.equals(book.author) && genre.equals(book.genre) && takenDate.equals(book.takenDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, genre, place, reservedBy, takenBy, takenDate);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", place=" + place +
                ", reservedBy=" + reservedBy +
                ", takenBy=" + takenBy +
                ", takenDate=" + takenDate +
                '}';
    }
}