package student_andrejs_cekalins.lesson_11.level_2.Task_13;

public class ClassX {
    public ClassX(int i) {
        System.out.println(1);
    }
}

class ClassY extends ClassX {
    public ClassY() {
        super(1);
        System.out.println(2);
    }
}
