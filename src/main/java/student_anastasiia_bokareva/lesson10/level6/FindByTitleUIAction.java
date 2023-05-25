package student_anastasiia_bokareva.lesson10.level6;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabase;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabaseImpl;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UiAction{

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        BookDatabase bookDatabase1 = new BookDatabaseImpl();
        List<Book> real = bookDatabase1.findByTitle(scanner.next());
        for (Book book : real) {
            System.out.println(book);
        }
    }
}
