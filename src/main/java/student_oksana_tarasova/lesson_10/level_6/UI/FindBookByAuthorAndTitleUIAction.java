package student_oksana_tarasova.lesson_10.level_6.UI;

import student_oksana_tarasova.lesson_10.level_2.Book;
import student_oksana_tarasova.lesson_10.level_2.BookDatabase;
import student_oksana_tarasova.lesson_10.level_3.*;

import java.util.List;
import java.util.Scanner;

public class FindBookByAuthorAndTitleUIAction implements UIAction {

    private BookDatabase bookDatabase;

    public FindBookByAuthorAndTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book author");
        System.out.println("Enter book title");
        SearchCriteria searchCriteria1;
        searchCriteria1 = new AndSearchCriteria(new AuthorSearchCriteria(scanner.nextLine()), new TitleSearchCriteria(scanner.nextLine()));
        List<Book> findBook = bookDatabase.find(searchCriteria1);
        System.out.println(findBook);
    }
}
