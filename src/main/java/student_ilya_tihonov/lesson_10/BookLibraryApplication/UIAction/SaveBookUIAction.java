package student_ilya_tihonov.lesson_10.BookLibraryApplication.UIAction;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.bookd_database.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter information about the book:");

        System.out.print("Author: ");
        String author = scanner.nextLine();

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Year of issue: ");
        String yearOfIssue = scanner.nextLine();

        Book book = new Book(author, title, yearOfIssue);
        bookDatabase.save(book);

        System.out.println("The book has been successfully saved to the database.");
    }

}
