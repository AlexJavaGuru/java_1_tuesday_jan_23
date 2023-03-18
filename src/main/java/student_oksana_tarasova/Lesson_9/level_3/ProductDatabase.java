package student_oksana_tarasova.Lesson_9.level_3;

public interface ProductDatabase {

    void save(Product product);

    Product findByTitle(String productTitle);
}
