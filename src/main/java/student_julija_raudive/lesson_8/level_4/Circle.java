package student_julija_raudive.lesson_8.level_4;

class Circle extends Shape {
    private double radius;

    Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }


}
