package student_anastasiia_bokareva.lesson12.level5;

public class ProductValidationRuleProduct implements ValidationUI{
    @Override
    public void validation(Product product) throws ValidationException {
        if (product.getProductName() == null) {
            throw new ValidationException("Product is null",
                    "Product name should be set", "name");
        } else {
            char[] check = product.getProductName().toCharArray();
            if (check.length<3) {
                throw new ValidationException("Product name is short",
                        "Product name should have more than 3 char","name");
            } else if (check.length>100){
                throw new ValidationException("Product name is big",
                        "Product name should have less than 100 char", "name");
            } else if (!product.getProductName().matches("[\\d\\p{L}| ]+")){
                throw  new ValidationException("Product name has unacceptable sign",
                        " Product name should be written only in English and can have numbers",
                        "name");
            }
        }
    }
}
