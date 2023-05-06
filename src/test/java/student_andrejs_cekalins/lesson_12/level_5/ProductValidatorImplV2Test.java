package student_andrejs_cekalins.lesson_12.level_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student_andrejs_cekalins.lesson_12.level_5_6.*;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class ProductValidatorImplV2Test {
    ProductValidator productValidator;
    Product product;

    @BeforeEach
    void setUp() {
        productValidator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(),
                new ProductDescriptionValidationRule());
        product = new Product("abc123", 2.22, "CCC");
    }

    @Test
    void ruleTitleIsEmpty_1() throws ValidationException {
        product.setTitle(null);
        List<ValidationException> expected = List.of(new ValidationException("TitleIsEmpty", "Title field can't be empty", "title"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);

    }

    @Test
    void ruleTitleIsEmpty_2() throws ValidationException {
        product.setTitle("");
        List<ValidationException> expected = List.of(new ValidationException("TitleIsEmpty", "Title field can't be empty", "title"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);

    }

    @Test
    void ruleTitleLessThanThreeSymbols() throws ValidationException {
        product.setTitle("aa");
        List<ValidationException> expected = List.of(new ValidationException("TitleTooShort", "Title length must be more than 3 symbols", "title"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void ruleTitleMoreThanHundredSymbols() throws ValidationException {
        product.setTitle("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" +
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        List<ValidationException> expected = List.of(new ValidationException("TitleTooLong", "Title length can't be longer than 100 symbols", "title"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void ruleTitleNotOnlyEnglishLetters_1() throws ValidationException {
        product.setTitle("šššššššsš");
        List<ValidationException> expected = List.of(new ValidationException("TitleEnglishAndNumbers", "Title can't contain any symbols accept in English letters or numbers",
                "title"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void ruleTitleNotOnlyEnglishLetters_2() throws ValidationException {
        product.setTitle("!2&%43");
        List<ValidationException> expected = List.of(new ValidationException("TitleEnglishAndNumbers", "Title can't contain any symbols accept in English letters or numbers",
                "title"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void titleAllRules() throws ValidationException {
        List<ValidationException> expected = new ArrayList<>();
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void rulePriceIsEmpty_1() throws ValidationException {
        product.setPrice(0.00);
        List<ValidationException> expected = List.of(new ValidationException("PriceHigherZero", "Price should be greater than 0",
                "price"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void rulePriceIsEmpty_2() throws ValidationException {
        product.setPrice(-1.00);
        List<ValidationException> expected = List.of(new ValidationException("PriceHigherZero", "Price should be greater than 0",
                "price"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void priceAllRules() throws ValidationException {
        List<ValidationException> expected = new ArrayList<>();
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void ruleDescriptionIsLongerThanTwoThousandSymbols() throws ValidationException {
        product.setDescription("bbbbbbbbbbbbbCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC" +
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
                "uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu");
        List<ValidationException> expected = List.of(new ValidationException("DescriptionIsLong", "Description can't be more than 2000 symbols", "description"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void ruleDescriptionNotOnlyEnglishLettersNumbers_1() throws ValidationException {
        product.setDescription("āāāččččssssdddž");
        List<ValidationException> expected = List.of(new ValidationException("DescriptionEnglishAndNumbers",
                "Description can't contain any symbols accept in English letters or numbers", "description"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }
    @Test
    void ruleDescriptionNotOnlyEnglishLettersNumbers_2() throws ValidationException {
        product.setDescription("avsbsdmdmm! #555");
        List<ValidationException> expected = List.of(new ValidationException("DescriptionEnglishAndNumbers",
                "Description can't contain any symbols accept in English letters or numbers", "description"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }
    @Test
    void descriptionAllRules() throws ValidationException {
        List<ValidationException> expected = new ArrayList<>();
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }}