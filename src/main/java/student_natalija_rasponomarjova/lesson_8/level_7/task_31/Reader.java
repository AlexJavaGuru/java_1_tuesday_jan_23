package student_natalija_rasponomarjova.lesson_8.level_7.task_31;

import java.util.List;

class Reader {

    private int readerId;
    private String name;
    private String surname;
    private List<Book> issuedBooks;

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(List<Book> issuedBooks) {
        this.issuedBooks = issuedBooks;
    }
}

