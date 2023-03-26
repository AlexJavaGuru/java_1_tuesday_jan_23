package student_andrejs_cekalins.lesson_9.level_5;


import java.util.*;

class BookReaderImpl implements BookReader {

    Set<Book> books = new HashSet<>();


    @Override
    public boolean add(Book book) {
        if (book.getBookTitle() != null && book.getAuthor() != null) {
            return books.add(book);
        }
        return false;
    }


    @Override
    public boolean delete(Book book) {
        if (book.getBookTitle() != null) {
            return books.remove(book);
        }
        return false;
    }

    @Override
    public List<String> listOfBooks() {
        List<String> listOfBooks = new ArrayList<>();
        for (Book book : books) {
            listOfBooks.add(book.getBookTitle() + " [" + book.getAuthor() + "]");
        }
        return listOfBooks;
    }

    @Override
    public List<String> authorBooks(String author) {
        List<String> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().contains(author)) {
                authorBooks.add(book.getBookTitle() + " [" + book.getAuthor() + "]");
            }
        }
        return authorBooks;
    }
}

