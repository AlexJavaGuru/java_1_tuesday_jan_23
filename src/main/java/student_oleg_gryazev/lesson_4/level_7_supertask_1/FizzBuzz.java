package student_oleg_gryazev.lesson_4.level_7_supertask_1;

public class FizzBuzz {
    FizzBuzz() {
    }

    String detect(int number) {
        int divisionOnThree = number % 3;
        int divisionOnFive = number % 5;
        if (divisionOnThree == 0 && divisionOnFive == 0) {
            return "FizzBuzz";
        } else if (divisionOnFive == 0) {
            return "Buzz";
        } else {
            return divisionOnThree == 0 ? "Fizz" : "" + number;
        }
    }
}



