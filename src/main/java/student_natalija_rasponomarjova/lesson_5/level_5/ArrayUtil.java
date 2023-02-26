package student_natalija_rasponomarjova.lesson_5.level_5;
import java.util.Random;

class ArrayUtil {

    public int[] createArray(int arrayLength) {
        int[] newArray = new int[arrayLength];
        return newArray;
    }

    public void fillArrayWithRandomNumbers(int[] newArray) {
        Random random = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = random.nextInt();
        }
    }
}

