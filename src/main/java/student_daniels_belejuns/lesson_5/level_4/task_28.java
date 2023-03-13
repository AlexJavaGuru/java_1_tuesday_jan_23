package student_daniels_belejuns.lesson_5.level_4;

public class task_28 {
    public static void main(String[] args) {
        int arr[] = {1, 206, -205, 2};
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
