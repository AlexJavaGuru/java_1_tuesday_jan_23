package student_aleksandrs_lezhennikovs.lesson_5.level_2.tests;

import java.util.Scanner;

class Experement {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Input three elements to array:");

            //int[] numbers = new int[3];
            //numbers[0] = input.nextInt();
            //numbers[1] = input.nextInt();
            //numbers[2] = input.nextInt();

        //System.out.println("Your array: " + Arrays.toString(numbers));

        UserInputArray myArray = new UserInputArray();
        myArray.setArrayForNumbers(0, input.nextInt());
        myArray.setArrayForNumbers(1, input.nextInt());
        myArray.setArrayForNumbers(2, input.nextInt());
    }
}
