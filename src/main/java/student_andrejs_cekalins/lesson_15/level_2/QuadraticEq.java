package student_andrejs_cekalins.lesson_15.level_2;

public class QuadraticEq {
    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return discriminantGreaterThanZero(a, b, discriminant);
        } else if (discriminant == 0) {
            return discriminantEqualsThanZero(a, b);
        } else {
            return discriminantLessThanZero();
        }
    }

    private String discriminantGreaterThanZero(double a, double b, double discriminant) {
        double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

    private String discriminantEqualsThanZero(double a, double b) {
        double x = -b / (2 * a);
        return "x = " + x;
    }

    private String discriminantLessThanZero() {
        return "Equation has no roots";
    }
}
