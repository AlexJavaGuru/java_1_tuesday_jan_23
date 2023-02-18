package student_oksana_maksimova.lesson_3.level_7;

class Circle {

        double radius;

        Circle(double circleRadius){

            this.radius = circleRadius;

            System.out.println("Circle radius: " + circleRadius);
        }
        double calculateArea(){

            double area = Math.PI*(radius * radius);

            System.out.println("Area is:"+ area);
            return area;
        }
}
