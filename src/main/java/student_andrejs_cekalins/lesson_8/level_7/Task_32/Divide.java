package student_andrejs_cekalins.lesson_8.level_7.Task_32;



class Divide extends TwoArgumentMathOperation {

	public Divide(MathOperation leftArgument,
                  MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() / calculateRightSide();
	}
}

