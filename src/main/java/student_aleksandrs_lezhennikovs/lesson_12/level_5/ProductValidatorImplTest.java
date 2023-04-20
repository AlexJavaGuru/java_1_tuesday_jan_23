package student_aleksandrs_lezhennikovs.lesson_12.level_5;

import java.math.BigDecimal;
import java.util.List;

class ProductValidatorImplTest {
    private ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    private ProductPriceValidationRule productPriceValidationRule = new ProductPriceValidationRule();
    private ProductDescriptionValidationRule productDescriptionValidationRule = new ProductDescriptionValidationRule();
    private ProductValidator validator = new ProductValidatorImpl(productTitleValidationRule, productPriceValidationRule,
                                                                  productDescriptionValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.rule1_v1();
        test.rule1_v2();
        test.rule2();
        test.rule3();
        test.rule4();
        test.rule5();
        test.rule6();
        //test.rule7();
        test.rule8();
        test.rule9();
    }

    public void rule1_v1() {
        Product product = new Product(null, new BigDecimal(1), "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1 v1 Title nul test");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1 v1 Title nul test");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1 v1 Title null test");
    }

    public void rule1_v2() {
        Product product = new Product("", new BigDecimal(1), "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1 v2 Title blank test");
    }

    public void rule2() {
        Product product = new Product("ch", new BigDecimal(1), "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be less than 3 symbols"), "rule2 Title less than 3 symbols test");
    }

    public void rule3() {
        Product product = new Product("symbolstensymbolstensymbolstensymbolstensymbolstensymbolstensymbolstensymbolstensymbolstensymbolsten1", new BigDecimal(1), "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be more than 100 symbols"), "rule3 Title more than 100 symbols test");
    }

    public void rule4() {
        Product product = new Product("@#$%^", new BigDecimal(1), "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResult(exceptions.get(0).getDescription().equals("Title can contains only English letters and numbers"), "rule4 Title not letters and digits test");
    }

    public void rule5() {
        Product product = new Product("Some Product", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5 Price null test");
    }

    public void rule6() {
        Product product = new Product("Some Product", new BigDecimal(0), "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6");
        checkResult(exceptions.get(0).getDescription().equals("Price should be more then 0"), "rule6 Price 0 test");
    }
    public void rule7() {

        Product product = new Product("Some Product", new BigDecimal("wer@#$"), "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule7");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Price should contains only digits"), "rule7");
    }

    public void rule8() {
        StringBuffer stringBuffer = new StringBuffer();

        Product product = new Product("Some Product", new BigDecimal(1), "descriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescriptiondescr"); //Todo check for description more than 2000 symbols
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResult(exceptions.get(0).getDescription().equals("Description should be less than 2000 symbols"), "rule8 Description more than 2000 symbols");
    }

    public void rule9() {
        Product product = new Product("Some Product", new BigDecimal(1), "Описание !@#$%^");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule9");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-9"), "rule9");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule9");
        checkResult(exceptions.get(0).getDescription().equals("Description can contains only English letters and numbers"), "rule9 Description non English letters and digits");
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = has PASSED");
        } else {
            System.out.println(testName + " = has FAILED");
        }
    }

}
