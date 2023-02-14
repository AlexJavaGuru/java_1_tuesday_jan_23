package student_ilya_tihonov.lesson_3.level_2;

import java.util.Scanner;

public class Task_9 {
    public  static  void main(String[] args){

        System.out.println("Enter your name");
        Scanner userName = new Scanner(System.in);
        String yourName = userName.nextLine();
        System.out.println("Hello " + yourName + "!");

    }
}
