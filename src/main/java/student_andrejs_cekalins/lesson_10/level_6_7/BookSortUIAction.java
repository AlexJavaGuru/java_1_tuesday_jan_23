package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;
import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookSortUIAction implements UIAction{
    private BookDatabase bookDatabase;

    BookSortUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter author of books: ");
        String author = scanner.nextLine();
        List<Book> books = bookDatabase.findByAuthor(author);
        Collections.sort(books);
        System.out.println(books);
    }
}
