package student_natalija_rasponomarjova.lesson_3.level_7;
class Circle {

    private double radius;


    public Circle (double radius) {
        this.radius = radius;
    }
    public double calculateArea() {

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("The circle area is: " + " " + area);
        return area;

    }
}
