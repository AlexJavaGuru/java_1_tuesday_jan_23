package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.AuthorSearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.FindBookService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.List;
import java.util.Scanner;

public class FindByAuthorUIAction implements UIAction {
    private FindBookService findBookByAuthorService;

    public FindByAuthorUIAction(FindBookService findBookByAuthorService) {
        this.findBookByAuthorService = findBookByAuthorService;
    }

    @Override
    public void execute() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input book's author");
        String author = input.nextLine();
        SearchCriteria authorCriteria = new AuthorSearchCriteria(author);
        List<Book> resultList = findBookByAuthorService.initialSearch(authorCriteria);
        System.out.println("List of founded books: " + resultList);

    }
}
