package student_aleksandrs_lezhennikovs.lesson_12.level_4;

class StackOverFlowTest {
    public static void main(String[] args) {
        try {
            int result = add(10);
            System.out.println(result);
        } catch (StackOverflowError e) {
            System.out.println("We are reached Stack Over Flow Error!");
        }
    }

    public static int add(int number) {
        return add(number + 10);
    }
}
