package student_oksana_tarasova.lesson_12.level_5;

import java.util.List;

public class TestManyExceptions {

    ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule productPriceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule productDescriptionValidationRule = new ProductDescriptionValidationRule();


    private ProductValidator validator = new ProductValidatorImpl(productTitleValidationRule,
            productPriceValidationRule, productDescriptionValidationRule);

    public static void main(String[] args) {
        TestManyExceptions test = new TestManyExceptions();
        test.exceptionsTitleAndPrise();
        test.exceptionsTitleAndPrise1();
        test.exceptionsTitleAndDescription();
        test.exceptionsTitleAndDescriptionAndPrice();
    }

    public void exceptionsTitleAndPrise() {
        Product product = new Product(null, null, "description");
        List<ValidationException> realResult = validator.validate(product);
        checkResults(realResult.size() == 2, "exceptions count");
        checkResults(realResult.contains(new ValidationException("RULE-1", "title", "Title can not be empty")), "Rule-1");
        checkResults(realResult.contains(new ValidationException("RULE-5", "price", "Must not be empty")), "Rule-5");

    }

    public void exceptionsTitleAndPrise1() {
        Product product = new Product("", 0, "description");
        List<ValidationException> realResult = validator.validate(product);
        checkResults(realResult.size() == 2, "exceptions count");
        checkResults(realResult.contains(new ValidationException("RULE-1", "title", "Title can not be empty")), "Rule-1");
        checkResults(realResult.contains(new ValidationException("RULE-6", "price", "Must be greater than 0")), "Rule-6");

    }
    public void exceptionsTitleAndDescription() {
        Product product = new Product("df", 1, "description &");
        List<ValidationException> realResult = validator.validate(product);
        checkResults(realResult.size() == 2, "exceptions count");
        checkResults(realResult.contains(new ValidationException("RULE-2", "title", "Must not be shorter than 3 characters")), "Rule-2");
        checkResults(realResult.contains(new ValidationException("RULE-8", "description", "Must contain only English letters" +
                " and numbers, other characters are not allowed")), "Rule-8");

    }

    public void exceptionsTitleAndDescriptionAndPrice() {
        Product product = new Product("df*", 0, "description &");
        List<ValidationException> realResult = validator.validate(product);
        checkResults(realResult.size() == 3, "exceptions count");
        checkResults(realResult.contains(new ValidationException("RULE-4", "title", "Must contain only English letters and numbers, other characters are not allowed")), "Rule-4");
        checkResults(realResult.contains(new ValidationException("RULE-6", "price", "Must be greater than 0")), "Rule-6");
        checkResults(realResult.contains(new ValidationException("RULE-8", "description", "Must contain only English letters" +
                " and numbers, other characters are not allowed")), "Rule-8");

    }
    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
