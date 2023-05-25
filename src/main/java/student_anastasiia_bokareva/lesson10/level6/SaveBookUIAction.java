package student_anastasiia_bokareva.lesson10.level6;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabase;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabaseImpl;

import java.util.Scanner;

public class SaveBookUIAction implements UiAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        BookDatabase date= new BookDatabaseImpl();
        Book book = new Book(scanner.nextLine(),scanner.nextLine());
        date.save(book);
    }
}
