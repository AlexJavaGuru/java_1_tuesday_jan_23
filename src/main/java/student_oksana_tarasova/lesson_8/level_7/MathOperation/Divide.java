package student_oksana_tarasova.lesson_8.level_7.MathOperation;

public class Divide extends TwoArgumentMathOperation {
    public Divide(MathOperation leftArgument,
                  MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    @Override
    public double calculate() {
        return calculateLeftSide() / calculateRightSide();
    }
}
