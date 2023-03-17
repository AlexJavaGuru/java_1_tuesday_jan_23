package student_natalija_rasponomarjova.lesson_7.level_5;

/*Разработать класс PowerCalculator, который реализует единственный метод
для возведения заданного числа в указанную степень. Название метода, список параметров и тип возвращаемого значения
придумайте самостоятельно согласно условию задачи. Математическую операцию реализовать с использованием цикла.
Написать тестовые сценарии для класса PowerCalculator в классе PowerCalculatorTest.
Все тестовые сценарии должны отрабатывать без ошибок.*/
class PowerCalculator {

    public int getExponentiation(int number, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = result * number;
        }
        return result;
    }

    public int power(int number, int exponent) {
        if (exponent == 1) {
            return number;
        } else {
            return number * power(number, exponent - 1);
        }
    }

    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        System.out.println(powerCalculator.getExponentiation(3, 3));
        System.out.println(powerCalculator.power(3,3));
    }
}
