package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter title of books to be deleted: ");
        String title = scanner.nextLine();
        bookDatabase.deleteByTitle(title);
        System.out.println("Books with entered title are deleted.");

    }
}
