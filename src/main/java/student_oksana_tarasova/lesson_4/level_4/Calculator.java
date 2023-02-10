package student_oksana_tarasova.lesson_4.level_4;

class Calculator {


    public int sum(int a, int b) {

        return a + b;
    }

    public int difference(int a, int b) {

        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int division(int a, int b) {

        return a / b;
    }

    public boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    public int maxOfThreeNumbers(int a, int b, int c) {
        if (a >= b && a > c)
        {
            return a;
        } else if (a < b && b >= c)
        {
            return b;
        } else if (a <= c && b < c)
        {
            return c;
        } else
        {
           return a;
        }
    }
}
