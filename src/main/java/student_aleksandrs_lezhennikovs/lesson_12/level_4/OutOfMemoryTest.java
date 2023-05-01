package student_aleksandrs_lezhennikovs.lesson_12.level_4;

import java.util.ArrayList;
import java.util.List;

class OutOfMemoryTest {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        while (true) {
            try {
                myList.add(10000);
            } catch (OutOfMemoryError e) {
                System.out.println("We are reached Out of memory! ");
            }
        }
    }
}
