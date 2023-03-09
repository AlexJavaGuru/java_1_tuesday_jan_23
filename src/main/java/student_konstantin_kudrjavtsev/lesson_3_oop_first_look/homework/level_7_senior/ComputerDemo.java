package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_7_senior;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer apple = new Computer("Apple", "MacBook Pro");
        String manufacturer = apple.getManufacturer();
        String model = apple.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
    }
}