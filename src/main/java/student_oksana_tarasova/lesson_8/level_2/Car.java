package student_oksana_tarasova.lesson_8.level_2;

 class Car {
     private int releaseYear;

     public Car(int releaseYear) {
         this.releaseYear = releaseYear;
     }

     @Override
     public String toString() {
         return "Car{" +
                 "releaseYear=" + releaseYear +
                 '}';
     }
 }
