package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.AuthorSearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.GetAllBooksService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.PagingSearchService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FIndByAuthorPagingUIAction implements UIAction {
    private PagingSearchService searchBookService;
    private GetAllBooksService getAllBooksService;

    public FIndByAuthorPagingUIAction(PagingSearchService searchBookService, GetAllBooksService getAllBooksService) {
        this.searchBookService = searchBookService;
        this.getAllBooksService = getAllBooksService;
    }

    @Override
    public void execute() throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Input book's author");
        String author = input.nextLine();
        System.out.println("Input page size");
        int pageSize = input.nextInt();
        SearchCriteria authorSearch = new AuthorSearchCriteria(author);
        Map<Integer, List<Book>> resultList = searchBookService.execute(pageSize, authorSearch);
        if (pageSize == 0) {
            List<Book> standardList = getAllBooksService.execute();
            printToSpecialFormat(standardList);
        }
        System.out.println("Pages of books:" + resultList.size());
        printHashMap(resultList);
    }

    private void printHashMap(Map<Integer, List<Book>> resultMap) {
        for (int i = 1; i < resultMap.size() + 1; i++) {
            try {
                System.out.println("Page Nr. " + i);
                printToSpecialFormat(resultMap.get(i));
                System.out.println("Press Enter to print next page");
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void printToSpecialFormat(List<Book> list) {
        for (Book book : list) {
            System.out.println(book);
        }
    }
}
