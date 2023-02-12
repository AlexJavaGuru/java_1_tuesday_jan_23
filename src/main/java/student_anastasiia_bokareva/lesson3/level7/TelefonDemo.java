package student_anastasiia_bokareva.lesson3.level7;

import java.util.Scanner;

public class TelefonDemo {
    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);
        Telefon samsung = new Telefon("dc-1232", 22376850);
        samsung.call();
        samsung.sendMessage();
        message=scan.next();


    }
}
