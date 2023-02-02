package student_oleg_gryazev._lesson_2_allLevels;

import java.util.Scanner;
//_____________________________________________________________Task 1
class Math1 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 digits for math operation");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        System.out.println("Result of two digits adding  = " + (firstNumber + secondNumber));
        System.out.println("Result of two digits subtruction  = " + (firstNumber - secondNumber));
        System.out.println("Result of two digits multiplication  = " + (firstNumber * secondNumber));
        System.out.println("Result two digits of division = " + (firstNumber/secondNumber));
    }
}
//______________________________________________________________Task 3
 class CorrectDataTypes {
    public static void main(String[] args) {

        int numberOne = 10;
        double numberTwo = 20.0;

        System.out.println("Number 1 = " + numberOne);
        System.out.println("Number 2 = " + numberTwo);
        double sum = numberOne + numberTwo;
        System.out.println("Sum = " + sum);
    }
}
//______________________________________________________________Task 8
class Hello{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String askName = scanner.next();
        System.out.println("Hello " + askName);
    }
}
//__________________________________________________________Task
class MultiTab {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 0 to 10");
        int keyNum = scanner.nextInt();
        for (int i = 1;i < 11; i++) {
            int y = i * keyNum;
            System.out.println("Result of multiplication with entered number = " + y);
        }
    }

}