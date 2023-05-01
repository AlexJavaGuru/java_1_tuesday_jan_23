package student_aleksandrs_lezhennikovs.lesson_12.level_5;

class ProductDescriptionValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-8", "description", "Description should be less than 2000 symbols");
        } else if (product.getDescription().matches("[^a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-9", "description", "Description can contains only English letters and numbers");
        }
    }
}
