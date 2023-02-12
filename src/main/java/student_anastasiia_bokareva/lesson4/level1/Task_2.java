package student_anastasiia_bokareva.lesson4.level1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        if (firstNumber < 0) {
            System.out.println("Otricatelnoe");
        }else{
            if (firstNumber == 0) {
                System.out.println("Equal 0 ");
            }else {
            System.out.println("polozitelnoe ");
        }
    }
}
}
