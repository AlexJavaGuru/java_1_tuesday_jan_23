package student_andrejs_cekalins.lesson_12.level_5_6;

import java.util.List;

public interface ProductValidator {
    List<ValidationException> validate(Product product);
}
