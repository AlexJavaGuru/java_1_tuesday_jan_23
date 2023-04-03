package student_oksana_tarasova.lesson_10.level_7;

import student_oksana_tarasova.lesson_10.level_2.Book;

import java.util.*;

public class PagingListBook {

    int pageSize;
    List<Book> books;


    public PagingListBook(List<Book> books, int pageSize) {
        this.pageSize = pageSize;
        this.books = new ArrayList(books);

    }

    public Map<Integer, List<Book>> paging() {
        Map<Integer, List<Book>> pagingBooks = new HashMap<>();
        int countKey = countKeyForMap();
        for (int j = 0; j < countKey; j++) {
            int start = j * pageSize;
            int end = start + pageSize;
            if (end >= books.size()) {
                end = books.size();
            }
            pagingBooks.put(j + 1, books.subList(start, end));
        }
        return pagingBooks;
    }

    private int countKeyForMap() {
        int count = 0;
        if (books.size() % pageSize == 0) {
            count = books.size() / pageSize;
        } else {
            count = books.size() / pageSize + 1;
        }
        return count;
    }

}

