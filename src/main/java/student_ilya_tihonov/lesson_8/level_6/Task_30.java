package student_ilya_tihonov.lesson_8.level_6;

public class Task_30 {

    public static void main(String[] args) {
        printNames("John", "Mary", "Bob");
        printNames("Alice");
        printNames();
    }

    public static void printNames(String... names) {
        if (names.length == 0) {
            System.out.println("No names provided");
        } else {
            System.out.print("Names: ");
            for (String name : names) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }

}
