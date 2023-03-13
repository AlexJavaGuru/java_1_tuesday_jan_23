package student_daniels_belejuns.lesson_6.level_4;

public class ForInfiniteLoop {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i = i++) {
            System.out.println(i);
        }
    }
}