package student_ilya_tihonov.lesson_9.level_5_6;

public interface BookReader {

    boolean addBook(Book book);

    boolean removeBook(Book book);

    String[] listBooks();

    String[] searchBooksByAuthor(String author);

    String[] searchBooksByFullAuthorName(String author);

    String[] searchBooksByTitle(String title);

    String[] searchBooksByTitleStartingWith(String title);

    boolean markBookAsRead(Book book);

    boolean markBookAsUnread(Book book);

    String[] listReadBooks();

}
