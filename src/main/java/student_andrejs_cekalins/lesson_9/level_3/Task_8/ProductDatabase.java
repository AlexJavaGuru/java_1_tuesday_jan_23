package student_andrejs_cekalins.lesson_9.level_3.Task_8;

interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);

}
