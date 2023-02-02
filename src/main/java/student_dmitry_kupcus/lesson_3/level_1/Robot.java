package student_dmitry_kupcus.lesson_3.level_1;

class Robot {

     String name;

     public Robot (String robotName) {

         name = robotName;
     }

     public static void sayHello() {
         System.out.println("Hello");
     }
     public void sayYourName() {
         System.out.println("My name is " + this.name);
     }
 }

