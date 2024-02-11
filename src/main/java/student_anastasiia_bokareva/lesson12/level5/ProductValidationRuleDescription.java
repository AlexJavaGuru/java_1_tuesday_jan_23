package student_anastasiia_bokareva.lesson12.level5;

public class ProductValidationRuleDescription implements ValidationUI{
    @Override
    public void validation(Product product) throws ValidationException {
        char[] check = product.getProductDescription().toCharArray();
        if (check.length>2000){
            throw new ValidationException("Product description is big",
                    "Product description should have less than 2000 char", "description");
        } else if (!product.getProductDescription().matches("[\\d\\p{L}| ]+")){
            throw  new ValidationException("Product description has unacceptable sign",
                    " Product description should be written only in English and can have numbers",
                    "description");
        }

    }
}
