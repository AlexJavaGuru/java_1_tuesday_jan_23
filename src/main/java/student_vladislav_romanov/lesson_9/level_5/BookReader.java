package student_vladislav_romanov.lesson_9.level_5;

import java.util.List;

interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    List<String> listOfBooks();

    List<String> listOfBooksByAuthor(String author);

    List<String> listOfBooksByTitle(String title);

    boolean readBook(Book book);

    boolean unreadBook(Book book);

    List<String> listOfReadBooks();

    List<String> listOfUnreadBooks();

}
