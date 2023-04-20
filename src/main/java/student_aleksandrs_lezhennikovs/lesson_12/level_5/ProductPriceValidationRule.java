package student_aleksandrs_lezhennikovs.lesson_12.level_5;


class ProductPriceValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getPrice() == null) {
            throw new  ValidationException("RULE-5", "price", "Price can not be empty");
        } else if (product.getPrice() <= 0) {
            throw new  ValidationException("RULE-6", "price", "Price should be more then 0");
        } else if (product.getPrice().toString().matches(".*[^0-9.].*")) {
            throw new  ValidationException("RULE-7", "price", "Price should contains only digits");
        }
    }
}
