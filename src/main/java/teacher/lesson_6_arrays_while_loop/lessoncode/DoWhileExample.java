package teacher.lesson_6_arrays_while_loop.lessoncode;

public class DoWhileExample {

    public static void main(String[] args) {
        String[] strings = {"Hello", "My Name Is", "Alex"};
        for (int i = 0; i < strings.length; i++) {
//            System.out.println(strings[i]);
        }

        //do while
        int i = 2;
        do {
            System.out.println(strings[i]);
            i++;
        } while (i < strings.length);


    }
}
