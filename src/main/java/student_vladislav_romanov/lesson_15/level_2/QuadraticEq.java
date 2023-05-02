package student_vladislav_romanov.lesson_15.level_2;

class QuadraticEq {

    public void calc(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            System.out.println(getRoot(a, b, discriminant));
        }
        else if (discriminant == 0) {
            System.out.println(getRoot(a, b));
        }
        else {
            System.out.println("Equation has no roots");
        }
    }

    String getRoot(double a, double b) {
        double x;
        x = -b / (2 * a);
        return ("x = " + x);
    }

    String getRoot(double a, double b, double discriminant) {
        double x1;
        double x2;
        x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
        return ("x1 = " + x1 + ", x2 = " + x2);
    }

}
