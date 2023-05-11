package student_anastasiia_bokareva.lesson13.level4;

import student_anastasiia_bokareva.lesson13.level3.GameOfLifeNextGenerationCalculation;

import java.util.Scanner;

public class GameOfLifeConsole {

    private GameOfLifeRandomGenerator random = new GameOfLifeRandomGenerator();

    public Integer[][] createField(){
        int i = indexSet();
        int j = indexSet();
        Integer[][] gameField = random.field(i,j);
        return gameField;
    }

    private int indexSet(){
        System.out.print("Please write index -");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i;
    }
}
