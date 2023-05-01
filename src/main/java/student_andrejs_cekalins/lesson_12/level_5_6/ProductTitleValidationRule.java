package student_andrejs_cekalins.lesson_12.level_5_6;

public class ProductTitleValidationRule implements FieldValidationRule {
    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getTitle() == null || product.getTitle().equals("")) {
            throw new ValidationException("TitleIsEmpty", "Title field can't be empty", "title");
        } else if (product.getTitle().length() < 3) {
            throw new ValidationException("TitleTooShort", "Title length must be more than 3 symbols", "title");
        } else if (product.getTitle().length() > 100) {
            throw new ValidationException("TitleTooLong", "Title length can't be longer than 100 symbols", "title");
        } else if (!product.getTitle().matches("[a-zA-Z0-9\\s]+")) {
            throw new ValidationException("TitleEnglishAndNumbers", "Title can't contain any symbols accept in English letters or numbers", "title");
        }
    }
}
