package student_ilya_tihonov.lesson_8.level_4_5;

class Circle extends Shape{

    private double radius;

    Circle(double radius, String title) {
        super(title);
        this.radius = radius;
    }


    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    double perimeterCount() {
        return 2 * Math.PI * radius;
    }
}
