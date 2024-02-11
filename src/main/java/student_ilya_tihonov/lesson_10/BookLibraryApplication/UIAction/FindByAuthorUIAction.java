package student_ilya_tihonov.lesson_10.BookLibraryApplication.UIAction;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.bookd_database.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindByAuthorUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book author: ");
        String author = scanner.nextLine();

        List<Book> booksByAuthor = bookDatabase.findByAuthor(author);
        if (!booksByAuthor.isEmpty()) {
            System.out.println("Author's books found " + author + ":");
            for (Book book : booksByAuthor) {
                System.out.println("ID: " + book.getId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Year of issue: " + book.getYearOfIssue());
            }
        } else {
            System.out.println("Author's books " + author + " not found.");
        }


    }
}
