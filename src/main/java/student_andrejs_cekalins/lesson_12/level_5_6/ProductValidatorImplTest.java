package student_andrejs_cekalins.lesson_12.level_5_6;

import java.util.List;

public class ProductValidatorImplTest {
   /* ProductTitleValidationRule productTitleValidationRule = new ProductTitleValidationRule();
    ProductPriceValidationRule productPriceValidationRule = new ProductPriceValidationRule();
    ProductDescriptionValidationRule productDescriptionValidationRule = new ProductDescriptionValidationRule();
    private ProductValidator productValidator = new ProductValidatorImpl(productTitleValidationRule, productPriceValidationRule,
            productDescriptionValidationRule);

    public static void main(String[] args) {
        ProductValidatorImplTest test = new ProductValidatorImplTest();
        test.ruleTitleIsEmpty_1();
        test.ruleTitleIsEmpty_2();
        test.ruleTitleLessThanThreeSymbols();
        test.ruleTitleMoreThanHundredSymbols();
        test.ruleTitleNotOnlyEnglishLetters_1();
        test.ruleTitleNotOnlyEnglishLetters_2();
        test.rulePriceIsEmpty();
        test.rulePriceIsHigherThanZero();
        test.ruleDescriptionIsLongerThanTwoThousandSymbols();
        test.ruleDescriptionNotOnlyEnglishLettersNumbers_1();
        test.ruleDescriptionNotOnlyEnglishLettersNumbers_2();

    }

    public void ruleTitleIsEmpty_1() {
        Product product = new Product(null, 2.00, "Product");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product title not null 1:");
        checkResults(validationExceptions.get(0).getRuleName().equals("TitleIsEmpty"), "Rule product title not null 1:");
        checkResults(validationExceptions.get(0).getFieldName().equals("title"), "Rule product title not null 1:");
        checkResults(validationExceptions.get(0).getDescription().equals("Title field can't be empty"), "Rule product title not null 1:");
    }

    public void ruleTitleIsEmpty_2() {
        Product product = new Product("", 2.00, "Product");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product title not null 2:");
        checkResults(validationExceptions.get(0).getRuleName().equals("TitleIsEmpty"), "Rule product title not null 2:");
        checkResults(validationExceptions.get(0).getFieldName().equals("title"), "Rule product title not null 2:");
        checkResults(validationExceptions.get(0).getDescription().equals("Title field can't be empty"), "Rule product title not null 2:");
    }

    public void ruleTitleLessThanThreeSymbols() {
        Product product = new Product("aa", 2.00, "Product");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product title less than 3 symbols:");
        checkResults(validationExceptions.get(0).getRuleName().equals("TitleTooShort"), "Rule product title less than 3 symbols:");
        checkResults(validationExceptions.get(0).getFieldName().equals("title"), "Rule product title less than 3 symbols:");
        checkResults(validationExceptions.get(0).getDescription().equals("Title length must be more than 3 symbols"), "Rule product title less than 3 symbols:");
    }

    public void ruleTitleMoreThanHundredSymbols() {
        Product product = new Product("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                2.00, "Product");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product title more than 100 symbols:");
        checkResults(validationExceptions.get(0).getRuleName().equals("TitleTooLong"), "Rule product title more than 100 symbols:");
        checkResults(validationExceptions.get(0).getFieldName().equals("title"), "Rule product title more than 100 symbols:");
        checkResults(validationExceptions.get(0).getDescription().equals("Title length can't be longer than 100 symbols"), "Rule product title more than 100 symbols:");
    }

    public void ruleTitleNotOnlyEnglishLetters_1() {
        Product product = new Product("āāāāāšššš", 2.00, "Product");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product title not in English 1:");
        checkResults(validationExceptions.get(0).getRuleName().equals("TitleEnglishAndNumbers"), "Rule product title not in English 1:");
        checkResults(validationExceptions.get(0).getFieldName().equals("title"), "Rule product title not in English 1:");
        checkResults(validationExceptions.get(0).getDescription().equals("Title can't contain any symbols accept in English letters or numbers"), "Rule product description not in English 1:");
    }

    public void ruleTitleNotOnlyEnglishLetters_2() {
        Product product = new Product("2%a!", 2.00, "Product");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product title not in English 2:");
        checkResults(validationExceptions.get(0).getRuleName().equals("TitleEnglishAndNumbers"), "Rule product title not in English 2:");
        checkResults(validationExceptions.get(0).getFieldName().equals("title"), "Rule product title not in English 2: ");
        checkResults(validationExceptions.get(0).getDescription().equals("Title can't contain any symbols accept in English letters or numbers"), "Rule product description not in English 2:");
    }

    public void rulePriceIsEmpty() {
        Product product = new Product("aaabbbaa", 0.00, "Product");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product price is empty:");
        checkResults(validationExceptions.get(0).getRuleName().equals("PriceHigherZero"), "Rule product price is empty:");
        checkResults(validationExceptions.get(0).getFieldName().equals("price"), "Rule product price is empty:");
        checkResults(validationExceptions.get(0).getDescription().equals("Price should be greater than 0"), "Rule product price is empty:");
    }

    public void rulePriceIsHigherThanZero() {
        Product product = new Product("aaaaa", -1.00, "Product");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product price greater than zero 1:");
        checkResults(validationExceptions.get(0).getRuleName().equals("PriceHigherZero"), "Rule product price greater than zero 1:");
        checkResults(validationExceptions.get(0).getFieldName().equals("price"), "Rule product price greater than zero 1:");
        checkResults(validationExceptions.get(0).getDescription().equals("Price should be greater than 0"), "Rule product price greater than zero 1:");
    }

    public void ruleDescriptionIsLongerThanTwoThousandSymbols() {
        Product product = new Product("aaaaa", 2.00, "bbbbbbbbbbbbbCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" +
                "DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDD5555555555555555555555555555555555555555555555555555555555555" +
                "888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888" +
                "9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm" +
                "ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd" +
                "tttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww" +
                "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" +
                "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz" +
                "vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv" +
                "nnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn" +
                "llllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllllll" +
                "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk" +
                "jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
                "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" +
                "ggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg" +
                "fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff" +
                "sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss" +
                "pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp" +
                "oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo" +
                "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" +
                "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" +
                "");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product description is more tha 2000 symbols:");
        checkResults(validationExceptions.get(0).getRuleName().equals("DescriptionIsLong"), "Rule product description is more tha 2000 symbols:");
        checkResults(validationExceptions.get(0).getFieldName().equals("description"), "Rule product description is more tha 2000 symbols:");
        checkResults(validationExceptions.get(0).getDescription().equals("Description can't be more than 2000 symbols"), "Rule product description is more tha 2000 symbols:");
    }

    public void ruleDescriptionNotOnlyEnglishLettersNumbers_1() {
        Product product = new Product("aaaaa", 2.00, "šššššāāāāāāā");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product description not in English and Numbers 1:");
        checkResults(validationExceptions.get(0).getRuleName().equals("DescriptionEnglishAndNumbers"), "Rule product description not in English and Numbers 1:");
        checkResults(validationExceptions.get(0).getFieldName().equals("description"), "Rule product description not in English and Numbers 1: ");
        checkResults(validationExceptions.get(0).getDescription().equals("Description can't contain any symbols accept in English letters or numbers"), "Rule product description not in English and Numbers 1:");
    }

    public void ruleDescriptionNotOnlyEnglishLettersNumbers_2() {
        Product product = new Product("aaaaa", 2.00, "2!4/3.");
        List<ValidationException> validationExceptions = productValidator.validate(product);
        checkResults(validationExceptions.size() == 3, "Rule product description not in English and Numbers 2:");
        checkResults(validationExceptions.get(0).getRuleName().equals("DescriptionEnglishAndNumbers"), "Rule product description not in English and Numbers 2:");
        checkResults(validationExceptions.get(0).getFieldName().equals("description"), "Rule product description not in English and Numbers 2: ");
        checkResults(validationExceptions.get(0).getDescription().equals("Description can't contain any symbols accept in English letters or numbers"), "Rule product description not in English and Numbers 2:");
    }

    private void checkResults(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }

    */
}
