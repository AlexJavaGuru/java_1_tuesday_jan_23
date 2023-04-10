package student_anastasiia_bokareva.lesson9.level3;

import java.util.Optional;

public class InMemoryDateBase implements ProductDataBase {

    Product[] productsDateBase = new Product[0];

    @Override
    public void save(Product product) {
        Product[] temporaryProductBase = new Product[productsDateBase.length + 1];
        int i = 0;
        for (Product element : productsDateBase) {
            temporaryProductBase[i] = element;
            i++;
        }
        temporaryProductBase[i] = product;
        productsDateBase = temporaryProductBase;
    }

    @Override
    public Optional <Product> findByTitle(String productTitle) {
        for (Product product : productsDateBase) {
            if (product.getTitle().equals(productTitle)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }
}
