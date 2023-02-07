package teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isContinue = true;
        while (isContinue) {
            System.out.println("1 - Add product");
            System.out.println("2 - Search product by ID");
            System.out.println("3 - Delete product by ID");
            System.out.println("4 - Find all products");
            System.out.println("0 - Exit");

            System.out.println("Select option...");
            int userInput = scanner.nextInt();


            switch (userInput) {
                case 1:
                    System.out.println("Type product values...");
                    break;
                case 2:
                    System.out.println("Give ID to search for");
                    break;
                case 3:
                    System.out.println("Give ID to delete");
                    break;
                case 4:
                    System.out.println("All products: ...");
                    break;
                case 0:
                    System.out.println("Exiting....");
                    isContinue = false;
                    break;
                default:
                    System.out.println("No such option");
            }
        }
    }
}
