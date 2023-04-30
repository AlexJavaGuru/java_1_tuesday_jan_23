package student_julija_raudive.lesson_9.level_7.task_25;

import java.util.Scanner;

class StringOperationsDemo {

     public static void main(String[] args) {

         StringOperations stringOperations = new StringOperations(new ToLowerCaseString());
         System.out.println("Enter a word: ");
         Scanner scanner = new Scanner(System.in);
         String word = scanner.nextLine();
         System.out.println("To lower case: " + stringOperations.changeString(word));

         StringOperations stringOperations2 = new StringOperations(new ToUpperCaseString());
         System.out.println("Enter a word: ");
         word = scanner.nextLine();
         System.out.println("To upper case: " + stringOperations2.changeString(word));
     }
}
