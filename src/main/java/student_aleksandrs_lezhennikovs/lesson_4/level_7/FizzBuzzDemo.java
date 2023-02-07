package student_aleksandrs_lezhennikovs.lesson_4.level_7;

class FizzBuzzDemo {
    public static void main(String[] args) {

        FizzBuzz myTest = new FizzBuzz();
        String resultOn3and5 = myTest.detect(15);
        System.out.println("Answer " + resultOn3and5);

        String resultOn3 = myTest.detect(9);
        System.out.println("Answer " + resultOn3);

        String resultOn5 = myTest.detect(10);
        System.out.println("Answer " + resultOn5);

        String result = myTest.detect(7);
        System.out.println("Answer " + result);

        String result1 = myTest.detect(1);
        System.out.println("Answer " + result1);

        String result2 = myTest.detect(2);
        System.out.println("Answer " + result2);
    }


}
