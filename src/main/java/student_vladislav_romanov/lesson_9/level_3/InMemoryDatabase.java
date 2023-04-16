package student_vladislav_romanov.lesson_9.level_3;

import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

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
        return Optional.empty();
    }

}
