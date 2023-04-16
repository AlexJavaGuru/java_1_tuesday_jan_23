package student_romualds_leitans.lesson_8.level_4;

public class Circle extends Shape{

        private double radius;

        public Circle(double radius){
            super("Circle");

            this.radius = radius;
        }

        @Override
        public  double calculateArea() {
            return Math.PI * radius * radius;
        }

        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

