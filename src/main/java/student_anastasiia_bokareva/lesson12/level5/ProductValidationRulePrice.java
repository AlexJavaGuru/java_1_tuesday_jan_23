package student_anastasiia_bokareva.lesson12.level5;


public class ProductValidationRulePrice implements ValidationUI {
    @Override
    public void  validation (Product product) throws ValidationException {
        if (product.getProductPrice() == null){
            throw new ValidationException("Price field is empty", "price should be set","price");
        }else  if (product.getProductPrice() == 0) {
            throw new ValidationException("Price is 0", "Product can't be free","price");
        }
    }
}
