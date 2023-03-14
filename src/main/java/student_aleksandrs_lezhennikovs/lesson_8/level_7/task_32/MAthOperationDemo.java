package student_aleksandrs_lezhennikovs.lesson_8.level_7.task_32;

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

		// build and calculate: 15 + (5 - 5) * (10 / 2) + 0
		System.out.println("");
		Argument arg5 = new Argument(5);
		Argument arg6 = new Argument(5);
		Argument arg7 = new Argument(10);
		Argument arg8 = new Argument(2);
		Argument arg9 = new Argument(15);
		Argument arg10 = new Argument(0);
		MathOperation subtract = new Subtraction(arg5, arg6);
		System.out.println("Fist calculation: " + subtract.calculate());
		MathOperation divide = new Divide(arg7, arg8);
		System.out.println("Second calculation: " + divide.calculate());
		MathOperation multiply = new Multiply(subtract, divide);
		System.out.println("Third calculation: " + multiply.calculate());
		MathOperation add1 = new Addition(arg9, multiply);
		System.out.println("Fourth calculation: " + add1.calculate());
		MathOperation add2 = new Addition(add1, arg10);
		System.out.println("Final result = " + add2.calculate());
		System.out.println("");

		//(10 - 5) * (20 / 5)
		Argument argum1 = new Argument(10);
		Argument argum2 = new Argument(5);
		Argument argum3 = new Argument(20);
		MathOperation subtractMyArgum = new Subtraction(argum1, argum2);
		System.out.println("First my calculation = " + subtractMyArgum.calculate());
		MathOperation divideMyArgum = new Divide(argum3, argum2);
		System.out.println("Second my calculation = " + divideMyArgum.calculate());
		MathOperation multiplyMyArgum = new Multiply(subtractMyArgum, divideMyArgum);
		System.out.println("Last my calculation = " + multiplyMyArgum.calculate());
	}

}
