package student_julija_raudive.lesson_12.level_3;

 class MultiCatchExample {

     public static void main(String[] args) {
         try {

         } catch (ArithmeticException a) {

         } catch (Exception a) {

         }
     }
}

//ArithmeticException наследуется от Exception. Значит, Exception уже и так ловит ArithmeticException и пытаться поймать повторно не имеет смысла.