package student_daniels_belejuns.lesson_9.level_3;

import java.util.Objects;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase{

    private Product[] products;
    InMemoryDatabase(Product[] productsArray) {this.products = productsArray;}

    @Override
    public void save(Product product) {
        int indexOfEmptyElement = getIndexOfEmptyElement(products);
        if (indexOfEmptyElement != -1) {
            products[indexOfEmptyElement] = product;
        }
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (Objects.equals(productTitle, product.getTitle())) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
    private int getIndexOfEmptyElement(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if(products[i]==null) {
                return i;
            }
        }
        return -1;
    }
}
