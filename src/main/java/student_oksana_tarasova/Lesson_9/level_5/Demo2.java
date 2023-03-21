package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

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
            if (!newBookAddOrNot(book) || !titleAndAuthorOfTheBook(book)) {
                break;
            }
            if (books[i] == null) {
                books[i] = book;
                break;
            } else if (books[books.length - 1] != null && i == books.length - 1) {
                booksIncrease();
                j++;
            }
        }
        return books;
    }

    public Book[] booksIncrease() {
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

    private boolean titleAndAuthorOfTheBook (Book book) {
        if(book.getTitle() == null
                || book.getSurnameAuthor() == null
                || book.getNameAuthor() == null) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public void findAuthorByFirstLetter(String firstLetterName) {
        String list = "";
        if (findMatchingLetters(firstLetterName)) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getSurnameAuthor().regionMatches(0, firstLetterName, 0, 3) ||
                        books[i].getNameAuthor().regionMatches(true,0, firstLetterName, 0, 3)) {
                    list += books[i].getTitle() + " [" + books[i].getSurnameAuthor() + "]\n";
                }
            }
            System.out.println(list);
        } else {
            System.out.println("No books by this author");
        }
    }

    public boolean findMatchingLetters(String firstLetterName) {
        for (Book copyOfTheBook : books) {
            if (firstLetterName.regionMatches(true,0, copyOfTheBook.getSurnameAuthor() , 0, 3) ||
                    copyOfTheBook.getNameAuthor().regionMatches(true,0, firstLetterName, 0, 3)) {
                return true;
            }
        }
        return false;
    }
}
