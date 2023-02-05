package student_andrejs_cekalins.lesson_3.level_5;

 class Dog {
 private String name;
 private int age;
  String color;
     Dog(String name, int age, String color) {
         this.name = name;
         this.age = age;
         this.color = color;
     }
     String getDogName() {
         return this.name;
     }
     int getDogAge() {
         return this.age;
     }
     String getDogColor(){
         return this.color;
     }
     void voice() {
         System.out.print(name);
         System.out.print(" " +age);
         System.out.println(" " +color);
     }
     void happyBirthday() {
         System.out.print("Today is dog birthday and it's become: ");
         System.out.print(age + 1);
         System.out.println(" years old");
     }
     //Task_22
     void changeColor(String color) {
         this.color = color;
     }
}
