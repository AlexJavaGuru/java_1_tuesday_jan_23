package student_ilya_tihonov.lesson_12.level_5_6;

import java.util.ArrayList;
import java.util.List;

public class ProductValidatorImpl implements ProductValidator{

    private List<FieldValidationRule> validationRules = new ArrayList<>();

    public ProductValidatorImpl(ProductTitleValidationRule titleValidationRule,
                                ProductPriceValidationRule priceValidationRule,
                                ProductDescriptionValidationRule descriptionValidationRule) {
        validationRules.add(titleValidationRule);
        validationRules.add(priceValidationRule);
        validationRules.add(descriptionValidationRule);
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
        return exceptions;    }
}