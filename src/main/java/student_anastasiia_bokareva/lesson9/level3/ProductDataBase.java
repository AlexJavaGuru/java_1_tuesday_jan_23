package student_anastasiia_bokareva.lesson9.level3;

import java.util.Optional;

public interface ProductDataBase {
    void save( Product product);

   Optional <Product> findByTitle(String productTitle);

}
