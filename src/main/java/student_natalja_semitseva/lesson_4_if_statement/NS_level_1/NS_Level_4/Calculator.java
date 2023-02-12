package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_4;

public class Calculator {

    public int sum(int firstNumberA, int secondNumberB) {
        return firstNumberA + secondNumberB;
    }

    public int mul(int firstNumberA, int secondNumberB) {
        return firstNumberA * secondNumberB;

    }

    public int subtract(int firstNumberA, int secondNumberB) {
        return firstNumberA - secondNumberB;


    }

    public int divide(int firstNumberA, int secondNumberB) {
        return firstNumberA / secondNumberB;

    }

    boolean isEven1(int value) {
        if (value % 2 == 0) {
            return true;
        }
        return false;


    }

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;

    }


}
