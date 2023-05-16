package student_natalja_semitseva.Lesson_9_Task_10;


import java.util.Optional;

public interface ProductDatabase {


    void save(Product product);


    Optional<Product> findByTitle(String productTitle);
}
