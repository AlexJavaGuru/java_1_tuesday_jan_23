package student_vladislav_romanov.lesson_12.level_5;

class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("descriptionIsTooLong", "Description cannot be longer than 100 characters", "description");
        }
        else if (!product.getDescription().matches("[a-zA-Z0-9\\s]+")) {
            throw new ValidationException("descriptionContainUnallowedSymbols", "Description can contain digits and latin letters only", "description");
        }
    }

}