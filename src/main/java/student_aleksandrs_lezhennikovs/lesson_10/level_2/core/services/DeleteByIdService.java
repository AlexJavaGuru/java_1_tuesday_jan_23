package student_aleksandrs_lezhennikovs.lesson_10.level_2.core.services;

import student_aleksandrs_lezhennikovs.lesson_10.level_2.storage.BookDatabase;

public class DeleteByIdService {
    BookDatabase storage;

    public DeleteByIdService(BookDatabase storage) {
        this.storage = storage;
    }

    public boolean deleteById(Long id) {
        return storage.deleteById(id);
    }
}
