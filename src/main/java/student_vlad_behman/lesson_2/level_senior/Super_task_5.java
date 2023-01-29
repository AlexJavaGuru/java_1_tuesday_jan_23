/*
Напишите программу и продемонстрируйте в ней использование
однострочного и многострочного коментариев.
 */



package student_vlad_behman.lesson_2.level_senior;

public class Super_task_5 {
    public static void main(String[] args) {

        String Volvocar = "VOLVO";
        String BmwCar = "BWM";

        System.out.println("This is my car : " + Volvocar); // this is one line comments in code!

        BmwCar = new String("ALFA");
        /*
        This is multiline comments...there i can write information about my code:There i put new
        variable.I replace from "BMW" to "ALFA" :))
         */
        System.out.println("This is my second new car: " + BmwCar);

    }
}
