package student_romualds_leitans.lesson_3.level_7;

public class Cirkle {
    double radius;
    Cirkle(double radius) {
        this.radius = radius;
    }
    void calculateArea(){
        System.out.println(radius * radius * Math.PI);
    }
}
