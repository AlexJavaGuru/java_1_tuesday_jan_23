package student_anastasiia_bokareva.lesson13.level4;

import java.util.Random;

public class GameOfLifeRandomGenerator {

    public Integer[][] field (int i, int j){
        Random random = new Random();
        Integer[][] field = new Integer[i][j];
        for(int x = 0; x<i;x++){
            for (int y =0;y<j;y++){
                int number = random.nextInt(2);
                field[x][y]=number;
            }
        }
        return field;
    }
}
