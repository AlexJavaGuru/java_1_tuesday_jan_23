package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.Book;
import student_oksana_tarasova.lesson_10.level_2.BookDatabase;
import student_oksana_tarasova.lesson_10.level_3.YearOfIssueSearchCriteria;
import student_oksana_tarasova.lesson_10.level_7.SortListBook;

import java.util.List;
import java.util.Scanner;

public class SortedListOfBooksUIAction implements UIAction {
    BookDatabase bookDatabase;

    public SortedListOfBooksUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year of publication of the book");
        String year = scanner.nextLine();
        List<Book> books = bookDatabase.find(new YearOfIssueSearchCriteria(year));
        SortListBook sortListBook1 = new SortListBook(books);
        sortListBook1.sortedList();
        System.out.println(books.toString());
    }
}
