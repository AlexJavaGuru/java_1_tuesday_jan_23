package student_natalja_semitseva.Lesson_9_Task_10;

import java.util.Optional;

public class InMemoryDataBase implements ProductDatabase {

    Product[] productsDatabase = new Product[0];

    @Override
    public void save(Product product) {
        Product[] temporaryDatabase = new Product[productsDatabase.length + 1];
        int i = 0;
        for (Product element : productsDatabase) {
            temporaryDatabase[i] = element;
            i++;
        }
        temporaryDatabase[i] = product;
        productsDatabase = temporaryDatabase;
    }


    @Override
    public Optional<Product> findByTitle(String productTitle) {

            for (Product product : productsDatabase) {
                if (product.getTitle().equals(productTitle)) {
                    return Optional.of(product);
                }
            }
            return null;
    }
}
