package student_daniels_belejuns.lesson_8.level_7;

class Addition extends TwoArgumentMathOperation {

    public Addition(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    public double calculate() {
        return calculateLeftSide() + calculateRightSide();
    }
}
