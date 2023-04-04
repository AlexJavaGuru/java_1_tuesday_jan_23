package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the id number of the book you want to delete");
        int bookId = scanner.nextInt();
        if (bookDatabase.delete((long) bookId)) {
            System.out.println("The book has been removed");
        } else {
            System.out.println("Book with this number not found");
        }
    }

}
