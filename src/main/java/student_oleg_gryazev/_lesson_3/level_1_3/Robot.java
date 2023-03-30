package student_oleg_gryazev._lesson_3.level_1_3;

class Robot {
     Robot() {
    }
   String name;
     Robot (String name){
         this.name = name;
           }
           int age;
           Robot(String name, int age){
         this.name = name;
         this.age = age;
           }
    public void sayHello() {
        System.out.println("Hello");
    }
    public void sayYourName() {
        System.out.println("My name is Robo");
    }

}
