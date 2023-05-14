package student_anastasiia_bokareva.lesson12.level5;

import java.util.List;

public class ProductValidationImplTest {
    ProductValidationRuleProduct product = new ProductValidationRuleProduct();
    ProductValidationRulePrice price = new ProductValidationRulePrice();
    ProductValidationRuleDescription description = new ProductValidationRuleDescription();

    private ProductValidation validation = new ProductValidationImpl(product, price, description);


    public static void main(String[] args) {
        ProductValidationImplTest test = new ProductValidationImplTest();
        test.checkRule1Price();
        test.checkRule2Price();
        test.checkRule3Price();
        test.checkRule1ProductName();
        test.checkRule2ProductName();
        test.checkRule3ProductName();
        test.checkRule4ProductName();
        test.checkRule1ProductDescription();
        test.checkRule2ProductDescription();


    }

    public void checkRule1Price() {
        Product product = new Product("Avacado", null, "fruit");
        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 1, "Price null");
    }

    public void checkRule2Price() {
        Product product = new Product("Avacado", 0, "fruit");
        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 1, "Price is 0");
    }

    public void checkRule3Price() {
        Product product = new Product("Avacado", 1209, "fruit");
        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 0, "Price is only numbers");
    }

    public void checkRule1ProductName() {
        Product product = new Product(null, 1209, "fruit");
        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 1, "Name  is empty");
    }

    public void checkRule2ProductName() {
        Product product = new Product("Yu", 1209, "fruit");
        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 1, "Name  is less than 2 char");
    }

    public void checkRule3ProductName() {
        Product product = new Product("tryeoajdnsahfklpiryshhhdksalkahdhd" +
                "hhdhdhdhdhbsgfefjsbcakshcsdgcksdckashc" +
                "kshckjqsdkcdkwhcvkshvcsjhackjshckjhasckjhsackjhwckjhsdbckjshb" +
                "cjhscscluscjsjcsljcawlejcbjlwebc", 1209, "fruit");
        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 1, "Name  is  more than 100");
    }

    public void checkRule4ProductName() {
        Product product = new Product("Avacado", 1209, "fruit");
        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 0, "Name  is  in English");
    }

    public void checkRule1ProductDescription() {
        Product product = new Product("Avacado", 1209, "fruit123fjkvbade" +
                "fjkvgbqekjfvaefjnvadfjvajedfnvoafdjnvae" +
                "nvfajfvkjfebvkerjvcajvfdsjvfhakjhvcakejhfvrcb" +
                "gaejhbvcjhbdcvshdbcvlkjshdabcvkjshdcvkjhdcvKAWSHDCVKJW" +
                "SHVDCBEKJWHBDCawjhsdbcowjuefgvcbhuehgrbdcvoaedhfncaedsftgyh" +
                "ujikmsxdrcfgvbhjnswerdfctgybhunjsftrgyhbujnimkodcfvtrgybhunjim" +
                "krdtfvgybhunjmkcftgvybhnjumktfgvyhbnjsxrcftvgbyhnujmkftvgybhunjimkh" +
                "bacvflaiwerhbfvgclarewbfgvaleirfujhbgfvlowerutghvfpqiewruthgfvbpewiq" +
                "ruhvgfpqewrihuvfgpeqorufvcpaeourcvfaeoirdfuhjvvcdfgsvfdcsfcxsagcxgfdchawegf" +
                "dcwhafcghfcxhasfcxscxcgpua9erhpaeurhvgpfqiudshgbkshfcvbskhvdcskdvcsdvcsdgsvgcvs" +
                "e3pgvfqi8u3erhfigvcerpuivgfbcheafyrvgbreivofgujq3rpehifgvucjqrehnbfp" +
                "vujaefnpbvcuhperdiucfvjhpwequrdjhfcvpqaweruhcfvpwaeiruhdvclawuirdhe" +
                "vcfiauerfdhgvpeuwrhgvpiqwrdjshkhjfghavghsdcvahgdcvagsdvcvpgiaervfp" +
                "iqgaewrpvhdfcgkaSJHFCVQEWUHRCFVKWEJHRGCFVBWEJHGRVCFGWSCVXFASDCXDsxw" +
                "hgfqwsdcxhFTQWECDXHTQFWECDXTGQWECDXFASXCHGASFXCHsqgwtfcdxtqfawcdxtg" +
                "fqecadxtfqwecsdxtfwqascxdtasfcxyfwqcveyfdsgtavwedyructgeawsudgfrcvaw" +
                "uyedgcvbawukeygvcfawuegdvcfawesgdcvasdjhgcvkawsuedgfcvasjhdegcvfawsud" +
                "fvcwetvfigcdfhjngbvksauhdfvgkfdjhbvafjdhbvjfdhabvjfhdbvjhb" +
                "dvjhbdfjhvbkajfdhbvkjhfdbvhabdfkvjhbafdjhbvolairuiefvgbjhbjl" +
                "zdhcbvldfhbvjshfdbvsajedhfbgvwerhfgbvjehdfvbjhfdvbehfrvbgearuvf" +
                "gberhvgfberuhygbvfeuryhgvbferuyvgfbervbgeorvbsldhvcbsjcvfbkjdfsh" +
                "bvkjhefbvkdsjfhzvbhdafvbaejrhfdvbejhfvgbhdjkfvgbhfjgvberhjfgvberuy" +
                "hgvfberihyfvgbefvhbgefdvuhbseduyvhbsdkfjvhbaerfgcvagdfvcuasdfgvcbuae" +
                "rhfvbreghfbvvvvvaehyrbvuehrbyvuehbfvhfdbvjhdfbvjhsdbfkvjhdbfsvjhbadfv" +
                "byegfrvfhagdvhjadsfbvkjaherfbvaekjhgveroujfvbcrefbvuerbgvfuergbverbvd" +
                "fjhbvdfhvbaerfvcaerdfruit123fjkvbadefjkvgbqekjfvaefjnvadfjvajedfnvoafdjnvae" +
                "nvfajfvkjfebvkerjvcajvfdsjvfhakjhvcakejhfvrcb" +
                "gaejhbvcjhbdcvshdbcvlkjshdabcvkjshdcvkjhdcvKAWSHDCVKJW" +
                "SHVDCBEKJWHBDCawjhsdbcowjuefgvcbhuehgrbdcvoaedhfncaedsftgyh" +
                "ujikmsxdrcfgvbhjnswerdfctgybhunjsftrgyhbujnimkodcfvtrgybhunjim" +
                "krdtfvgybhunjmkcftgvybhnjumktfgvyhbnjsxrcftvgbyhnujmkftvgybhunjimkh" +
                "bacvflaiwerhbfvgclarewbfgvaleirfujhbgfvlowerutghvfpqiewruthgfvbpewiq" +
                "ruhvgfpqewrihuvfgpeqorufvcpaeourcvfaeoirdfuhjvvcdfgsvfdcsfcxsagcxgfdchawegf" +
                "dcwhafcghfcxhasfcxscxcgpua9erhpaeurhvgpfqiudshgbkshfcvbskhvdcskdvcsdvcsdgsvgcvs" +
                "e3pgvfqi8u3erhfigvcerpuivgfbcheafyrvgbreivofgujq3rpehifgvucjqrehnbfp" +
                "vujaefnpbvcuhperdiucfvjhpwequrdjhfcvpqaweruhcfvpwaeiruhdvclawuirdhe" +
                "vcfiauerfdhgvpeuwrhgvpiqwrdjshkhjfghavghsdcvahgdcvagsdvcvpgiaervfp" +
                "iqgaewrpvhdfcgkaSJHFCVQEWUHRCFVKWEJHRGCFVBWEJHGRVCFGWSCVXFASDCXDsxw" +
                "hgfqwsdcxhFTQWECDXHTQFWECDXTGQWECDXFASXCHGASFXCHsqgwtfcdxtqfawcdxtg" +
                "fqecadxtfqwecsdxtfwqascxdtasfcxyfwqcveyfdsgtavwedyructgeawsudgfrcvaw" +
                "uyedgcvbawukeygvcfawuegdvcfawesgdcvasdjhgcvkawsuedgfcvasjhdegcvfawsud" +
                "fvcwetvfigcdfhjngbvksauhdfvgkfdjhbvafjdhbvjfdhabvjfhdbvjhb" +
                "dvjhbdfjhvbkajfdhbvkjhfdbvhabdfkvjhbafdjhbvolairuiefvgbjhbjl" +
                "zdhcbvldfhbvjshfdbvsajedhfbgvwerhfgbvjehdfvbjhfdvbehfrvbgearuvf" +
                "gberhvgfberuhygbvfeuryhgvbferuyvgfbervbgeorvbsldhvcbsjcvfbkjdfsh" +
                "bvkjhefbvkdsjfhzvbhdafvbaejrhfdvbejhfvgbhdjkfvgbhfjgvberhjfgvberuy" +
                "hgvfberihyfvgbefvhbgefdvuhbseduyvhbsdkfjvhbaerfgcvagdfvcuasdfgvcbuae" +
                "rhfvbreghfbvvvvvaehyrbvuehrbyvuehbfvhfdbvjhdfbvjhsdbfkvjhdbfsvjhbadfv" +
                "byegfrvfhagdvhjadsfbvkjaherfbvaekjhgveroujfvbcrefbvuerbgvfuergbverbvd" +
                "fjhbvdfhvbaerfvcaerd");

        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 1, "Discription is more than 2000 char");
    }

    public void checkRule2ProductDescription() {
        Product product = new Product("Avacado", 1209, "fruit123");
        List<ValidationException> exceptions = validation.validate(product);
        check(exceptions, 0, "Discription is  in English");
    }


    public void check(List<ValidationException> exceptions, int size, String testName) {
        if (exceptions.size() == size) {
            System.out.println("Test " + testName + " is Ok!");
        } else {
            System.out.println("Test " + testName + " is Fail!");
        }
    }
}
