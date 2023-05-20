package student_julija_raudive.lesson_12.level_5;

class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().isEmpty()) {
            throw new ValidationException("Title is empty", "The title field is empty!", "title");

        } else if (product.getTitle().length() < 3 || product.getTitle().length() > 100) {
            throw new ValidationException("Title length does not match the rules", "The title length should be longer than 3 and less than 100 characters!", "title");

        } else if (product.getTitle().matches("[^a-zA-Z0-9]+$")) {
            throw new ValidationException("Title contains invalid characters", "The title contains invalid characters!", "title");
        }


    }
}
