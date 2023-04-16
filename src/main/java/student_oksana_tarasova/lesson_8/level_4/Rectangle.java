package student_oksana_tarasova.lesson_8.level_4;

 public class Rectangle extends Shape {

     private double length;
     private double width;

     public Rectangle(String title, double length, double width) {
         super(title);
         this.length = length;
         this.width = width;
     }


     @Override
     public double calculateArea() {
         double area = length * width;
         return area;
     }

     @Override
     public double calculatePerimeter() {
         double perimeter = (length * 2) + (width * 2);
         return perimeter;
     }

     @Override
     public String toString() {
         return "Rectangle{" +
                 "length=" + length +
                 ", width=" + width +
                 "} " + super.toString();
     }
 }

