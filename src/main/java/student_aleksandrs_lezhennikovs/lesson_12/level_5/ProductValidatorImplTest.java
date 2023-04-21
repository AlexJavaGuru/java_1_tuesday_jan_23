package student_aleksandrs_lezhennikovs.lesson_12.level_5;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
        test.rule10();
        test.rule11();
        test.rule12();
        test.rule13();
    }

    public void rule1_v1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1 v1 Title nul test");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1 v1 Title nul test");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1 v1 Title nul test");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1 v1 Title null test");
    }

    public void rule1_v2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule1 v2 Title blank test");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1 v2 Title blank test");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule1 v2 Title blank test");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1 v2 Title blank test");
    }

    public void rule2() {
        Product product = new Product("ch", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule2 Title less than 3 symbols test");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2 Title less than 3 symbols test");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule2 Title less than 3 symbols test");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be less than 3 symbols"), "rule2 Title less than 3 symbols test");
    }

    public void rule3() {
        String text = getString(97, 123, 101);
        Product product = new Product(text, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule3 Title more than 100 symbols test");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3 Title more than 100 symbols test");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule3 Title more than 100 symbols test");
        checkResult(exceptions.get(0).getDescription().equals("Title can not be more than 100 symbols"), "rule3 Title more than 100 symbols test");
    }

    public void rule4() {
        Product product = new Product("@#$%^", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule4 Title not letters and digits test");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4 Title not letters and digits test");
        checkResult(exceptions.get(0).getFieldName().equals("title"), "rule4 Title not letters and digits test");
        checkResult(exceptions.get(0).getDescription().equals("Title can contains only English letters and numbers"), "rule4 Title not letters and digits test");
    }

    public void rule5() {
        Product product = new Product("Some Product", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule5 Price null test");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5 Price null test");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule5 Price null test");
        checkResult(exceptions.get(0).getDescription().equals("Price can not be empty"), "rule5 Price null test");
    }

    public void rule6() {
        Product product = new Product("Some Product", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule6 Price 0 test");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-6"), "rule6 Price 0 test");
        checkResult(exceptions.get(0).getFieldName().equals("price"), "rule6 Price 0 test");
        checkResult(exceptions.get(0).getDescription().equals("Price should be more then 0"), "rule6 Price 0 test");
    }
    public void rule7() {
        Integer price = Integer.parseInt("er$%");
        Product product = new Product("Some Product", price, "description");
        List<ValidationException> exceptions = validator.validate(product);
        if (exceptions.size() > 0) {
            for (ValidationException valExc : exceptions) {
                checkResult(valExc.getRuleName().equals("RULE-7"), "rule7");
                System.out.println(valExc.getFieldName());
                System.out.println(valExc.getDescription());
            }
        } else {
            System.out.println("Data is correct for Validation for Rule7 (Only digits in price field)");
        }
    }

    public void rule8() {
        String text = getString(97, 123, 2001);
        Product product = new Product("Some Product", 1, text);
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule8 Description more than 2000 symbols");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-8"), "rule8 Description more than 2000 symbols");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule8 Description more than 2000 symbols");
        checkResult(exceptions.get(0).getDescription().equals("Description should be less than 2000 symbols"), "rule8 Description more than 2000 symbols");
    }

    public void rule9() {
        Product product = new Product("Some Product", 1, "Описание !@#$%^");
        List<ValidationException> exceptions = validator.validate(product);
        checkResult(exceptions.size() == 1, "rule9 Description non English letters and digits");
        checkResult(exceptions.get(0).getRuleName().equals("RULE-9"), "rule9 Description non English letters and digits");
        checkResult(exceptions.get(0).getFieldName().equals("description"), "rule9 Description non English letters and digits");
        checkResult(exceptions.get(0).getDescription().equals("Description can contains only English letters and numbers"), "rule9 Description non English letters and digits");
    }

    public void rule10() {
        Product product = new Product("ch", 0, "description");
        List<ValidationException> exceptions = validator.validate(product);
        if (exceptions.size() > 0) {
            for (ValidationException valExc : exceptions) {
                checkResult(valExc.getRuleName().equals("RULE-2") || valExc.getRuleName().equals("RULE-6"), "rule10");
                System.out.println(valExc.getFieldName());
                System.out.println(valExc.getDescription());
            }
        }
    }

    public void rule11() {
        Product product = new Product("ch", 1, "@#$%^&*");
        List<ValidationException> exceptions = validator.validate(product);
        if (exceptions.size() > 0) {
            for (ValidationException valExc : exceptions) {
                checkResult(valExc.getRuleName().equals("RULE-2") || valExc.getRuleName().equals("RULE-9"), "rule11");
                System.out.println(valExc.getFieldName());
                System.out.println(valExc.getDescription());
            }
        }
    }
    public void rule12() {
        String text = getString(97, 123, 2001);
        Product product = new Product("Some product", -10, text);
        List<ValidationException> exceptions = validator.validate(product);
        if (exceptions.size() > 0) {
            for (ValidationException valExc : exceptions) {
                checkResult(valExc.getRuleName().equals("RULE-1") || valExc.getRuleName().equals("RULE-6")
                        || valExc.getRuleName().equals("RULE-8"), "rule12");
                System.out.println(valExc.getFieldName());
                System.out.println(valExc.getDescription());
            }
        }
    }
    public void rule13() {
        String text = getString(97, 123, 2001);
        Product product = new Product(null, null, text);
        List<ValidationException> exceptions = validator.validate(product);
        if (exceptions.size() > 0) {
            for (ValidationException valExc : exceptions) {
                checkResult(valExc.getRuleName().equals("RULE-1") || valExc.getRuleName().equals("RULE-5")
                            || valExc.getRuleName().equals("RULE-8"), "rule13");
                System.out.println(valExc.getFieldName());
                System.out.println(valExc.getDescription());
            }
        }
    }

    private void checkResult(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = has PASSED");
        } else {
            System.out.println(testName + " = has FAILED");
        }
    }

    private static String getString(int from, int till, int symbolAmounts) {
        String text = "";
        for (int i = 0; i < symbolAmounts; i++) {
            int asciiCode = ThreadLocalRandom.current().nextInt(from, till);
            char symbol = (char) asciiCode;
            text = text + symbol;
        }
        return text;
    }

}
