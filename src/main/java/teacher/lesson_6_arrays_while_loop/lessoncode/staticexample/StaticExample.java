package teacher.lesson_6_arrays_while_loop.lessoncode.staticexample;

public class StaticExample {

    public static void main(String[] args) {
        testOne();
        StaticExample staticExample = new StaticExample();
        int result = staticExample.sum(10, 5);
    }

    public static void testOne() {

    }

    public int sum(int a, int b) {
        return a + b;
    }
}
