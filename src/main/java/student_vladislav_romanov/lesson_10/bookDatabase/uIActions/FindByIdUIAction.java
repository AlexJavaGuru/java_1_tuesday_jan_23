package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;
import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите id книги: ");
        long id = scanner.nextLong();
        Optional<Book> bookOpt = bookDatabase.findById(id);
        System.out.println(bookOpt.isEmpty() ? "Книги с таким идентификатором не существует" : bookOpt);
    }
}
