package student_ilya_tihonov.lesson_10.BookLibraryApplication.UIAction;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.bookd_database.BookDatabase;

import java.util.Scanner;

public class DeleteByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public DeleteByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book ID to delete: ");
        Long id = Long.parseLong(scanner.nextLine());

        boolean deleted = bookDatabase.delete(id);
        if (deleted) {
            System.out.println("The book with ID " + id + " was successfully deleted from the database.");
        } else {
            System.out.println("The book with ID" + id + " was not found in the database.");
        }
    }

}
