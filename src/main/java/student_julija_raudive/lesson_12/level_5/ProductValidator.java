package student_julija_raudive.lesson_12.level_5;

import java.util.List;

interface ProductValidator {
     List<ValidationException> validate(Product product);
}
