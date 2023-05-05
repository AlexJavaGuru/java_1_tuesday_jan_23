package student_natalija_rasponomarjova.lesson_8.level_7.task_32;

class MathOperationDemo {
    public static void main(String[] args) {

        Argument arg1 = new Argument(10);
        Argument arg2 = new Argument(5);
        Argument arg3 = new Argument(20);
        Argument arg4 = new Argument(2);
        Argument arg5 = new Argument(15);
        Argument arg6 = new Argument(0);

        // build and calculate: (10 - 5) * (20 / 5)
        MathOperation subtraction = new Subtraction(arg1, arg2);
        MathOperation divide = new Divide(arg3, arg2);
        MathOperation result = new Multiply(subtraction, divide);
        System.out.println("Final result = " + result.calculate());

        // build and calculate: 15 + (5 - 5) * (10 / 2) + 0
        MathOperation subtraction1 = new Subtraction(arg2, arg2);
        MathOperation result1 = new Addition(arg5,subtraction1);
        MathOperation divide1 = new Divide(arg1,arg4);
        MathOperation result2 = new Addition(divide1,arg6);
        MathOperation finalResult = new Multiply(result1, result2);
        System.out.println("Final result = " + finalResult.calculate());
    }
}
