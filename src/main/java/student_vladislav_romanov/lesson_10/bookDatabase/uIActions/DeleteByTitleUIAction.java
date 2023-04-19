package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("----------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите название книги: ");
        String title = scanner.nextLine();
        bookDatabase.deleteByTitle(title);
        System.out.println("Книга " + title + " удалена");
    }
}
