package student_oksana_tarasova.lesson_10.level_3;

public class UniqueWordTest {
    public static void main(String[] args) {

        UniqueWordTest test = new UniqueWordTest();
        test.uniqueWordTest();
    }

    public void uniqueWordTest() {
        String text = "Oracle SQL Developer is a free, integrated development " +
                "environment that simplifies the development and management of";
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        int realResult = uniqueWordFinder.find(text).size();
        int expectedResult = 15;
        if (realResult == expectedResult) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}
