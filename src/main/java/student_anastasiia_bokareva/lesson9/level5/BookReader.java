package student_anastasiia_bokareva.lesson9.level5;

import java.util.ArrayList;

public interface BookReader {

    boolean add(ArrayList<Book> books, Book newBook);

    boolean addNotNull(ArrayList<Book> books, Book newBook);

    boolean delete(ArrayList<Book> books, Book newBook);

    void printBooks(ArrayList<Book> books);

    void collectByAuthors(ArrayList<Book> books, String authorBook);

    void researchByAuthor (ArrayList<Book> books, String word);
}
