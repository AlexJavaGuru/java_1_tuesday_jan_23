package student_vladislav_romanov.lesson_3.level_7;

class Circle {

    double radius;

    Circle(double radius) {
        this.setRadius(radius);
    }

    double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    double getRadius() {
        return this.radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

}
