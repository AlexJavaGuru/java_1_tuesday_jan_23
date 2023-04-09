package student_konstantin_kudrjavtsev.lesson_3_oop_first_look.homework.level_2_intern;

import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        String myName = "Konstantin ";
        System.out.println(myName);

        String myName2 = "Konstantin ";
        String greeting = "Hi";
        String union = myName2.concat(greeting);
        System.out.println(union + "!");

        String name = "Konstantin ";
        String work = "finisher "+1;
        String union1 = name+work;
        System.out.println(union1);
        System.out.println("Konstantin finisher #1");
        boolean b = work.equals(name);
        System.out.println(b);
        b =	name.equals(work) ;
        System.out.println(b);

        Scanner input = new Scanner(System.in);
        System.out.println("input your name: ");
        String myName3 = input.nextLine();
        System.out.printf("Name: %s  Age: %d  Height: %.2f");


    }
}
