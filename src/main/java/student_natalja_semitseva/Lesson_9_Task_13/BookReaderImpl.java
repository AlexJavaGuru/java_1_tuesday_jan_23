package student_natalja_semitseva.Lesson_9_Task_13;

import java.util.ArrayList;
import java.util.List;

public class BookReaderImpl implements BookReader {
    List<Book> library = new ArrayList<>();

    @Override
    public boolean addBook(Book book) {
        if (!hasTitle(book)) {
            return false;
        } else if (library.contains(book)) {
            return false;
        } else {
            library.add(book);
            return true;
        }
    }

    @Override
    public void setRead(String book) {

    }

    private boolean hasTitle(Book book) {
        return book.getAuthor() != null && book.getTitle() != null;
    }

    @Override
    public void deleteBook() {

    }

    @Override
    public boolean deleteBook(Book book) {
        if (library.contains(book)) {
            library.remove(book);
            return true;
        } else {
            return false;
        }
    }

    public List<String> listOfAllBooks() {
        String[] listOfBooks = new String[library.size()];
        for (int i = 0; i < library.size(); i++) {
            listOfBooks[i] = library.get(i).getTitle() + " [" + library.get(i).getAuthor() + "]";
        }
        return List.of(listOfBooks);
    }

    public List<Book> findByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : library) {
            if (book.getAuthor().startsWith(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public List<Book> findByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : library) {
            if (book.getTitle().startsWith(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    @Override
    public void markAsRead(Book book) {

    }
}
