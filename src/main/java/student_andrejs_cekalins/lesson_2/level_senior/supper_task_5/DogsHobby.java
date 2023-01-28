package student_andrejs_cekalins.lesson_2.level_senior.supper_task_5;

import java.util.Scanner;

public class DogsHobby {
    public static void main(String[] args) {
        Scanner dog_input = new Scanner(System.in);
        Scanner age_input = new Scanner(System.in);
        Scanner dog_hobby = new Scanner(System.in);

        /*
        Please enter:
         *your dog nam
         *age
         *hobby
         * The same can be for people!
         */

        String dogName;
        System.out.print("Enter your dogs name: ");
        dogName = dog_input.next();
        System.out.print("Input dogs age: ");
        int age = age_input.nextInt();
        String dogHobby;
        System.out.print("Enter dogs hobby: ");
        dogHobby = dog_hobby.next();


// Program will print everything in one line

        System.out.print("You have a dog with the name " +dogName);
        System.out.print(", it is " +age);
        System.out.print(" years old ");
        System.out.print("and it's like to " +dogHobby);


    }

}
