package student_aleksandrs_lezhennikovs.lesson_9.level_3.task_6;

import java.util.function.ToIntBiFunction;

class Task6 implements SomeFunctionalInterface {
    @Override
    public void printSomeThing() {
        System.out.println("Print this text");
    }

    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.printSomeThing();
    }

}
