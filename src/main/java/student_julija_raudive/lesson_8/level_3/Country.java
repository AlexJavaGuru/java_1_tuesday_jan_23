package student_julija_raudive.lesson_8.level_3;

abstract class Country {
     public abstract void capital(String capital);
}

class Italy extends Country {

     @Override
     public void capital(String capital) {
          System.out.println("The capital is " + capital);
     }
}

class Spain extends Country{

     @Override
     public void capital(String capital) {
          System.out.println("The capital of this country is " + capital);
     }
}