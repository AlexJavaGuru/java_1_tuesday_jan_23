package student_andrejs_cekalins.lesson_9.level_5;


class BookReaderImpl implements BookReader {

    private Book[] books;

    BookReaderImpl(Book[] booksArray) {
        this.books = booksArray;
    }


    @Override
    public boolean add(Book book) {
        if (equalBooks(book) || bookNameOrAuthorEntered(book)) {
            return false;
        }
        int indexOfEmptyElement = getIndexOfEmptyElement(books);
        if (indexOfEmptyElement != -1) {
            books[indexOfEmptyElement] = book;
        }
        return true;
    }

    @Override
    public boolean delete(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (equalBooks(books[i])) {
                books[i] = null;
                return true;
            }
        }
        return false;
    }


    private boolean equalBooks(Book book) {
        for (Book newBook : books) {
            if (book.equals(newBook))
                return false;
        }
        return true;
    }

    private boolean bookNameOrAuthorEntered(Book book) {
        if (book.getBookName() == null || book.getAuthor() == null) {
            return false;
        }
        return true;
    }


    private int getIndexOfEmptyElement(Book[] books) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return i;
            }
        }
        return -1;
    }
}

