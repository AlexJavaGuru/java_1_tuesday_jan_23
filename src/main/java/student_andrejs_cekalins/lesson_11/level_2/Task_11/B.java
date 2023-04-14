package student_andrejs_cekalins.lesson_11.level_2.Task_11;

public class B extends A{
    public B(){
        super();
        System.out.println("B");
    }

    public static void main(String[] args) {
        A b1 = new B();
        B b2 = new B();
    }
}
