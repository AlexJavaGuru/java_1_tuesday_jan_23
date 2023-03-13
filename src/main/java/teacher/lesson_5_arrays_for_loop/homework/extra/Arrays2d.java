package teacher.lesson_5_arrays_for_loop.homework.extra;

public class Arrays2d {


    public static void main(String[] args) {
        int[][] field = new int[3][3];

        int counter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = counter;
                counter++;
            }
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.println(field[i][j]);
            }
        }


    }
}
