package student_oksana_tarasova.lesson_3.level_7;

class Circle {
    double radius;
    double Pi = 3.14;

    public Circle(double radius){
        this.radius = radius;

    }
    void calculateArea(){

        double calculateArea = Math.pow(radius,2) * Math.PI;
        String area = String.format("%.2f",calculateArea);
        System.out.println("Area= " + area);
    }
}
