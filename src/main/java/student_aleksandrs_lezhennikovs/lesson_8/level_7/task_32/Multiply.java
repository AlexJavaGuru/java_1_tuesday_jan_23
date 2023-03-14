package student_aleksandrs_lezhennikovs.lesson_8.level_7.task_32;

class Multiply extends TwoArgumentMathOperation {

    Multiply(MathOperation leftArgument, MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }


}
