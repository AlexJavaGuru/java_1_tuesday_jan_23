package student_julija_raudive.lesson_4.level_3;

import java.util.Scanner;

  class Task8 {

    public static void main(String[] args) {

        System.out.println("Enter three numbers.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number one: ");
        int varA = scanner.nextInt();

        System.out.print("Number two: ");
        int varB = scanner.nextInt();

        System.out.print("Number three: ");
        int varC = scanner.nextInt();

        if  (varA == varB && varB == varC){
            System.out.println("All numbers are equal");
        }
        else if(varA != varB && varB != varC && varA != varC){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }

    }
}
