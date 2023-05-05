package student_natalija_rasponomarjova.lesson_8.level_7.task_31;

import java.util.Date;

class Book {
    private int id;
    private String title;
    private String author;
    private boolean reserved;
    private Reader reservedBy;
    private Date reservedUntil;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public boolean isReserved() {
        return reserved;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    public Reader getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(Reader reservedBy) {
        this.reservedBy = reservedBy;
    }

    public Date getReservedUntil() {
        return reservedUntil;
    }

    public void setReservedUntil(Date reservedUntil) {
        this.reservedUntil = reservedUntil;
    }
}



