package student_aleksandrs_lezhennikovs.lesson_9.level_7.task_26;

interface MyList {

    void add(Orders order);
    void deleteByTitle(String title);
    void sortByTitle();
    Orders[] printAll();
    Orders[] searchByTitle(String title);

}
