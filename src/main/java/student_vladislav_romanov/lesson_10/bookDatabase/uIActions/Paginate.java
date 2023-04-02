package student_vladislav_romanov.lesson_10.bookDatabase.uIActions;

import student_vladislav_romanov.lesson_10.bookDatabase.core.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Paginate {

    public List<Book> split(List<Book> books, int paging) {
        final int PAGE_SIZE = 3;
        int pageId = 1;
        int resultCounter = 0;
        Map<Integer, List<Book>> pagedResult = new HashMap<>();
        List<Book> list = new ArrayList<>();

        for (Book book : books) {
            list.add(book);
            resultCounter++;
            pagedResult.put(pageId, list);

            if (resultCounter == PAGE_SIZE) {
                resultCounter = 0;
                pageId++;
                list = new ArrayList<>();
            }
        }

        return pagedResult.get(paging);
    }

}
