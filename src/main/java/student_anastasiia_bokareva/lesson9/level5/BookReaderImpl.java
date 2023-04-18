package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;

public class BookReaderImpl implements BookReader {

    boolean add(ArrayList<Book> books, String nameBook, String authorBook) {
        Book newBook = new Book(nameBook, authorBook);
        for (Book book : books) {
            if (books.equals(newBook)) {
                return false;
            } else {
                return true;
                books.add(newBook);
            }
        }
    }

}