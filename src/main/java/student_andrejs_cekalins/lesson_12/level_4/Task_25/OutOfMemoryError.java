package student_andrejs_cekalins.lesson_12.level_4.Task_25;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {
    List<String> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        Integer[] array = new Integer[100000 * 1000000];

    }

}
