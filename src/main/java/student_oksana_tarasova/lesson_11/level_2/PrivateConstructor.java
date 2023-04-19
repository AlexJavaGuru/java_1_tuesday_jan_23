package student_oksana_tarasova.lesson_11.level_2;

 class PrivateConstructor {
     int number1;
     int number2;

    private PrivateConstructor(int number1) {
        this.number1 = number1;
    }

     public PrivateConstructor(int number1, int number2) {
         this.number1 = number1;
         this.number2 = number2;
     }
}
