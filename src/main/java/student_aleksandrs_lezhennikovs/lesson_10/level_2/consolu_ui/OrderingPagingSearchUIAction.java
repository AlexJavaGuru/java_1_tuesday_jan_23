package student_aleksandrs_lezhennikovs.lesson_10.level_2.consolu_ui;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.AuthorSearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services.FindBookService;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrderingPagingSearchUIAction implements UIAction {
    private FindBookService findBookService;

    public OrderingPagingSearchUIAction(FindBookService findBookService) {
        this.findBookService = findBookService;
    }

    @Override
    public void execute() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Input book's author");
        String author = input.nextLine();
        System.out.println("Select order type: byTitle; byAuthor; byYear");
        String orderBy = input.nextLine();
        System.out.println("Input page size");
        Integer pageSize = input.nextInt();

        SearchCriteria authorSearch = new AuthorSearchCriteria(author);
        if (pageSize == 0 && orderBy.isBlank()) {
            List<Book> searchResult = findBookService.initialSearch(authorSearch);
            printToSpecialFormat(searchResult);
        } else if (pageSize == 0 ) {
            List<Book> searchResult = findBookService.orderingSearch(orderBy, authorSearch);
            printToSpecialFormat(searchResult);
        } else if (orderBy.isBlank()){
            Map<Integer, List<Book>>  searchResult = findBookService.pagingSearch(pageSize, authorSearch);
            printHashMap(searchResult);
        } else {
            Map<Integer, List<Book>>  searchResult = findBookService.orderingPagingSearch(orderBy, pageSize, authorSearch);
            printHashMap(searchResult);
        }
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
