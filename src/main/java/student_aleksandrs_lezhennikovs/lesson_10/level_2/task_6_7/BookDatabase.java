package student_aleksandrs_lezhennikovs.lesson_10.level_2.task_6_7;

interface BookDatabase {
    Long save(Book book);
    void saveBook(Book book);
    boolean delete(Long bookId);
}
