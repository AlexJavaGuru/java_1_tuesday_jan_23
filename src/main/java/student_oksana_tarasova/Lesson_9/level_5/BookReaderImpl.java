package student_oksana_tarasova.Lesson_9.level_5;

import java.util.Arrays;

class BookReaderImpl implements BookReader {

    private Book[] books;


    public BookReaderImpl(Book[] books) {
        this.books = books;
    }


    public Book[] getBooks() {
        return books;
    }

    @Override
    public boolean add(Book book) {
        int j = 0;
        for (int i = 0; i < books.length; i++) {
            if (copyOfABook(book) || !titleAndAuthorOfTheBook(book)) {
                return false;
            } else if (books[i] == null) {
                books[i] = book;
            } else if (books[books.length - 1] != null && i == books.length - 1) {
                booksIncrease();
                j++;
            }
        }
        return true;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (findingACopyOfABook(books[i], book)) {
                books[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String printAllBooks() {
        String list = "";
        for (int i = 0; i < books.length; ) {
            list += books[i].getTitle() + " [" + books[i].getSurnameAuthor() + "]\n";
            i++;
        }
        return list;
    }

    @Override
    public String findAllBooksByTheAuthor(String author) {
        String list = "";
        for (int i = 0; i < books.length; i++) {
            if (books[i].getSurnameAuthor().equals(author)) {
                list += books[i].getTitle() + " [" + books[i].getSurnameAuthor() + "]\n";
            }
        }
        return list;
    }

    @Override
    public String findAuthorByFirstLetter(String firstLetterName) {
        String list = "";
        for (int i = 0; i < books.length; i++) {
            if (findMatchingLettersSurname(books[i], firstLetterName) || findMatchingLettersName(books[i], firstLetterName)) {
                list += books[i].getTitle() + " [" + books[i].getSurnameAuthor() + "]\n";
            }
        }
        return list;
    }


    @Override
    public String findBooksByTitle(String titleBook) {
        String list = "";
        for (int i = 0; i < books.length; i++) {
            if (findACopyOfABookByTitle(books[i], titleBook) || findTitleByFragment(books[i], titleBook)) {
                list += books[i].getTitle() + " [" + books[i].getSurnameAuthor() + "]\n";
            }
        }
        return list;
    }

    @Override
    public boolean markABookAsRead(Book book) {
        for (Book copyOfTheBook : books) {
            if (book.equals(copyOfTheBook)) {
                copyOfTheBook.setStateBook(StateBook.STATE1);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean markABookAsUnread(Book book) {
        for (Book copyOfTheBook : books) {
            if (book.equals(copyOfTheBook)) {
                copyOfTheBook.setStateBook(StateBook.STATE2);
                return true;
            }
        }
        return false;
    }

    @Override
    public String printBookAsRead(StateBook stateBook) {
        String list = "";
        for (int i = 0; i < books.length; i++) {
            if (stateBook.equals(books[i].getStateBook())) {
                list += books[i].getTitle() + " [" + books[i].getSurnameAuthor() + "]\n";
            }
        }
        return list;
    }

    @Override
    public String printBookAsUnread(StateBook stateBook) {
        String list = "";
        for (int i = 0; i < books.length; i++) {
            if (stateBook.equals(books[i].getStateBook())) {
                list += books[i].getTitle() + " [" + books[i].getSurnameAuthor() + "]\n";
            }
        }
        return list;
    }


    private boolean findACopyOfABookByTitle(Book book, String titleBook) {
        if (book.getTitle().equalsIgnoreCase(titleBook)) {
            return true;
        }
        return false;
    }

    private boolean findTitleByFragment(Book book, String fragmentTitleBook) {
        String[] string = book.getTitle().split("\\s+");
        for (int i = 0; i < string.length; i++) {
            if (string[i].equalsIgnoreCase(fragmentTitleBook)) {
                return true;
            }
        }
        return false;
    }

    private boolean findMatchingLettersSurname(Book book, String firstLetterName) {
        String[] bookAuthor = book.getSurnameAuthor().split("");
        String[] userBookAuthor = firstLetterName.split("");
        for (int i = 0; i < userBookAuthor.length; i++) {
            if (!bookAuthor[i].equalsIgnoreCase(userBookAuthor[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean findMatchingLettersName(Book book, String firstLetterName) {
        String[] bookAuthor = book.getNameAuthor().split("");
        String[] userBookAuthor = firstLetterName.split("");
        for (int i = 0; i < userBookAuthor.length; i++) {
            if (!bookAuthor[i].equalsIgnoreCase(userBookAuthor[i])) {
                return false;
            }
        }
        return true;
    }


    private Book[] booksIncrease() {
        Book[] books1 = new Book[books.length + 1];
        for (int i = 0; i < books.length; i++) {
            books1[i] = books[i];
        }
        return books = books1;
    }

    private boolean findingACopyOfABook(Book book, Book userBook) {
        if (book.equals(userBook)) {
            return true;
        }
        return false;
    }

    private boolean copyOfABook(Book book) {
        for (Book copyOfTheBook : books) {
            if (book.equals(copyOfTheBook)) {
                return true;
            }
        }
        return false;
    }


    private boolean titleAndAuthorOfTheBook(Book book) {
        if (book.getTitle() == null
                || book.getSurnameAuthor() == null
                || book.getNameAuthor() == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookReaderImpl that = (BookReaderImpl) o;
        return Arrays.equals(books, that.books);
    }

    @Override
    public String toString() {
        return "BookReaderImpl{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
