package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        System.out.println("----------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите автора: ");
        String author = scanner.nextLine();
        bookDatabase.deleteByAuthor(author);
        System.out.println("Книга(-и) автора " + author + " удалена(-ы)");
    }
}
