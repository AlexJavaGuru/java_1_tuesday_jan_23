package student_andrejs_cekalins.lesson_10.level_2.Task_6;

import java.util.HashMap;
import java.util.Map;

class BookDatabaseImpl implements BookDatabase {

    @Override
    public Long save(Book book) {

        Map<Id, Book> books = new HashMap();
        books.put(new Id(1), book);
        return book.getId();
    }
}
