package student_daniels_belejuns.lesson_5.level_6;


import java.util.Arrays;


class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();

    }

    public void shouldCreateArray() {
        ArrayUtil testArray = new ArrayUtil();
        int[] newArray = testArray.printArrayToConsole(9);
        int actualArraySize = newArray.length;
        if (actualArraySize == 9) {
            System.out.println("Succes");
        } else {
            System.out.println("Failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int realResult = arrayUtil.findMaxNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int expectResult = 9;
        if (realResult == expectResult) {
            System.out.println("Максимальное число: "+realResult);
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtil arrayUtil = new ArrayUtil();
        int realResult = arrayUtil.findMinNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        int expectResult = 1;
        if (realResult == expectResult) {
            System.out.println("Минимальный результат: "+realResult);
        }
        }
    }
