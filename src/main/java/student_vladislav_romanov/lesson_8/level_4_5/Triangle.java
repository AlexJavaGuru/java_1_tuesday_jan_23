package student_vladislav_romanov.lesson_8.level_4_5;

class Triangle extends Shape {

    private double sideA;
    private double sideB;
    private double sideC;
    private double mount;
    private double height;

    Triangle(String title, double sideA, double sideB, double sideC, double mount, double height) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.mount = mount;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * mount * height;
    }

    @Override
    double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

}
