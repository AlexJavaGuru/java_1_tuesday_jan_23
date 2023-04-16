package student_vladislav_romanov.lesson_12.level_5;

class ProductNameValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getName().equals("") || product.getName() == null) {
            throw new ValidationException("nameIsEmpty", "Name cannot be empty", "name");
        }
        else if (product.getName().length() < 3) {
            throw new ValidationException("nameIsTooShort", "Name must have at least 3 characters", "name");
        }
        else if (product.getName().length() > 100) {
            throw new ValidationException("nameIsTooLong", "Name cannot be longer than 100 characters", "name");
        }
        else if (!product.getName().matches("[a-zA-Z0-9\\s]+")) {
            throw new ValidationException("nameContainUnallowedSymbols", "Name can contain digits and latin letters only", "name");
        }
    }

}