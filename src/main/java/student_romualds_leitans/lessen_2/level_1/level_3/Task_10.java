package student_romualds_leitans.lessen_2.level_1.level_3;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Test data:");
        System.out.print("Radius = ");
        double radius = scanner.nextDouble();
        System.out.println("Expected Output");
        System.out.println("Perimeter is = " + (2 * Math.PI * radius));
        System.out.println("Area is = " + (Math.PI * Math.pow(radius, 2)));
        }
    }

