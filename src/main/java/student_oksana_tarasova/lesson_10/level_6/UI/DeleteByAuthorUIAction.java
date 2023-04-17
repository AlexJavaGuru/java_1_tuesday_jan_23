package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteByAuthorUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author of the book you want to delete");
        String bookAuthor = scanner.nextLine();
        bookDatabase.deleteByAuthor(bookAuthor);
        System.out.println("The book has been removed");
    }
}
