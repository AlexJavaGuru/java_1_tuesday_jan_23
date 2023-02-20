package student_daniels_belejuns.lesson_4.level_4;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число A и B");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        Calculator calc = new Calculator();
        System.out.println("Sum: " + calc.sum(a, b));
        System.out.println("Subtraction: " + calc.subtraction(a, b));
        System.out.println("Multiplication: " + calc.multiplication(a, b));
        System.out.println("Division: " + calc.division(a, b));
        System.out.println("Remainder of the division: " + calc.mod(a, b));
        System.out.println("Exponentiation: " + calc.pow(a, b));
    }
}
