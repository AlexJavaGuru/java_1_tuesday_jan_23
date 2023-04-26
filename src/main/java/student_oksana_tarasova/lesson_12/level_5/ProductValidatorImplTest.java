package student_oksana_tarasova.lesson_12.level_5;

import java.util.List;

public class ProductValidatorImplTest {

    ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule productPriceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule productDescriptionValidationRule = new ProductDescriptionValidationRule();


    private ProductValidator validator = new ProductValidatorImpl(productTitleValidationRule,
            productPriceValidationRule, productDescriptionValidationRule);


    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2_v1();
        test.rule3_v1();
        test.rule4_v1();
        test.rule5_v1();
        test.rule6_v1();
        test.rule7_v1();
        test.rule8_v1();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void rule2_v1() {
        Product product = new Product("RT", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule2");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResults(exceptions.get(0).getDescription().equals("Must not be shorter than 3 characters"), "rule2");
    }

    public void rule3_v1() {
        Product product = new Product("fgfff ffffffffffff" +
                " 6    fffffffffffffffffffffffffffffffffffffff" +
                "fffffffffffffffffffffffff dddddddddddd", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule3");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResults(exceptions.get(0).getDescription().equals("Should not be longer than 100 characters"), "rule3");
    }

    public void rule4_v1() {
        Product product = new Product("ght 86 - ) прг 63", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule4");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResults(exceptions.get(0).getDescription().equals("Must contain only English letters and numbers," +
                " other characters are not allowed"), "rule4");
    }

    public void rule5_v1() {
        Product product = new Product("Orange2", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule5");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResults(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResults(exceptions.get(0).getDescription().equals("Must not be empty"), "rule5");
    }

    public void rule6_v1() {
        Product product = new Product("Orange55", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule6");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResults(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResults(exceptions.get(0).getDescription().equals("Must be greater than 0"), "rule6");
    }

    public void rule7_v1() {
        Product product = new Product("Orange", 1,
                "fgfff ffffffffffff 6    fffffffffffffff" +
                        "fffffffffffffffffffffffffffffffffffffffffffffffff" +
                        " ddddddddddddп аа аааааааааааааааааааааааааааааааа" +
                        "ааааааааааааааааааааааааааааааа аааааааааааааааав " +
                        "             5555555  кккккккккккккккккккккккккккккккккк" +
                        "кккккккккккв    ккккккккккккккккккккккккккккккккк" +
                        "кккккккккккккккккккккккккккккккккккккккккккккккккккк" +
                        "кккккккккккккккккккккккккккккккккккккккккккккккккккккккккк" +
                        "кккккккккккккккккккккккккккккккккккккккккккккккккккккккккк" +
                        "кккккккккккккккккккккккккккккккккккккккккккккккккккккккккк" +
                        "ккккккккккккккккккккккккккккккккккккккккккккккккккккккккккк" +
                        "ккккккккккккккккккккккккккккккккккккк ккккккккккккккккккккккк" +
                        "ккккккккккккккккккккккккккккккккккккккккккккккккккккккккккккк" +
                        "ккккккккккккккккккккккккккккккккккккккккккккккккккккккккккккк" +
                        "ккккккккккккккккккккккккккккккккккккккккккккк кккккккккккк" +
                        "ккккккккккккккккккккккккккккккккккккккккк555555555555555555" +
                        "5555555 555555555555555555555555555555555555555555555555555" +
                        "555555555555555555555555555555555555555555555555555555555555" +
                        "555 555555555555555555555555555555555555555555555555555555555" +
                        "55555555555555555555555555555555555555555555555555555555555555" +
                        "5555555555555555555555555555555555555555555555555555555555555555" +
                        "555555555555555555555555555555555555555555555555555555555555555" +
                        "55555555555555555555 555555555555555555555555555555555555555555" +
                        "55555555555555555555555555555555555555555555555555555555555555555" +
                        "555555555555555555555555555555555555555555555555555555555 ееееее" +
                        "еееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееее" +
                        "ееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееее" +
                        "еееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееее" +
                        "ееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееее" +
                        "ееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееее" +
                        "еееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееее" +
                        "еееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееее" +
                        "ееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееееее" +
                        " пппппппппппппппппппппппппппп\n" +"\n" +  "ппппппп");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule7");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResults(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResults(exceptions.get(0).getDescription().equals("Must not be longer than 2000 characters"), "rule7");
    }

    public void rule8_v1() {
        Product product = new Product("Orange", 1, "gjhkik j8845&^-");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule8");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResults(exceptions.get(0).getFieldName().equals("description"), "rule8");
        checkResults(exceptions.get(0).getDescription().equals("Must contain only English letters and numbers, other characters are not allowed"), "rule8");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
}
