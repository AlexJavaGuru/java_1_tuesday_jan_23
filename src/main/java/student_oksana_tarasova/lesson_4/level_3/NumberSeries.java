package student_oksana_tarasova.lesson_4.level_3;

import java.util.Scanner;

class NumberSeries {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter three numbers...");
        NumberSeries.seriesNumber(num.nextInt(), num.nextInt(), num.nextInt());
    }

    static void seriesNumber(int var1, int var2, int var3) {

        if (var1 < var2 && var2 < var3) {
            System.out.println("increasing");
        } else if (var1 > var2 && var2 > var3) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
