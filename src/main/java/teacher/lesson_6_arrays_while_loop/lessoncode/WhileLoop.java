package teacher.lesson_6_arrays_while_loop.lessoncode;

public class WhileLoop {

    public static void main(String[] args) {

        String[] strings = {"Hello", "My Name Is", "Alex"};
        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
        }

        //while
        int i = 0;
        while(i < strings.length) {
            if (i == 1) {
                i++;
                continue;
            }
            System.out.println(strings[i]);
            i++;
        }
    }
}
