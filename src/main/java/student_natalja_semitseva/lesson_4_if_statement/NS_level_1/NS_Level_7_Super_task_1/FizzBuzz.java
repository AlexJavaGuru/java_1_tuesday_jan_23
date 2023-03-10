package student_natalja_semitseva.lesson_4_if_statement.NS_level_1.NS_Level_7_Super_task_1;

class FizzBuzz {

    public String detect(int number) {

        if (isDividedBy3(number) && isDividedBy5(number)) {
            return "FizzBuzz";
        }
        if (isDividedBy3(number)) {
            return "Fizz";
        }
        if (isDividedBy5(number)) {
            return "Buzz";
        }
        return "" + number;
    }



        private boolean isDividedBy3(int number) {
            return number % 3 == 0;
        }

        private boolean isDividedBy5(int number) {
            return number % 5 == 0;
        }
    }


