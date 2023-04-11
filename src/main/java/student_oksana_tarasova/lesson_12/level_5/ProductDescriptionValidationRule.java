package student_oksana_tarasova.lesson_12.level_5;

public class ProductDescriptionValidationRule implements FieldValidationRule {

    @Override
    public void validate(Product product) throws ValidationException {
        if (product.getDescription().length() > 2000) {
            throw new ValidationException("RULE-7", "description", "Must not be longer than 2000 characters");
        } else if (!product.getDescription().matches("[\\d\\p{L}| ]+")) {
            throw new ValidationException("RULE-8", "description", "Must contain only English letters" +
                    " and numbers, other characters are not allowed");
        }
    }
}
/*
 RULE-8: не должно быть длиннее 2000 символов
            - RULE-9: должно содержать только английские буквы и цифры, другие символы не допустимы
 */