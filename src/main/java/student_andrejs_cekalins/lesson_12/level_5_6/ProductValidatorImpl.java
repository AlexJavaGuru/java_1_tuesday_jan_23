package student_andrejs_cekalins.lesson_12.level_5_6;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator {
    private List<FieldValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule productTitleValidationRule, ProductPriceValidationRule productPriceValidationRule,
                                ProductDescriptionValidationRule productDescriptionValidationRule) {

        validationRules.add(productTitleValidationRule);
        validationRules.add(productPriceValidationRule);
        validationRules.add(productDescriptionValidationRule);
    }

    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> exceptions = new ArrayList<>();
        for (FieldValidationRule validationRule : validationRules) {
            try {
                validationRule.validate(product);
            } catch (ValidationException e) {
                exceptions.add(e);
            }
        }
        return exceptions;
    }

    @Override
    public String toString() {
        return "ProductValidatorImpl{" +
                ", validationRules ='" + validationRules + '\'' +
                '}';
    }
}
