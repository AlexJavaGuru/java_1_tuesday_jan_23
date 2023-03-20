package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Arrays;
import java.util.Objects;

public class Demo2 {
    Book[] books;

    Demo2 (Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }


    public Book[] add(Book book) {
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            } else if (books[books.length - 1] != null && i == books.length - 1) {
                booksIncrease(books);
                j++;
            }
        }
        return books;
    }

    public Book[] booksIncrease(Book[] books) {
        Book[] books1 = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            books1[i] = books[i];

        }
        return books = books1;
    }

    private boolean newBookAddOrNot(Book book) {
        for (Book copyOfTheBook : books) {
            if (Objects.equals(copyOfTheBook, book)) {
                return false;
            }

        }
        return true;
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
