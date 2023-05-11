package student_anastasiia_bokareva.lesson13.level4;

import student_anastasiia_bokareva.lesson13.level3.GameOfLifeNextGenerationCalculation;

import java.lang.reflect.Array;

public class GameOfLife implements UIGameOfLife {
    private GameOfLifeNextGenerationCalculation game = new GameOfLifeNextGenerationCalculation();
    private GameOfLifeConsole console = new GameOfLifeConsole();


    public void startAGame(){
        Integer[][] gameField = console.createField();
        boolean isOver = false;
        while (isOver==false){
            gameField = game.calculate(gameField);
            isOver = isOver(gameField);
            System.out.println("                         ");
        }
    }

    private boolean isOver (Integer[][] field){
        boolean isOver = true;
        Integer[][] checkField = new Integer[field.length][field.length];
        for (int i = 0; i< field.length; i++){
            for (int j = 0; j < field.length; j++){
                checkField[i][j]=0;
            }
        }
        for (int i = 0; i< field.length; i++){
            for (int j = 0; j < field.length; j++){
                if (checkField[i][j]==field[i][j] && isOver==true){
                    isOver=true;
                } else {
                    isOver=false;
                }
            }
        }
        return isOver;
    }

    public static void main(String[] args) {
        GameOfLife game1 = new GameOfLife();
        game1.startAGame();
    }
}
