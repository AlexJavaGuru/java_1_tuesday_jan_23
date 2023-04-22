package student_aleksandrs_lezhennikovs.lesson_13.level_3.services;

import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Coord;
import student_aleksandrs_lezhennikovs.lesson_13.level_3.domens.Field;

import java.util.concurrent.TimeUnit;

public class GameSetup {
    private final Integer COLUMNS = 10;
    private final Integer ROWS = 10;
    private final Integer POPULATION = 20;

    public GameSetup() {
        Coord coord = new Coord(ROWS, COLUMNS);
        Field field = new Field(coord);
//        field.getCell(new Coord(1,0)).setLive(true);
//        field.getCell(new Coord(1,1)).setLive(true);
//        field.getCell(new Coord(1,2)).setLive(true);
        field.setPopulation(POPULATION);
        field.printFieldToConsole();
        while (true) {
            field = new NextGeneration().getNextGeneration(field);
            sleepForSeconds(1);
            field.printFieldToConsole();
        }
    }

    public void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

}
