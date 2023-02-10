package student_oksana_tarasova.lesson_4.level_3;

import java.util.Scanner;
 class ThreeNumbers {
     public static void main(String[] args) {

         Scanner num = new Scanner(System.in);
         System.out.println("Enter three numbers...");
         int var1  = num.nextInt();
         int var2 = num.nextInt();
         int var3 = num.nextInt();

         if (var1 == var2 && var2 == var3) {
             System.out.println("All numbers are equal");
         } else if (var1 != var2 && var1 != var3 && var2 != var3) {
             System.out.println("All numbers are different");
         } else {
             System.out.println("Neither all are equal or different" );
         }

     }
}
