package student_andrejs_cekalins.lesson_9.level_3.Task_8;

import java.util.Objects;

class InMemoryDatabase implements ProductDatabase {
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
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (Objects.equals(productTitle, product.getTitle())) {
                return product;
            }
        }
        return null;
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
