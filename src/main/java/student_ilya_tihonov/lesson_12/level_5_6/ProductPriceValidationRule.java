package student_ilya_tihonov.lesson_12.level_5_6;

public class ProductPriceValidationRule implements FieldValidationRule {

    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null || product.getPrice() <= 0) {
            throw new ValidationException("PriceHigherZero", "Price should be greater than 0", "price");
        }
    }

}
