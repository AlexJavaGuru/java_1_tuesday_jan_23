package student_daniels_belejuns.lesson_8.level_7;

class Multiply extends TwoArgumentMathOperation {

    public Multiply(MathOperation leftArgument,
                    MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    public double calculate() {
        return calculateLeftSide() * calculateRightSide();
    }
}
