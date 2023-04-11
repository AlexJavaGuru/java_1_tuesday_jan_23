package student_anastasiia_bokareva.lesson9.level5;

import java.util.Scanner;

public class BookReaderImpl implements BookReader {

    @Override
    public boolean addNewBook(BookLibrary books,String bookName, String authorName) {
        if ((books.getBookTitle().equals(bookName))&&(books.getBookAuthor().equals(authorName))){
            return false;
        } else {
            return true;
        }
    }

}


