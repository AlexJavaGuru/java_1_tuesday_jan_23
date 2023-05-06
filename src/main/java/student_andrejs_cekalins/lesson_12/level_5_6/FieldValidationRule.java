package student_andrejs_cekalins.lesson_12.level_5_6;

public interface FieldValidationRule {
    void validate(Product product) throws ValidationException;
}
