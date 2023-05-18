package student_julija_raudive.lesson_9.level_3;

import java.util.Optional;

interface ProductDatabase {

     void save(Product product);

     Optional<Product> findByTitle(String productTitle);

}
