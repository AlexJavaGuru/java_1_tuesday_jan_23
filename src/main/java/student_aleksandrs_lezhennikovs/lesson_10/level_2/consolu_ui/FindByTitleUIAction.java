package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.TitleSearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.FindBookService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.List;
import java.util.Scanner;

public class FindByTitleUIAction implements UIAction {
    private FindBookService findBookByTitleService;

    public FindByTitleUIAction(FindBookService findBookByTitleService) {
        this.findBookByTitleService = findBookByTitleService;
    }

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input book's title");
        String title = input.nextLine();
        SearchCriteria titleCriteria = new TitleSearchCriteria(title);
        List<Book> resultList = findBookByTitleService.initialSearch(titleCriteria);
        System.out.println("List of founded books: " + resultList);

    }
}
