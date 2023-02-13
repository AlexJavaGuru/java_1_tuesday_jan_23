package student_julija_raudive.lesson_4.level_2;

import java.util.Scanner;

 class Task7 {
    public static void main(String[] args) {

        System.out.println("Enter two numbers.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number one:");
        int varA = scanner.nextInt();

        System.out.println("Number two:");
        int varB = scanner.nextInt();

        if  (varA == varB){
            System.out.println("Numbers are equals.");
        }
        else{
            System.out.println("Numbers are different.");
        }
    }
}
