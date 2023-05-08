package student_dmitry_kupcus.lesson_7;

public class PowerCalculator {

    public int degree(int number, int degree) {
        int result = 1;
        if (degree > 0) {
            for (int i = 1; i <= degree; i++) {
                result = result * number;
            }
            return result;
        }
        return result;
    }
}

