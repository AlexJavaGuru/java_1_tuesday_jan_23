package student_oksana_tarasova.Lesson_9.level_3;

import java.util.Optional;

public interface ProductDatabase1 {

    void save(Product product);

    Optional<Product> findByTitle(String productTitle);
}
