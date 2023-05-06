package student_ilya_tihonov.lesson_10.BookLibraryApplication.UIAction;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.bookd_database.BookDatabase;

import java.util.Optional;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByIdUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book ID:");
        long id = scanner.nextLong();
        scanner.nextLine();

        Optional<Book> bookOpt = bookDatabase.findById(id);
        if (bookOpt.isPresent()) {
            Book book = bookOpt.get();
            System.out.println("Book found:");
            System.out.println("ID: " + book.getId());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Year of issue: " + book.getYearOfIssue());
        } else {
            System.out.println("The book with the specified ID was not found.");
        }
    }

}
