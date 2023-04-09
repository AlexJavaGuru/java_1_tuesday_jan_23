package student_aleksandrs_lezhennikovs.lesson_10.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

class ListWithDublicats {
    public static void main(String[] args) {
        List<String> list = new  ArrayList<>();
        list.add("abc");
        list.add("abc");
        for (String element : list) {
            System.out.println(element);
        }
    }

}
