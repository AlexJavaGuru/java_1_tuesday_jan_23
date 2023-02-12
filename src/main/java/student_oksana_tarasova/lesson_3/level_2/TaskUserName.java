package student_oksana_tarasova.lesson_3.level_2;
import java.util.Scanner;
 class TaskUserName {
    public static void main(String[] agrs) {
      System.out.print("What is your name?");
        Scanner scanner = new Scanner(System.in);
      String userName = scanner.next();
      System.out.println("Hello, " + userName + "!");
    }
}
