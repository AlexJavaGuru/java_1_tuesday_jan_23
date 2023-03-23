package student_andrejs_cekalins.lesson_9.level_3.Task_10;

import java.util.Optional;

interface ProductDatabase {
    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
