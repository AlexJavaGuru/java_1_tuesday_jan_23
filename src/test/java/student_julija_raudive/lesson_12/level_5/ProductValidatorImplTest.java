package student_julija_raudive.lesson_12.level_5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;

class ProductValidatorImplTest {

ProductValidatorImpl productValidator = new ProductValidatorImpl(new ProductTitleValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());

    @Test
    void productTitleValidationCorrect() {
        Product correctProduct = new Product("Book", 5, "Book");
        List<ValidationException> expected = new ArrayList<>();
        List<ValidationException> result;
        result = productValidator.validate(correctProduct);
        assertEquals(expected, result);

    }


    @Test
    void productTitleValidationIsEmpty() {
        Product emptyTitleProduct = new Product("", 5, "Book");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Title is empty", "The title field is empty!", "title"));
        List<ValidationException> result;
        result = productValidator.validate(emptyTitleProduct);
        assertEquals(expected, result);

    }

    @Test
    void productTitleValidationLengthLessThenThree() {
        Product wrongSizeProduct = new Product("Bo", 5, "Book");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Title length does not match the rules", "The title length should be longer than 3 and less than 100 characters!", "title"));
        List<ValidationException> result;
        result = productValidator.validate(wrongSizeProduct);
        assertEquals(expected, result);

    }

    @Test
    void productTitleValidationLengthMoreThanHundred() {
        Product wrongSizeProduct2 = new Product("Boooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooook", 5, "Book");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Title length does not match the rules", "The title length should be longer than 3 and less than 100 characters!", "title"));
        List<ValidationException> result;
        result = productValidator.validate(wrongSizeProduct2);
        assertEquals(expected, result);

    }

    @Test
    void productTitleValidationInvalidCharacters() {
        Product wrongCharactersProduct = new Product("Книга", 5, "Book");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Title contains invalid characters", "The title contains invalid characters!", "title"));
        List<ValidationException> result;
        result = productValidator.validate(wrongCharactersProduct);
        assertEquals(expected, result);

    }

    @Test
    void productPriceValidationIsEmpty() {
        Product product = new Product("Book",  null, "Book");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Price is empty", "The price field is empty!", "price"));
        List<ValidationException> result;
        result = productValidator.validate(product);
        assertEquals(expected, result);

    }

    @Test
    void productPriceValidationIsZero() {
        Product product = new Product("Book",  0, "Book");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Price is 0 or less", "The price 0 or less!", "price"));
        List<ValidationException> result;
        result = productValidator.validate(product);
        assertEquals(expected, result);

    }

    @Test
    void productPriceValidationIsLessThanZero() {
        Product product = new Product("Book",  -8, "Book");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Price is 0 or less", "The price 0 or less!", "price"));
        List<ValidationException> result;
        result = productValidator.validate(product);
        assertEquals(expected, result);

    }


    @Test
    void productDescriptionValidationTooLong() {
        Product product = new Product("Book", 5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Description too long", "Description is more than 100 characters!", "description"));
        List<ValidationException> result;
        result = productValidator.validate(product);
        assertEquals(expected, result);

    }

    @Test
    void productDescriptionValidationInvalidCharacters() {
        Product product = new Product("Book", 5, "РДдд");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Description contains invalid characters", "Description contains invalid characters!!", "description"));
        List<ValidationException> result;
        result = productValidator.validate(product);
        assertEquals(expected, result);

    }

    @Test
    void productValidationInvalidPriceAndDescription() {
        Product product = new Product("Book", -10, "РДдд");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Price is 0 or less", "The price 0 or less!", "price"));
        expected.add(new ValidationException("Description contains invalid characters", "Description contains invalid characters!!", "description"));
        List<ValidationException> result;
        result = productValidator.validate(product);
        assertEquals(expected, result);

    }


    @Test
    void productValidationAllFieldsIncorrect() {
        Product product = new Product("Bo", null, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        List<ValidationException> expected = new ArrayList<>();
        expected.add(new ValidationException("Title length does not match the rules", "The title length should be longer than 3 and less than 100 characters!", "title"));
        expected.add(new ValidationException("Price is empty", "The price field is empty!", "price"));
        expected.add(new ValidationException("Description too long", "Description is more than 100 characters!", "description"));
        List<ValidationException> result;
        result = productValidator.validate(product);
        assertEquals(expected, result);

    }

}