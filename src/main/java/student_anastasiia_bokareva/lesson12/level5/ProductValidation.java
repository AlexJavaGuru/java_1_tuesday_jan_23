package student_anastasiia_bokareva.lesson12.level5;

import java.util.List;

public interface ProductValidation {
    List<ValidationException> validate(Product product);
}
