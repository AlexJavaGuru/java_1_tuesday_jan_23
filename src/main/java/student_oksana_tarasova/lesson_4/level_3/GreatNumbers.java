package student_oksana_tarasova.lesson_4.level_3;

import java.util.Scanner;

class GreatNumbers {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.println("Enter three numbers...");
        GreatNumbers.numberGreat(num.nextInt(), num.nextInt(), num.nextInt());
    }

    static void numberGreat(int var1, int var2, int var3) {

        if (var1 >= var2 && var1 > var3) {
            System.out.println(var1);
        } else if (var1 < var2 && var2 >= var3) {
            System.out.println(var2);
        } else if (var1 <= var3 && var2 < var3) {
            System.out.println(var3);
        } else {
            System.out.println(var1);
        }
    }
}
