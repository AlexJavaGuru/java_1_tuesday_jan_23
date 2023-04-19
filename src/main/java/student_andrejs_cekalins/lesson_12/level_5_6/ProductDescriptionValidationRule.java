package student_andrejs_cekalins.lesson_12.level_5_6;


public class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("DescriptionIsLong", "Description can't be more than 2000 symbols", "description");
        }
        if (!product.getDescription().matches("[a-zA-Z0-9\\s]+")) {
            throw new ValidationException("DescriptionEnglishAndNumbers", "Description can't contain any symbols accept in English letters or numbers", "description");
        }
    }
}
