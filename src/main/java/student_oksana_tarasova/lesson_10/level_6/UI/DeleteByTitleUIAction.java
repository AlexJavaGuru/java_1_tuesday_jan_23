package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteByTitleUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the books you are interested in");
        String title = scanner.nextLine();
        bookDatabase.deleteByTitle(title);
        System.out.println("The book has been removed");
    }
}
