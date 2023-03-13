package teacher.lesson_8_inheritance.homework.level_7_senior.task_32;

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
	}

}
