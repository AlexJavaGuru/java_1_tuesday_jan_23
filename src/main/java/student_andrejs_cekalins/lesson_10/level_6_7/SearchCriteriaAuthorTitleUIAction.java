package student_andrejs_cekalins.lesson_10.level_6_7;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.BookDatabase;
import student_andrejs_cekalins.lesson_10.level_3.AuthorSearchCriteria;
import student_andrejs_cekalins.lesson_10.level_3.OrSearchCriteria;
import student_andrejs_cekalins.lesson_10.level_3.SearchCriteria;
import student_andrejs_cekalins.lesson_10.level_3.TitleSearchCriteria;

import java.util.Scanner;

public class SearchCriteriaAuthorTitleUIAction implements UIAction{
    private BookDatabase bookDatabase;

    public SearchCriteriaAuthorTitleUIAction(BookDatabase bookDatabase) {
        this.bookDatabase = bookDatabase;
    }

    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter book author: ");
        String author = scanner.nextLine();
        System.out.println("Please enter book title: ");
        String title = scanner.nextLine();
        SearchCriteria searchCriteria = new OrSearchCriteria(new AuthorSearchCriteria(author), new TitleSearchCriteria(title));
        System.out.println("Have repository book with such criteria? " +searchCriteria);

    }
}
