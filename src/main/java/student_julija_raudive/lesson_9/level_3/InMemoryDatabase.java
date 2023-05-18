package student_julija_raudive.lesson_9.level_3;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

class InMemoryDatabase implements ProductDatabase {

    ArrayList<Product> productList;

    public InMemoryDatabase(ArrayList<Product> productList) {
        this.productList = productList;
    }


    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Optional<Product> findByTitle(String productTitle) {
        for (Product product: productList){
            if (Objects.equals(productTitle, product.getTitle())){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
