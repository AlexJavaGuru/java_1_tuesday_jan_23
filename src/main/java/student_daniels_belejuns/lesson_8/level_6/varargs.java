package student_daniels_belejuns.lesson_8.level_6;

public class varargs {
    public static void main(String[] args) {
        printNumbers("Numbers:", 1, 2, 3, 4, 5);
        printNumbers("More numbers:", 6, 7, 8);
        printNumbers("Single number:", 9);
    }

    public static void printNumbers(String message, int... numbers) {
        System.out.print(message);
        for (int number : numbers) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
}
