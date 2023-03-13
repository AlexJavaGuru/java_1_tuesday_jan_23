package student_vladislav_romanov.lesson_8.level_7_library;

import java.util.Arrays;

class Library {

    private Book[] books;
    private Reader[] readers;
    private Book[] takenBooks;

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public Reader[] getReaders() {
        return readers;
    }

    public void setReaders(Reader[] readers) {
        this.readers = readers;
    }

    public Book[] getTakenBooks() {
        return takenBooks;
    }

    public void setTakenBooks(Book[] takenBooks) {
        this.takenBooks = takenBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + Arrays.toString(books) +
                ", readers=" + Arrays.toString(readers) +
                ", takenBooks=" + Arrays.toString(takenBooks) +
                '}';
    }

}
