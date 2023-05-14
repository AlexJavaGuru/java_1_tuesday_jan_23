package student_anastasiia_bokareva.lesson12.level5;

import java.util.ArrayList;
import java.util.List;

public class ProductValidationImpl implements ProductValidation {

    private List<ValidationUI> exceptions = new ArrayList<>();

    public ProductValidationImpl(ProductValidationRuleProduct ruleProduct,
                                 ProductValidationRulePrice price,
                                 ProductValidationRuleDescription description) {
        exceptions.add(ruleProduct);
        exceptions.add(price);
        exceptions.add(description);

    }


    @Override
    public List<ValidationException> validate(Product product) {
        List<ValidationException> validationExceptions = new ArrayList<>();
        for (ValidationUI rule : exceptions) {
            try {
                rule.validation(product);
            } catch (ValidationException e) {
                validationExceptions.add(e);
            }
        }
        return validationExceptions;
    }

    @Override
    public String toString() {
        return "ProductValidationImpl{" +
                "exceptions=" + exceptions +
                '}';
    }
}
