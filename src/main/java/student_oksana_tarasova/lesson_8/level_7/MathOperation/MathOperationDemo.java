package student_oksana_tarasova.lesson_8.level_7.MathOperation;

public class MathOperationDemo {
    public static void main(String[] args) {
        // build and calculate: (10 + 20) + (50 - 20)
        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(20);
        Argument arg3 = new Argument(50);
        MathOperation addition = new Addition(arg1, arg2);
        MathOperation subtraction = new Subtraction(arg3, arg2);
        MathOperation addition1 = new Addition(addition, subtraction);
        System.out.println("Final Addition result = " + addition1.calculate());

        // build and calculate: 15 + (5 - 5) * (10 / 2) + 0
        Argument arg4 = new Argument(2);
        Argument arg5 = new Argument(15);
        Argument arg6 = new Argument(5);
        Argument arg7 = new Argument(0);
        MathOperation divide = new Divide(arg1, arg4);
        MathOperation subtraction1 = new Subtraction(arg6, arg6);
        MathOperation multiply = new Multiply(subtraction1, divide);
        MathOperation addition2 = new Addition(arg5, multiply);
        MathOperation addition3 = new Addition(addition2, arg7);
        System.out.println("Final result = " + addition3.calculate());

        // (10 - 5) * (20 / 5)
        MathOperation divide1 = new Divide(arg2, arg6);
        MathOperation subtraction2 = new Subtraction(arg1, arg6);
        MathOperation multiply1 = new Multiply(subtraction2, divide1);
        System.out.println("Final result = " + multiply1.calculate());
    }
}
