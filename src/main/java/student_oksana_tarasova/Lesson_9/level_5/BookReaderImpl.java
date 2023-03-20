package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Arrays;
import java.util.Objects;

class BookReaderImpl implements BookReader {

    Book[] books;

    BookReaderImpl(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public boolean add(Book book) {
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;

            } else if (books[books.length - 1] != null && i == books.length - 1) {
                booksIncrease(books);
                j++;
            }
        }
        return true;
    }

    private Book[] booksIncrease(Book[] books) {
        Book[] books1 = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            books1[i] = books[i];
        }
        books = books1;
        return books;
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
/*

     UserEntity[] addUser(UserEntity user) {
        int j = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {
                users[i] = user;
                break;
            } else if (users[users.length - 1] != null && i == users.length - 1) {
                arrayIncrease();
                j++;
            }
        }
        return users;
    }
    private UserEntity[] arrayIncrease() {
        UserEntity[] usersAdd = new UserEntity[users.length + 1];
        for (int i = 0; i < users.length; i++) {
            usersAdd[i] = users[i];
        }
        return users = usersAdd;
    }

 */