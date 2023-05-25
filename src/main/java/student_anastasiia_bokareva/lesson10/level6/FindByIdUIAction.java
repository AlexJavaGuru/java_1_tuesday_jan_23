package student_anastasiia_bokareva.lesson10.level6;

import student_anastasiia_bokareva.lesson10.level2.Task6.Book;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabase;
import student_anastasiia_bokareva.lesson10.level2.Task6.BookDatabaseImpl;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UiAction{

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        BookDatabase bookDatabase1 = new BookDatabaseImpl();
        Optional<Book> opti = bookDatabase1.findById(scanner.nextLong());
        System.out.println("Book found: " + opti.get());
    }
}
