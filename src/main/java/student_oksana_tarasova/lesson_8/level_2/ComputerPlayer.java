package student_oksana_tarasova.lesson_8.level_2;

 class ComputerPlayer extends Player {

     int age;


     ComputerPlayer(String name, int age) {
         super(name);
         this.age = age;
     }

     @Override
     public String toString() {
         return "ComputerPlayer{" +
                 "age=" + age +
                 "} " + super.toString();
     }
 }
