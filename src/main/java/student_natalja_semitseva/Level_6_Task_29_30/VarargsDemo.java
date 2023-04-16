package student_natalja_semitseva.Level_6_Task_29_30;

import static student_natalja_semitseva.Level_6_Task_29_30.Varargs.walk;

public class VarargsDemo {
    public static void main(String[] args) {
        Varargs varargs =new Varargs();
        varargs.toString();

        walk(1);
        walk(1, 2);
        walk(1, new int[]{4, 5});
    }
}