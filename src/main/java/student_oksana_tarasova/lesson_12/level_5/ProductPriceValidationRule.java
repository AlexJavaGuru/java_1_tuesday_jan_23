package student_oksana_tarasova.lesson_12.level_5;

public class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("RULE-5", "price", "Must not be empty");
        } else if (product.getPrice() == 0) {
            throw new ValidationException("RULE-6", "price", "Must be greater than 0");
        }
    }
}
