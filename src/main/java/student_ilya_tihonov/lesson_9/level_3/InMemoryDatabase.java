package student_ilya_tihonov.lesson_9.level_3;


import java.util.Optional;

public class InMemoryDatabase implements ProductDatabase{

    private Product[] products;

    public InMemoryDatabase() {
        this.products = new Product[0];
    }


    @Override
    public void save(Product product) {
        Product[] newProducts = new Product[products.length + 1];
        System.arraycopy(products, 0, newProducts, 0, products.length);
        newProducts[products.length] = product;
        products = newProducts;
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product : products) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
