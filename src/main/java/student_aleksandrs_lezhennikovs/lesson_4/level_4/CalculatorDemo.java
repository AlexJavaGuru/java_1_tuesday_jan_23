package student_aleksandrs_lezhennikovs.lesson_4.level_4;

class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sumNumbers(5, 7));
        System.out.println(calculator.subtract(5, 7));
        System.out.println(calculator.multiply(5, 7));
        System.out.println(calculator.divide(5, 7));
        System.out.println(calculator.divide(10, 2));
        System.out.println(calculator.divide(10, 0));
        System.out.println(calculator.isEven(41));
        System.out.println(calculator.maxOfTwoNumbers(40, 40));
        System.out.println(calculator.maxOfThreeNumbers(40, 50, 50));
    }
}
