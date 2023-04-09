package student_oksana_tarasova.lesson_8.level_7.MathOperation;

abstract class TwoArgumentMathOperation extends MathOperation {
    private MathOperation leftArgument;
    private MathOperation rightArgument;

    public TwoArgumentMathOperation(MathOperation leftArgument,
                                    MathOperation rightArgument) {
        this.leftArgument = leftArgument;
        this.rightArgument = rightArgument;
    }

    protected double calculateLeftSide() {
        return leftArgument.calculate();
    }

    protected double calculateRightSide() {
        return rightArgument.calculate();
    }
}
