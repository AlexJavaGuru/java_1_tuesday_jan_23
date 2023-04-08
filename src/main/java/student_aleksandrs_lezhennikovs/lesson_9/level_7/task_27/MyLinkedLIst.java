package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_27;

import java.util.List;
import java.util.Optional;

interface MyLinkedLIst {

    void add(Orders order);
    void deleteByTitle(String title);
    void sortByTitle();
    List<Orders> printAll();
    Optional<Orders> searchByTitle(String title);

}
