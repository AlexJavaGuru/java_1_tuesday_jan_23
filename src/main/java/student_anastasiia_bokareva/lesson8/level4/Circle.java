package student_anastasiia_bokareva.lesson8.level4;

public class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        return (Math.PI*Math.pow(radius,2));
    }
    public double calculatePerimetr(){
        return (Math.PI*radius*2);
    }
}
