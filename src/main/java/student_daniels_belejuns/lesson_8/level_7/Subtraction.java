package student_daniels_belejuns.lesson_8.level_7;



class Subtraction extends TwoArgumentMathOperation {

    public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
        super(leftArgument, rightArgument);
    }

    public double calculate() {
        return calculateLeftSide() - calculateRightSide();
    }
}