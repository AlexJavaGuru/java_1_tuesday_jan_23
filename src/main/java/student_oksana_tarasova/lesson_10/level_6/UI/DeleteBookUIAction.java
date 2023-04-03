package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.Book;
import student_oksana_tarasova.lesson_10.level_2.BookDatabase;

import java.util.Scanner;

public class DeleteBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public DeleteBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter book details: ");
        System.out.println("author: ");
        String author = scanner.nextLine();
        System.out.println("title: ");
        String title = scanner.nextLine();
        System.out.println("the year of publishing: ");
        String yearOfIssue = scanner.nextLine();
        Book book = new Book(title, author, yearOfIssue);
        bookDatabase.delete(book);
    }
}
