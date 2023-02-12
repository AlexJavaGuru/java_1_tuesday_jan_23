package teacher.lesson_4_if_statement.lessoncode;

public class IfExample {

    public static void main(String[] args) {
        boolean flag = false;

        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        int x = 10;
        if (x > 10) {
            System.out.println("x > 10");
        } else if (x < 10) {
            System.out.println("x < 10");
        } else {
            System.out.println("x = 10");
        }
//        if (x > 10) {
//            System.out.print("x > 10");
//        }
//        if (x < 10) {
//            System.out.print("x < 10");
//        }
//        if (x == 10) {
//            System.out.print("x == 10");
//        }
    }
}
