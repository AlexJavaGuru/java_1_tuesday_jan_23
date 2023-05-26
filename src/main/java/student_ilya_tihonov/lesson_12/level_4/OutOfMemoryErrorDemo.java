package student_ilya_tihonov.lesson_12.level_4;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryErrorDemo {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        try {
            while (true) {
                list.add(new Object());
            }
        } catch (OutOfMemoryError e) {
            System.out.println("An OutOfMemoryError occurred: " + e.getMessage());
        }
    }

}
