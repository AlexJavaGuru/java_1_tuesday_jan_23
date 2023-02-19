package student_romualds_leitans.lesson_3.level_5;

public class DogDemo {
    public static void main(String[] args) {
        Dog rex = new Dog(" Rex ",5 ," Black, ");
        rex.voice();
        System.out.print(" Name:" + rex.name);
        System.out.print(" Age: " + rex.age);
        System.out.print(" Color:" + rex.color);
        rex.happyBirthday();
        rex.changeColor("");
    }
}


