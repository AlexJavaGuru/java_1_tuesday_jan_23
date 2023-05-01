package student_aleksandrs_lezhennikovs.lesson_12.level_5;

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null) {
            throw new ValidationException("RULE-1", "title", "Title can not be empty");
        } else if (product.getTitle().isBlank()) {
            throw new ValidationException("RULE-1", "title", "Title can not be empty");
        } else if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "title", "Title can not be less than 3 symbols");
        } else if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "title", "Title can not be more than 100 symbols");
        } else if (product.getTitle().matches("[^a-zA-Z0-9]+$")) {
            throw new ValidationException("RULE-4", "title", "Title can contains only English letters and numbers");
        }
    }
}
