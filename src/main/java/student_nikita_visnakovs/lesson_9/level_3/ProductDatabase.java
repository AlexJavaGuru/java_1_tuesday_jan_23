package student_nikita_visnakovs.lesson_9.level_3;

import java.util.Optional;

public interface ProductDatabase {

    void save(Product product);

    Product[] getProducts();

    Optional<Product> findByTitle(String productTitle);

}
