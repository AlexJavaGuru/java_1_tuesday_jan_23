package student_ilya_tihonov.lesson_4.level_4;

public class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subtractTest();
        calculatorTest.divideTest();
        calculatorTest.multiplyTest();
        calculatorTest.isEvenTest();
        calculatorTest.isFirstNumberMax();
        calculatorTest.isSecondNumberMax();
        calculatorTest.isFirstOfTreeNumbers();
        calculatorTest.isSecondOfTreeNumbers();
        calculatorTest.isThirdOfTreeNumbers();
        calculatorTest.isFirstAndSecondMax();
        calculatorTest.isSecondAndThirdMax();
        calculatorTest.isFirstAndThirdMax();
        calculatorTest.isFirstAndSecondAndThirdMax();
    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 20;
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }

    public void subtractTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 0;
        Calculator calculator = new Calculator();
        int realResult = calculator.subtract(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Subtract test = OK");
        } else {
            System.out.println("Subtract test = FAIL");
        }
    }

    public void divideTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 1;
        Calculator calculator = new Calculator();
        int realResult = calculator.divide(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Divide test = OK");
        } else {
            System.out.println("Divide test = FAIL");
        }
    }

    public void multiplyTest() {
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.multiply(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Multiply test = OK");
        } else {
            System.out.println("Multiply test = FAIL");
        }
    }


    public void isEvenTest() {
        int number = 2;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("IsEven test = OK");
        } else {
            System.out.println("IsEven test = FAIL");
        }
    }

    public void isFirstNumberMax(){
        int firstNumber = 3;
        int secondNumber = 2;
        int expectedResult =3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if(realResult==expectedResult){
            System.out.println("isFirstNumberMax test = OK");
        } else {System.out.println("isFirstNumberMax test = FAIL");}
    }
    public void isSecondNumberMax(){
        int firstNumber = 2;
        int secondNumber = 3;
        int expectedResult =3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if(realResult==expectedResult){
            System.out.println("isSecondNumberMax test = OK");
        } else {System.out.println("isSecondNumberMax test = FAIL");}
    }
    public void isFirstOfTreeNumbers(){
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 1;
        int expectResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectResult){
            System.out.println("isFirstOfTreeNumbers test = OK");
        } else {System.out.println("isFirstOfTreeNumbers test = FAIL");}
    }
    public void isSecondOfTreeNumbers(){
        int firstNumber = 2;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectResult){
            System.out.println("isSecondOfTreeNumbers test = OK");
        } else {System.out.println("isSecondOfTreeNumbers test = FAIL");}
    }
    public void isThirdOfTreeNumbers(){
        int firstNumber = 2;
        int secondNumber = 1;
        int thirdNumber = 3;
        int expectResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectResult){
            System.out.println("isThirdOfTreeNumbers test = OK");
        } else {System.out.println("isThirdOfTreeNumbers test = FAIL");}
    }
    public void isFirstAndSecondMax(){
        int firstNumber = 2;
        int secondNumber = 2;
        int thirdNumber = 1;
        int expectResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectResult){
            System.out.println("isFirstAndSecondMax test = OK");
        } else {System.out.println("isFirstAndSecondMax test = FAIL");}
    }
    public void isSecondAndThirdMax(){
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 2;
        int expectResult = 2;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectResult){
            System.out.println("isSecondAndThirdMax test = OK");
        } else {System.out.println("isSecondAndThirdMax test = FAIL");}
    }
    public void isFirstAndThirdMax(){
        int firstNumber = 3;
        int secondNumber = 2;
        int thirdNumber = 3;
        int expectResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectResult){
            System.out.println("isFirstAndThirdMax test = OK");
        } else {System.out.println("isFirstAndThirdMax test = FAIL");}
    }
    public void isFirstAndSecondAndThirdMax(){
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;
        int expectResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if(realResult == expectResult){
            System.out.println("isFirstAndSecondAndThirdMax test = OK");
        } else {System.out.println("isFirstAndSecondAndThirdMax test = FAIL");}
    }




}







