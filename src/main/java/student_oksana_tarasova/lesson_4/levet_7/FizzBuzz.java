package student_oksana_tarasova.lesson_4.levet_7;

class FizzBuzz {

    int number;

    public String detect(int number) {
        if (number % 3 == 0 & number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if  (number % 5 == 0) {
             return "Buzz";
        } else {
            return "" + number;
        }
    }
}
