package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.IdSearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.FindBookService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.List;
import java.util.Scanner;

public class FindByIdUIAction implements UIAction {

    private FindBookService findBookByIdService;

    public FindByIdUIAction(FindBookService findBookByIdService) {
        this.findBookByIdService = findBookByIdService;
    }

    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input book's ID");
        Long bookId = input.nextLong();
        SearchCriteria searchCriteria = new IdSearchCriteria(bookId);
        List<Book> searchResult = findBookByIdService.initialSearch(searchCriteria);
        System.out.println("Book found");
        System.out.println(searchResult);

    }

}
