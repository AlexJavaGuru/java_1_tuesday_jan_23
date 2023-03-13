package student_vladislav_romanov.lesson_8.level_7_library;

import java.util.Arrays;
import java.util.Objects;

class Reader {

    private long id;
    private String name;
    private String surname;
    private String email;
    private Book[] gotBooks;
    private double ticketsAmount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Book[] getGotBooks() {
        return gotBooks;
    }

    public void setGotBooks(Book[] gotBooks) {
        this.gotBooks = gotBooks;
    }

    public double getTicketsAmount() {
        return ticketsAmount;
    }

    public void setTicketsAmount(double ticketsAmount) {
        this.ticketsAmount = ticketsAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return id == reader.id && Objects.equals(name, reader.name) && Objects.equals(surname, reader.surname) && Objects.equals(email, reader.email) && Arrays.equals(gotBooks, reader.gotBooks);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", gotBooks=" + Arrays.toString(gotBooks) +
                '}';
    }
}
