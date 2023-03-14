package student_aleksandrs_lezhennikovs.lesson_8.level_7.task_32;

class Divide extends TwoArgumentMathOperation {

    Divide(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        if (calculateRightSide() != 0) {
            return calculateLeftSide() / calculateRightSide();
        } else {
            return 0;
        }
    }
}
