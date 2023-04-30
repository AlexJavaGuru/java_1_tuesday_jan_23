package student_vladislav_romanov.lesson_12.level_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ProductValidatorImplTest {

    ProductValidator productValidator;
    Product product;

    @BeforeEach
    void setUp() {
        productValidator = new ProductValidatorImpl(new ProductNameValidationRule(), new ProductPriceValidationRule(), new ProductDescriptionValidationRule());
        product = new Product("Laptop", 999.99, "MSI Creator 15");
    }

    @Test
    void nameIsEmpty() throws ValidationException {
        product.setName("");
        List<ValidationException> expected = List.of(new ValidationException("nameIsEmpty", "Name cannot be empty", "name"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void nameIsTooShort() throws ValidationException {
        product.setName("pc");
        List<ValidationException> expected = List.of(new ValidationException("nameIsTooShort", "Name must have at least 3 characters", "name"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void nameIsTooLong() throws ValidationException {
        product.setName("Laptop which name is really longer than 100 symbols and it need to throws our created exception Title cannot be longer than 100 characters");
        List<ValidationException> expected = List.of(new ValidationException("nameIsTooLong", "Name cannot be longer than 100 characters", "name"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void nameContainUnallowedSymbols() throws ValidationException {
        product.setName("Laptop*");
        List<ValidationException> expected = List.of(new ValidationException("nameContainUnallowedSymbols", "Name can contain digits and latin letters only", "name"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void nameAccordsAllRules() throws ValidationException {
        List<ValidationException> expected = new ArrayList<>();
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void priceIsZero() throws ValidationException {
        product.setPrice(0);
        List<ValidationException> expected = List.of(new ValidationException("priceIsZero", "Price need to be more than 0", "price"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void priceAccordsAllRules() throws ValidationException {
        List<ValidationException> expected = new ArrayList<>();
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void descriptionIsTooLong() throws ValidationException {
        String longDescription = "At Java Software, we have several guidelines that might make our documentation comments " +
                "different than those of third party developers. Our documentation comments define the official Java " +
                "Platform API Specification. To this end, our target audience is those who write Java compatibility " +
                "tests, or conform or re-implement the Java platform, in addition to developers. We spend time and " +
                "effort focused on specifying boundary conditions, argument ranges and corner cases rather than " +
                "defining common programming terms, writing conceptual overviews, and including examples for " +
                "developers. Thus, there are commonly two different ways to write doc comments as API specifications, " +
                "or as programming guide documentation. These two targets are described in the following sections. " +
                "A staff with generous resources can afford to blend both into the same documentation properly " +
                "chunked however, our priorities dictate that we give prime focus to writing API specifications in" +
                " doc comments. This is why developers often need to turn to other documents, such as the J2SE " +
                "Documentation, Java Tutorial or the Java Class Libraries in hardback only for programming guides." +
                "At Java Software, we have several guidelines that might make our documentation comments " +
                "different than those of third party developers. Our documentation comments define the official Java " +
                "Platform API Specification. To this end, our target audience is those who write Java compatibility " +
                "tests, or conform or re-implement the Java platform, in addition to developers. We spend time and " +
                "effort focused on specifying boundary conditions, argument ranges and corner cases rather than " +
                "defining common programming terms, writing conceptual overviews, and including examples for " +
                "developers. Thus, there are commonly two different ways to write doc comments as API specifications, " +
                "or as programming guide documentation. These two targets are described in the following sections. " +
                "A staff with generous resources can afford to blend both into the same documentation properly " +
                "chunked however, our priorities dictate that we give prime focus to writing API specifications in" +
                " doc comments. This is why developers often need to turn to other documents, such as the J2SE " +
                "Documentation, Java Tutorial or the Java Class Libraries in hardback only for programming guides.";
        product.setDescription(longDescription);
        List<ValidationException> expected = List.of(new ValidationException("descriptionIsTooLong", "Description cannot be longer than 100 characters", "description"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void descriptionContainUnallowedSymbols() throws ValidationException {
        product.setDescription("*$&#^@^!^&#@");
        List<ValidationException> expected = List.of(new ValidationException("descriptionContainUnallowedSymbols", "Description can contain digits and latin letters only", "description"));
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void descriptionAccordsAllRules() throws ValidationException {
        List<ValidationException> expected = new ArrayList<>();
        List<ValidationException> current = productValidator.validate(product);
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void validationExceptionEquals() {
        ValidationException expected = new ValidationException("priceIsZero", "Price need to be more than 0", "price");
        ValidationException current = new ValidationException("priceIsZero", "Price need to be more than 0", "price");
        assertThat(expected).isEqualTo(current);
    }

    @Test
    void validationExceptionGetters() {
        ValidationException validationException = new ValidationException("priceIsZero", "Price need to be more than 0", "price");
        assertThat(validationException.getRuleName()).isEqualTo("priceIsZero");
        assertThat(validationException.getDescription()).isEqualTo("Price need to be more than 0");
        assertThat(validationException.getFieldName()).isEqualTo("price");
    }

    @Test
    void productEquals() {
        Product expected = new Product("Laptop", 999.99, "MSI Creator 15");
        assertThat(product).isEqualTo(expected);
    }

    @Test
    void productGettersAndSetters() {
        product.setName("Tablet");
        product.setPrice(799.99);
        product.setDescription("Galaxy Tab");
        assertThat(product.getName()).isEqualTo(("Tablet"));
        assertThat(product.getPrice()).isEqualTo(799.99);
        assertThat(product.getDescription()).isEqualTo(("Galaxy Tab"));
    }

}