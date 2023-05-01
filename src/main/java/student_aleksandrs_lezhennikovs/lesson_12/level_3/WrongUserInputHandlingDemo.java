package student_aleksandrs_lezhennikovs.lesson_12.level_3;

import java.util.Scanner;

class WrongUserInputHandlingDemo {
    public static void main(String[] args) throws Exception {
            inputNumber();
    }

    public static int inputNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input integer number");
        try {
            int integerNumber = input.nextInt();
        } catch (Exception e) {
            System.out.println("Please input only Integer number");
        }
        return inputNumber();
    }
}

