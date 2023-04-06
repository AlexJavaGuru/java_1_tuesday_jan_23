package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;
import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;

import java.util.Scanner;

public class DeleteBookUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public DeleteBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please complete next 3 fields: ");
        System.out.println("1. Enter book author: ");
        String author= scanner.nextLine();
        System.out.println("2. Enter book title: ");
        String title = scanner.nextLine();
        System.out.println("3. Enter year of issue: ");
        String year = scanner.nextLine();
        Book book = new Book(author,title,year);
        bookDatabase.delete(book);
        System.out.println("Book deleted.");
    }
}
