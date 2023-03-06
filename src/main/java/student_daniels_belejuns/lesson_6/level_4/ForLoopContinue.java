package student_daniels_belejuns.lesson_6.level_4;

public class ForLoopContinue {
    public static void main(String[]args){
        for(int i = 0; i < 100; i++) {
            if(i == 5) break; // выходим из цикла, если i равно 5
            System.out.println("i: " + i + "\n");
        }
        System.out.println("Цикл завершён");
    }
}
