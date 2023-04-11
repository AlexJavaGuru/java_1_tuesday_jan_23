package student_oksana_tarasova.lesson_12.level_5;

import java.util.List;

public interface ProductValidator {

    List<ValidationException> validate(Product product);

}
