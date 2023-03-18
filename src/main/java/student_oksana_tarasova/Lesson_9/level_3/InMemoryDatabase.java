package student_oksana_tarasova.Lesson_9.level_3;

import java.util.Arrays;

public class InMemoryDatabase implements ProductDatabase {

    private Product[] products;

    public InMemoryDatabase(Product[] products) {
        this.products = products;
    }


    @Override
    public void save(Product product) {
        Product[] products1 = new Product[products.length + 1];
        for (int i = 0; i < products.length + 1; i++) {
            products1[i] = products[i];
        }
        products1[products.length] = product;
    }

    @Override
    public Product findByTitle(String productTitle) {
        for (Product product : products) {
            if (productTitle.equalsIgnoreCase(product.getTitle())) {
                return product;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "InMemoryDatabase{" +
                "products=" + Arrays.toString(products) +
                '}';
    }
}
/*





 */