package student_oksana_tarasova.lesson_8.level_7.MathOperation;

class Subtraction extends TwoArgumentMathOperation {
    public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() - calculateRightSide();
    }
}
