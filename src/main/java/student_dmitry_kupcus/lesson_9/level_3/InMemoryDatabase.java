package student_dmitry_kupcus.lesson_9.level_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {
    private List<String> productList = new ArrayList<>();
    @Override
    public void save(Product product) {
        this.productList.add(product.getTitle());
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        if (productList.contains(productTitle)) {
            return Optional.of((Product) productList);
        }
        return Optional.empty();
    }
}
