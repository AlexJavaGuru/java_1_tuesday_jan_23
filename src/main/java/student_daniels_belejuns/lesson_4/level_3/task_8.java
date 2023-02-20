package student_daniels_belejuns.lesson_4.level_3;

import java.util.Scanner;

public class task_8 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        int second = scan.nextInt();
        int third = scan.nextInt();
if(first == second && first == third){
    System.out.println("All numbers are equal");
}
else if((first == second) || (first == third) || (second == third)){
    System.out.println("All numbers are different");
}
else {
    System.out.println("Neither all are equal or different");
}


    }
}
