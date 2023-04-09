package student_aleksandrs_lezhennikovs.lesson_9.level_4.task_11;

import java.util.Scanner;

class ConsoleUI {

    double userInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your number to convert to different Temperatures format");
        return input.nextDouble();
    }

    void outputToConsole(String result) {
        System.out.println("Result is: " + result);
        System.out.println();
    }
}
