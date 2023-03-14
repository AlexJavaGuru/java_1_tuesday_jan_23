package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_7_senior;

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    double setRadius(double radius) {
        return this.radius = radius;
    }

    double calculateArea(double radius) {
        double area = Math.PI * (radius * radius);
        return area;
    }
}

