package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;
import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;

import java.util.Scanner;

public class SaveBookUIAction implements UIAction {
    private BookDatabase bookDatabase;

    public SaveBookUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book author: ");
        String author = scanner.nextLine();
        System.out.println("Please enter book title: ");
        String title = scanner.nextLine();
        System.out.println("Please enter book year of issue: ");
        String yearOfIssue = scanner.nextLine();
        bookDatabase.save(new Book(author, title, yearOfIssue));
    }
}
