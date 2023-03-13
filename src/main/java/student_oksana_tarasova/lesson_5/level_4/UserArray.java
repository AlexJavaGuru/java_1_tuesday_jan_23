package student_oksana_tarasova.lesson_5.level_4;

import java.util.Scanner;

class UserArray {
    public static void main(String[] args) {
        UserArray userArray = new UserArray();
        int[] arrayUser = userArray.createArray();
        System.out.println(userArray.arrayFilling(arrayUser));

    }

    Scanner array = new Scanner(System.in);

    public int[] createArray() {
        System.out.println("Input length array..");
        int length = array.nextInt();
        return new int[length];
    }

    public String arrayFilling(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input " + array.length + " values cell..");
        int i = 0;
        String startSymbol = "[";
        String endSymbol = "]";
        String string = "";
        do {
            string += scanner.nextInt() + ", ";
            i++;
        }
        while (i < array.length);
        return startSymbol + string + endSymbol;
    }
}











