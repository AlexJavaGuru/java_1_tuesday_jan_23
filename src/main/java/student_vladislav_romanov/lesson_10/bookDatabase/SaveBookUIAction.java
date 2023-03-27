package student_vladislav_romanov.lesson_10.bookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите автора: ");
        String author = scanner.nextLine();
        System.out.print("Пожалуйста введите название: ");
        String title = scanner.nextLine();
        System.out.print("Пожалуйста введите год издания: ");
        String year = scanner.nextLine();
        bookDatabase.save(new Book(author, title, year));
    }
}
