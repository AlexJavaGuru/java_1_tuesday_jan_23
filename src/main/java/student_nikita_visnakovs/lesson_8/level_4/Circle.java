package student_nikita_visnakovs.lesson_8.level_4;

class Circle extends Shape {

    private double radius;

    Circle(String title, double radius){
        super(title);
        this.radius = radius;

    }


    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return Math.PI * 2 * radius;
    }
}
