package student_aleksandrs_lezhennikovs.lesson_3.level_7;

class Circle {
    double radius;

    Circle() {

    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }
}
