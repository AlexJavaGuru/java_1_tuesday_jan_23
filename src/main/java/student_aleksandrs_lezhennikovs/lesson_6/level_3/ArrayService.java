package student_aleksandrs_lezhennikovs.lesson_6.level_3;

public class ArrayService {

    boolean isNumberInArray(int[] intArray, int findNumber) {

        for(int number : intArray) {
            if(findNumber == number) {
                return true;
            }
        }
        return false;
    }
}
