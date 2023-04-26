package student_oksana_tarasova.lesson_12.level_5;

public class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle() == "") {
            throw new ValidationException("RULE-1", "title", "Title can not be empty");

        } else if (product.getTitle().length() < 3) {
            throw new ValidationException("RULE-2", "title", "Must not be shorter than 3 characters");

        } else if (product.getTitle().length() > 100) {
            throw new ValidationException("RULE-3", "title", "Should not be longer than 100 characters");

        } else if (!product.getTitle().matches("[\\d\\p{L}| ]+")) {
            throw new ValidationException("RULE-4", "title", "Must contain only English letters and numbers, other characters are not allowed");
        }
    }
}
