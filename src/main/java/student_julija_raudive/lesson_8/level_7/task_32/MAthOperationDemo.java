package student_julija_raudive.lesson_8.level_7.task_32;

class MAthOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 + 20
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(20);
		MathOperation addition = new Addition(arg1, arg2);
		System.out.println("Left side Addition result = " + addition.calculate());

		// build and calculate: 50 - 20
		Argument arg3 = new Argument(50);
		Argument arg4 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg3, arg4);
		System.out.println("Right side Subtraction result = " + subtraction.calculate());

		// build and calculate: (10 + 20) + (50 - 20)
		MathOperation addition1 = new Addition(addition, subtraction);
		System.out.println("Final Addition result = " + addition1.calculate());


		Argument arg5 = new Argument(6);
		Argument arg6 = new Argument(8);
		MathOperation multiply = new Multiply(arg5, arg6);
		System.out.println("Multiply result = " + multiply.calculate());

		Argument arg7 = new Argument(10);
		Argument arg8 = new Argument(2);
		MathOperation divide = new Divide(arg7, arg8);
		System.out.println("Divide result = " + divide.calculate());


		// build and calculate: 15 + (5 - 5) * (10 / 2) + 0
		Argument arg9 = new Argument(5);
		Argument arg10 = new Argument(15);
		Argument arg11 = new Argument(0);
		MathOperation subtraction1 = new Subtraction(arg9, arg9);
		MathOperation multiply1 = new Multiply(subtraction1, divide);
		MathOperation addition2 = new Addition(arg10, multiply1);
		MathOperation result = new Addition(addition2, arg11);
		System.out.println("Final result: " + result.calculate());

	}

}
