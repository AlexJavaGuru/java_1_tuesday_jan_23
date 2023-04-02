package student_natalja_semitseva.Lesson_9_Task_6_9;

public interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);
}

