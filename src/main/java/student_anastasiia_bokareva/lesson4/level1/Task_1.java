package student_anastasiia_bokareva.lesson4.level1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        if (firstNumber < 0) {
            System.out.println("Otricatelnoe");
        }else{
            System.out.println("polozitelnoe ");
        }
    }
}
