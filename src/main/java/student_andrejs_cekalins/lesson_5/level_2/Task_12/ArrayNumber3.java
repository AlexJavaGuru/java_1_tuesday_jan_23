package student_andrejs_cekalins.lesson_5.level_2.Task_12;


import java.util.Random;

class ArrayNumber3 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100);
            System.out.println(number);
        }
    }
}
