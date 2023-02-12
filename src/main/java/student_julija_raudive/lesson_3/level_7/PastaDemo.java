package student_julija_raudive.lesson_3.level_7;

 class PastaDemo {

     public static void main(String[] args) {

         Pasta spaghetti = new Pasta("Spaghetti", 500, 8);
         spaghetti.PastaInfo();
         spaghetti.setWeightInGrams(300);
         spaghetti.setTimeToCook(10);
         spaghetti.PastaInfo();
         spaghetti.Cook(10);

         Pasta fettuccine = new Pasta("Fettuccine", 600, 12);
         fettuccine.PastaInfo();
         fettuccine.Cook(9);
         fettuccine.Cook(30);



     }


}
