package student_aleksandrs_lezhennikovs.lesson_4.level_3;

import java.util.Scanner;

class IncreaseDecreaseDemo {
    public static void main(String[] args) {

        IncreaseDecrease check = new IncreaseDecrease();
        System.out.println("Please input three integer numbers:");

        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        System.out.println(check.checkNumber(firstNumber, secondNumber, thirdNumber));
    }
}
