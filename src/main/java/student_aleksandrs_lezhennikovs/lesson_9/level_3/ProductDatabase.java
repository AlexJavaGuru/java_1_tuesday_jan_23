package student_aleksandrs_lezhennikovs.lesson_9.level_3;

//содержит два абстрактных метода, поэтому не является функциональным интерфейсом.

interface ProductDatabase {
    void save(Product product);

    Product findByTitle(String productTitle);

}

