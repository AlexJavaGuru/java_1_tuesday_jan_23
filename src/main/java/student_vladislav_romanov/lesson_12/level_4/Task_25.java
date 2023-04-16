package student_vladislav_romanov.lesson_12.level_4;

import java.util.ArrayList;

class Task_25 {

    public static void main(String[] args) {
        ArrayList<byte[]> list = new ArrayList<>();
        while (true) {
            byte[] byteArray = new byte[1048576];
            list.add(byteArray);
        }
    }

}
