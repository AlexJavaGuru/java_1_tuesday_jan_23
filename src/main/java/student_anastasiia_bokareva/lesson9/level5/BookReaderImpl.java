package student_anastasiia_bokareva.lesson9.level5;

import java.util.Scanner;

public class BookReaderImpl implements BookReader {
    @Override
    public boolean addNewBook(String additionalBook) {
        BookLibrary books = new BookLibrary();
        for (String book : books) {
            if (book == additionalBook) {
                return false;
            }
        }
        return false;
    }
}


