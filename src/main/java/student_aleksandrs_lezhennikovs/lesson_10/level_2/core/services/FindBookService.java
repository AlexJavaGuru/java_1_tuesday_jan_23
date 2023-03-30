package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.core.search.SearchCriteria;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;
import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

import java.util.List;
import java.util.Map;

public class FindBookService {
    private BookDatabase storage;
    private PagingService pagingService;
    private OrderingService orderingService;

    public FindBookService(BookDatabase storage) {
        this.storage = storage;
    }

    public FindBookService(BookDatabase storage, PagingService pagingService, OrderingService orderingService) {
        this.storage = storage;
        this.pagingService = pagingService;
        this.orderingService = orderingService;
    }

    public FindBookService(BookDatabase storage, PagingService pagingService) {
        this.storage = storage;
        this.pagingService = pagingService;
    }

    public FindBookService(BookDatabase storage, OrderingService orderingService) {
        this.storage = storage;
        this.orderingService = orderingService;
    }

    public List<Book> initialSearch(SearchCriteria searchCriteria) {
        return storage.find(searchCriteria);
    }

    public Map<Integer, List<Book>> orderingPagingSearch(String orderBy, Integer pageSize, SearchCriteria searchCriteria) {
        List<Book> searchResult = storage.find(searchCriteria);
        orderingService.ordering(orderBy, searchResult);
        return pagingService.paging(pageSize, searchResult);
    }

    public List<Book> orderingSearch(String orderBy, SearchCriteria searchCriteria) {
        List<Book> searchResult = storage.find(searchCriteria);
        orderingService.ordering(orderBy, searchResult);
        return searchResult;
    }

    public Map<Integer, List<Book>>  pagingSearch(Integer pageSize, SearchCriteria searchCriteria) {
        List<Book> searchResult = storage.find(searchCriteria);
        return pagingService.paging(pageSize, searchResult);
    }
}
