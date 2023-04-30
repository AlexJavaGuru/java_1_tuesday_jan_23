package student_vladislav_romanov.lesson_12.level_5;

class ProductPriceValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == 0) {
            throw new ValidationException("priceIsZero", "Price need to be more than 0", "price");
        }
    }

}