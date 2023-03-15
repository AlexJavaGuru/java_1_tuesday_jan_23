package student_natalja_semitseva.NS_Lesson_7_Level6;


public class CreditCardTest {


    public static void main(String[] args) {
CreditCardTest creditCardTest= new CreditCardTest();
creditCardTest.cardsIdentificationTest();




}
public void cardsIdentificationTest() {
    CreditCardTest creditCardTest = new CreditCardTest();
    int cardNumber = 111222333;
   int pin = 1234;
    boolean expected = true;





    }

    public void checkResults(boolean expected, boolean result,String testName) {
        if (result==expected) {
            System.out.println(testName + " = TRUE");
        } else {
            System.out.println(testName + " = FALSE");

        }
    }
}
// Scanner conclusion = new Scanner(System.in);
//        System.out.println("Enter the amount:  ");
//        int amount1 = conclusion.nextInt();