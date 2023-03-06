package student_oleg_gryazev.lesson_6._level_3.task_12;

public class TestArrayService {

    public static void main(String[] args) {
        TestArrayService arrayService = new TestArrayService();
        arrayService.ifArrayContainsGivenNumber();
        arrayService.ifArrayContainsNoGivenNumber();
    }

    ArrayService service = new ArrayService();

    void ifArrayContainsGivenNumber() {
        int[] arr = {1, -1, 3, 45, 3};
        int numberToSearch = 3;
        boolean contains = service.contains(arr, numberToSearch);
        if (contains) {
            System.out.println("Test has passed and matches numberToSearch = " + numberToSearch);
        } else {
            System.out.println("Out of service");
        }
    }

    void ifArrayContainsNoGivenNumber() {
        int[] arr = {1, -1, 3, 45, 3};
        int numberToSearch = 100;
        boolean contains = service.contains(arr, numberToSearch);
        if (!contains) {
            System.out.println("Test has passed. Array does not have numberToSearch");
        } else {
            System.out.println("Out of service");
        }

    }
}
