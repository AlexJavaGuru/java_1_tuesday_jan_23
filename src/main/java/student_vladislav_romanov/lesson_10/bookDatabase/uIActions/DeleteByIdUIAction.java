package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите id книги: ");
        long id = scanner.nextLong();
        System.out.println(bookDatabase.delete(id) ? "Книга с id " + id + " удалена" :  "Книги с таким id не существует");
    }
}
