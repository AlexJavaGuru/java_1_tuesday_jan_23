package student_anastasiia_bokareva.lesson13.level4;

import student_anastasiia_bokareva.lesson13.level3.GameOfLifeNextGenerationCalculation;

import java.util.Scanner;

public class GameOfLifeConsole implements UIGameOfLife{

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

    public void show(Integer[][] field){
        for (int i=0; i < field.length; i++){
            for (int j=0; j< field.length;j++){
                if (j==(field.length-1)){
                    System.out.println(field[i][j]+" ");
                } else {
                    System.out.println(field[i][j]+" ");
                }
            }
        }
        System.out.println("______________________________________");
    }
}
