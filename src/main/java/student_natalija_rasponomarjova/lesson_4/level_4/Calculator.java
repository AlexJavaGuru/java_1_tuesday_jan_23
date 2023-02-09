package student_natalija_rasponomarjova.lesson_4.level_4;
/*Добавьте в класс Calculator метод для определения максимального из двух целых чисел.
Добавьте в класс CalculatorTest тесты для этого метода.
Тесты должны покрывать следующие тестовые сценарии:
- первое число больше второго
- второе число больше первого
- оба числа равны
Создайте по одному тесту на каждый из сценариев!
Подсказка:
class Calculator {
    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        // реализуйте этот метод
    }
}*/
class Calculator {
    public int sum(int number1, int number2) {
        return number1 + number2;
    }

    public int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public int division(int number1, int number2) {
        return number1 / number2;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int number1, int number2) {

        if (number1 > number2) {
        }
        return number1;
    }

}