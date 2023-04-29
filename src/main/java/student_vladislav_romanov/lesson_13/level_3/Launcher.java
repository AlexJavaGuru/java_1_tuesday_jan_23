package student_vladislav_romanov.lesson_13.level_3;

import java.util.concurrent.TimeUnit;

public class Launcher {

    public static void main(String[] args) {
        Launcher launcher = new Launcher();
        launcher.run();
    }

    public void run() {
        Field field = new Field(5, 4, 10);
        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.print(field);

        while(true) {
            sleepForSeconds(3);
            LifeGenerator lifeGenerator = new LifeGenerator(field);
            field.setFieldOfLife(lifeGenerator.generate());
            consoleUI.print(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

}
