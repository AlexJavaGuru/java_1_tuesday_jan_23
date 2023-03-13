package student_daniels_belejuns.lesson_6.level_4;

import java.io.StringWriter;

public class WhileLoopContinue {
    public static void main(String[]args){
        int i = 0;

        while(i < 100) {
            if(i == 5) break;
           System.out.println("i: " + i + "\n");
            i++;
        }
        System.out.println("Цикл завершён");
    }
}
