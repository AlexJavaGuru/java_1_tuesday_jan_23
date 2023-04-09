package student_natalja_semitseva.level_1;


public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest utils = new NumberUtilsTest();
        utils.isEven();
        utils.isOdd();

    }
    public void isEven() {
        NumberUtils utils = new NumberUtils();
        int number = 8;
        boolean realResult = utils.isEven(number);
        if (realResult) {
            System.out.println("Test isEven = Even");
        } else {
            System.out.println("Test isEven = ODD");
        }
    }
        public void isOdd() {
            NumberUtils utils = new NumberUtils();
            int number = 9;
            boolean realResult = utils.isEven(number);
            if (realResult) {
                System.out.println("Test isOdd = Even");
            } else {
                System.out.println("Test isOdd = ODD");
            }
        }
}
