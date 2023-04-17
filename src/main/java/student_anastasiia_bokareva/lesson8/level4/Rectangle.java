package student_anastasiia_bokareva.lesson8.level4;

public class Rectangle extends Shape{
   private int sideA;
   private int sideB;

   public Rectangle(int sideA, int sideB){
       this.sideA=sideA;
       this.sideB=sideB;
   }

   public double calculateArea(){
       return (sideB*sideA);
   }
   public double calculatePerimetr(){
       return (2*(sideA+sideB));
   }
}
