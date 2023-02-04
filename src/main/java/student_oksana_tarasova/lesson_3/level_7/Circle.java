package student_oksana_tarasova.lesson_3.level_7;

class Circle {
    double radius;
    double Pi = 3.14;

    public Circle(){

    }
    void calculateArea(double radius){
        this.radius = radius;
        double calculateArea = Math.pow(radius,2) * Pi;
        String area = String.format("%.2f",calculateArea);
        System.out.println("Area= " + area);
    }
}
