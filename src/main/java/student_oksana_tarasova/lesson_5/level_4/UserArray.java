package student_oksana_tarasova.lesson_5.level_4;

import java.util.Scanner;

class UserArray {
    public static void main(String[] args) {
        Scanner userArray = new Scanner(System.in);
        System.out.println("Input length array..");
        int l = userArray.nextInt();
        System.out.println("Input " + l + " values cell..");
        int[] array = new int[l];

        int i = 0;
        String str1 = "[";
        do {
            str1 += userArray.nextInt() + ", ";
            i++;
        }
        while (i < l);
        str1 += "]";

        System.out.println("Length your array = " + l);
        System.out.println("Data`s your array: " + str1);
    }
}











