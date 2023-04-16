package student_oksana_tarasova.lesson_8.level_6;

class Varargs {
    public static void main(String... args) {
        arithmeticMeanOfNumbers(2, 3, 4, 5, 2, 3, 4, 2, 3, 4, 5);
    }

    static void arithmeticMeanOfNumbers(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Arithmetic mean of numbers: " + sum / numbers.length);
    }
}
