package student_natalija_rasponomarjova.lesson_4.level_7;

/*class FizzBuzz {

    public String detect(int number) {
        // Реализуйте следующие требования:
        // - если переданное число делится на три возвращайте "Fizz"
        // - если переданное число делится на пять возвращайте "Buzz"
        // - если переданное число делится на три и на пять возвращайте "FizzBuzz"
        // - иначе возвращайте само число в виде строки (подсказка: return "" +  number)
    }
}*/
class FizzBuzz {

    private boolean isDividedBy3(int number) {
        return number % 3 == 0;
    }

    private boolean isDividedBy5(int number) {
        return number % 5 == 0;
    }
    public String detectNumber(int number) {
        if (isDividedBy3(number)) {
            return "Fizz";
        }
        if (isDividedBy5(number)) {
            return "Buzz";
        }
        if (isDividedBy3(number) && isDividedBy5(number)) {
            return "FizzBuzz";

        } else {
            return "" + number;
        }
    }
}
