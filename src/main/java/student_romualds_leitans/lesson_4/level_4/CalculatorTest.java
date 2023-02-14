package student_romualds_leitans.lesson_4.level_4;

class CalculatorTest {


    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.threeNumbers();
        calculatorTest.isEvenTest();
        calculatorTest.maxOfTwonumbers();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.mulTest();
        calculatorTest.divTest();
    }
    public void threeNumbers () {
        Calculator calculator = new Calculator();
        int Number1 = 1;
        int Number2 = 44;
        int Number3 = 44;
        int result = calculator.threeNumbers(Number1, Number2, Number3);
        if (Number1 > Number2 && Number1 > Number3) {
        System.out.println("The first number is greater than the others");
    }else if (Number1 < Number2 && Number2 > Number3) {
            System.out.println("The second number is greater than the others ");
        }else if (Number3 > Number1 && Number3 > Number2){
            System.out.println("The third number is greater than the others");
        }else if(Number1 == Number2 && Number1>Number3){
            System.out.println("The first two are equal and greater than the third");
        }else if(Number1 == Number2 && Number1 == Number3) {
            System.out.println("Three numbers are equal");
        }else{
            System.out.println("Other options");
        }
    }




    public void maxOfTwonumbers(){
        Calculator calculator = new Calculator();
        int firstNumber = 90;
        int secondNumber = 90;
        int result = calculator.maxOfTwoNumber(firstNumber, secondNumber);
        if(firstNumber > secondNumber){
            System.out.println("First number is greater that the second");
        } else if (firstNumber < secondNumber){
            System.out.println("Second number is greater that the first");
        }else if (firstNumber == secondNumber){
            System.out.println("First number and Second numbers are equal");
        }
    }

    public void isEvenTest(){
        Calculator calculator = new Calculator();
        int number = 9897;
        boolean realResult = calculator.isEven(number);
        if (!realResult){
            System.out.println("Not Even number");
        } else {
            System.out.println("Even number");
        }
    }

    public void sumTest(){
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 40;
        int expectedResult = 50;
        int realResult = calculator.sum(firstNumber,secondNumber);
        if (realResult == expectedResult){
            System.out.println("Sum Test is OK");
        }else {
            System.out.println("Test failed");
        }
    }
    public void subTest(){
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        int realResult = calculator.sub(firstNumber,secondNumber);
        if (realResult == expectedResult){
            System.out.println("Sub Test is OK");
        }else {
            System.out.println("Test failed");
        }
    }
    public void mulTest(){
        Calculator calculator = new Calculator();
        int firstNumber = 3;
        int secondNumber = 3;
        int expectedResult = 9;
        int realResult = calculator.mul(firstNumber,secondNumber);
        if (realResult == expectedResult){
            System.out.println("Mul Test is OK");
        }else {
            System.out.println("Test failed");
        }
    }
    public void divTest() {
        Calculator calculator = new Calculator();
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 2;
        int realResult = calculator.div(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum Test is OK");
        } else {
            System.out.println("Test failed");
        }
    }

}


