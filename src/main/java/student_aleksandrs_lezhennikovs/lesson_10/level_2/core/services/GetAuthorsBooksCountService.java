package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

import java.util.Map;

public class GetAuthorsBooksCountService {
    private BookDatabase storage;

    public GetAuthorsBooksCountService(BookDatabase storage) {
        this.storage = storage;
    }

    public Map<String, Integer> execute() {
        return storage.getEachAuthorBookCount();
    }
}
