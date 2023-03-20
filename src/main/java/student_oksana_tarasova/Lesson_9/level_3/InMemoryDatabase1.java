package student_oksana_tarasova.Lesson_9.level_3;

import java.util.Optional;
import java.util.Arrays;

class InMemoryDatabase1 implements ProductDatabase1 {

    private Product[] products;

    public InMemoryDatabase1(Product[] products) {
        this.products = products;
    }

    @Override
    public void save(Product product) {
        databaseIncrease();
        products[products.length - 1] = product;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for(Product product : products) {
            if(product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }


    private Product[] databaseIncrease() {
        Product[] products1 = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            products1[i] = products[i];
        }
        return products = products1;
    }

    public static void main(String[] args) {
        Product[] products = {
                new Product("Kalev"),
                new Product("Roshen"),
                new Product("Dark night")
        };

        InMemoryDatabase1 inMemoryDatabase1 = new InMemoryDatabase1(products);
        System.out.println(inMemoryDatabase1.findByTitle("Roshen"));

    }
}
