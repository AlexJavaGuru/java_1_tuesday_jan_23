package student_oksana_tarasova.lesson_8.level_7.MathOperation;

class Argument extends MathOperation {
    private double argument;

    public Argument(double argument) {
        this.argument = argument;
    }

    @Override
    public double calculate() {
        return argument;
    }
}
