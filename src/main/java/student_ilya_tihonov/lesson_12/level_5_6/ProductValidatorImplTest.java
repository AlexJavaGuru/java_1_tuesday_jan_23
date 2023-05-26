package student_ilya_tihonov.lesson_12.level_5_6;

import java.util.List;

public class ProductValidatorImplTest {

    ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule productPriceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule productDescriptionValidationRule = new ProductDescriptionValidationRule();


    private ProductValidator validator = new ProductValidatorImpl(productTitleValidationRule,
            productPriceValidationRule, productDescriptionValidationRule);


    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.ruleTitleIsEmpty_1();
        test.ruleTitleIsEmpty_2();
        test.ruleTitleLessThanThreeSymbols();
        test.ruleTitleMoreThanHundredSymbols();
        test.ruleTitleNotOnlyEnglishLetters();
        test.rulePriceIsHigherThanZero();
        test.ruleDescriptionIsLongerThanTwoThousandSymbols();
        test.ruleDescriptionOnlyEnglishLettersNumbers();
    }

    public void ruleTitleIsEmpty_1() {
        Product product = new Product(null, 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void ruleTitleIsEmpty_2() {
        Product product = new Product("", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule1");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-1"), "rule1");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule1");
        checkResults(exceptions.get(0).getDescription().equals("Title can not be empty"), "rule1");
    }

    public void ruleTitleLessThanThreeSymbols() {
        Product product = new Product("RT", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule2");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-2"), "rule2");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule2");
        checkResults(exceptions.get(0).getDescription().equals("Must not be shorter than 3 characters"), "rule2");
    }

    public void ruleTitleMoreThanHundredSymbols() {
        Product product = new Product("rdctfvygbuhnijmoksvdfojmmmmmomjsdvvvvvvvv" +
                "acskubjyhscabkcccccccccccccccccssssssssssssssssssssssssdddddddddddddddddddddddddddddd" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule3");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-3"), "rule3");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule3");
        checkResults(exceptions.get(0).getDescription().equals("Should not be longer than 100 characters"), "rule3");
    }

    public void ruleTitleNotOnlyEnglishLetters() {
        Product product = new Product("шкаовыцть!()Э", 1, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule4");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-4"), "rule4");
        checkResults(exceptions.get(0).getFieldName().equals("title"), "rule4");
        checkResults(exceptions.get(0).getDescription().equals("It should only contain English letters and numbers," +
                " other symbols are not allowed"), "rule4");
    }

    public void rulePriceIsHigherThanZero() {
        Product product = new Product("Orange2", null, "description");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule5");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-5"), "rule5");
        checkResults(exceptions.get(0).getFieldName().equals("price"), "rule5");
        checkResults(exceptions.get(0).getDescription().equals("Set price above zero"), "rule5");
    }


    public void ruleDescriptionIsLongerThanTwoThousandSymbols() {
        Product product = new Product("Orange", 1,
                "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                        "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz\n" + "\n" + "zzzzzzz");
        List<ValidationException> exceptions = validator.validate(product);
        checkResults(exceptions.size() == 1, "rule7");
        checkResults(exceptions.get(0).getRuleName().equals("RULE-7"), "rule7");
        checkResults(exceptions.get(0).getFieldName().equals("description"), "rule7");
        checkResults(exceptions.get(0).getDescription().equals("Must not be longer than 2000 characters"), "rule7");
    }

    public void ruleDescriptionOnlyEnglishLettersNumbers() {
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
