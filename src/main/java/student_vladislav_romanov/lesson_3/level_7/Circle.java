package student_vladislav_romanov.lesson_3.level_7;

class Circle {

    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    double getRadius() {
        return radius;
    }

}
