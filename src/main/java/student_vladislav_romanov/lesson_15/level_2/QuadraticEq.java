package student_vladislav_romanov.lesson_15.level_2;

class QuadraticEq {

    public String calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            return getRoot(a, b, discriminant);
        }
        else if (discriminant == 0) {
            return getRoot(a, b);
        }
        else {
            return "Equation has no roots";
        }
    }

    private String getRoot(double a, double b) {
        double x;
        x = -b / (2 * a);
        return "x = " + x;
    }

    private String getRoot(double a, double b, double discriminant) {
        double x1;
        double x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return "x1 = " + x1 + ", x2 = " + x2;
    }

}
