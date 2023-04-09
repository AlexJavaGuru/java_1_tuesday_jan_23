package student_vladislav_romanov.lesson_8.level_7;

class MathOperationDemo {

	public static void main(String[] args) {
		// build and calculate: 10 - 5
		Argument arg1 = new Argument(10);
		Argument arg2 = new Argument(5);
		MathOperation subtraction = new Subtraction(arg1, arg2);
		System.out.println("Left side Substraction result = " + subtraction.calculate());

		// build and calculate: 20 / 5
		Argument arg3 = new Argument(20);
		Argument arg4 = new Argument(5);
		MathOperation divide = new Divide(arg3, arg4);
		System.out.println("Right side Divide result = " + divide.calculate());

		// build and calculate: (10 - 5) * (20 / 5)
		MathOperation multiply = new Multiply(subtraction, divide);
		System.out.println("Final Multiply result = " + multiply.calculate());
	}

}
