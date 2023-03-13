package student_vladislav_romanov.lesson_8.level_7;

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

