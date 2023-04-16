package student_oksana_tarasova.lesson_8.level_7.MathOperation;

class Addition extends TwoArgumentMathOperation {
    public Addition(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() + calculateRightSide();
    }

}
