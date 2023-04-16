package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.domain.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PagingService {

    public Map<Integer, List<Book>> paging(Integer pageSize, List<Book> listForPaging) {
        Map<Integer, List<Book>> pagingStorage = new HashMap<>();
        int fromIndex, toIndex;
        int lastPage = (int) Math.ceil((double) listForPaging.size() / pageSize);
        for (int page = 1; page < lastPage + 1; page++) {
            fromIndex = page * pageSize - pageSize;
            toIndex = page * pageSize;
            if (toIndex > listForPaging.size()) {
                toIndex = listForPaging.size();
            }
            pagingStorage.put(page, listForPaging.subList(fromIndex, toIndex));
        }
        return pagingStorage;
    }

}
