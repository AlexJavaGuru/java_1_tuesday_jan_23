package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;
import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("----------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите название: ");
        String title = scanner.nextLine();
        List<Book> booksList = bookDatabase.findByTitle(title);
        System.out.println(booksList.isEmpty() ? "Книг с названием " + title + " не найдено" : booksList);
    }
}
