package student_andrejs_cekalins.lesson_10.level_7.Task_39;

import student_andrejs_cekalins.lesson_10.level_2_level_4_and_level_5.Book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookPaginationService {
    public Map<Integer, List<Book>> pagingBooks(Integer pageSize, List<Book> pagingList) {
        Map<Integer, List<Book>> pagingRepository = new HashMap<>();
        int fromIndex;
        int toIndex;
        int lastPage = (int) Math.ceil((double) pagingList.size() / pageSize);
        for (int page = 1; page < lastPage + 1; page++) {
            fromIndex = page * pageSize - pageSize;
            toIndex = page * pageSize;
            if (toIndex > pagingList.size()) {
                toIndex = pagingList.size();
            }
            pagingRepository.put(page, pagingList.subList(fromIndex, toIndex));
        }
        return pagingRepository;
    }
}
