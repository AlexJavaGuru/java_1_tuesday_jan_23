package student_julija_raudive.lesson_12.level_5;

class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {

        if (product.getDescription().length() > 2000) {
            throw new ValidationException("Description too long", "Description is more than 100 characters!", "description");

        } else if (product.getDescription().matches("[^a-zA-Z0-9]+$")) {
            throw new ValidationException("Description contains invalid characters", "Description contains invalid characters!!", "description");
        }

    }
}
