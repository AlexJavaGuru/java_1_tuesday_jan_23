package student_nikita_visnakovs.lesson_3.level_7;

public class Circle {

    double radius;
    double Pi = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }
    public void calculateArea(){
        System.out.println(Pi * (radius * radius));
    }
}
