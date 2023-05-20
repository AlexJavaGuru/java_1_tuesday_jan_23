package student_julija_raudive.lesson_12.level_5;

class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new ValidationException("Price is empty", "The price field is empty!", "price");
        } else if (product.getPrice() <= 0) {
            throw new ValidationException("Price is 0 or less", "The price 0 or less!", "price");
        }
    }
}
