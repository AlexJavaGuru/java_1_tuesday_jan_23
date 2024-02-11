package student_ilya_tihonov.lesson_10.BookLibraryApplication.UIAction;

import student_ilya_tihonov.lesson_10.BookLibraryApplication.book.Book;
import student_ilya_tihonov.lesson_10.BookLibraryApplication.bookd_database.BookDatabase;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction{

    private BookDatabase bookDatabase;

    public FindByTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = scanner.nextLine();

        List<Book> booksByTitle = bookDatabase.findByTitle(title);
        if (!booksByTitle.isEmpty()) {
            System.out.println("Found books with the title \"" + title + "\":");
            for (Book book : booksByTitle) {
                System.out.println("ID: " + book.getId());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Year of issue: " + book.getYearOfIssue());
            }
        } else {
            System.out.println("Books with the title \"" + title + "\" not found.");
        }
    }

}
