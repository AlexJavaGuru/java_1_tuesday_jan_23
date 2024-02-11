package student_anastasiia_bokareva.lesson13.level3;

import java.util.Arrays;

public class GameOfLifeNextGenerationCalculation {

    //    public Boolean[][] calculate(Boolean[][] currentGeneration) {
//        Boolean[][] nextGeneration = copy(currentGeneration);
//        for (int i = 0; i < currentGeneration.length; i++) {
//            for (int j = 0; j < currentGeneration.length; j++) {
//                int counter = 0;
//                int frame = currentGeneration.length;
//                for (int x = (i - 1); x <= (i + 1); x++) {
//                    counter = counterOfNeigborsAlive(currentGeneration, x, j,frame);
//                }
//                System.out.println(counter);
//                if (currentGeneration[i][j] == true) {
//                    if (counter < 2) {
//                        nextGeneration[i][j] = false;
//                    } else if (counter == 2 || counter == 3) {
//                        nextGeneration[i][j] = true;
//                    } else if (counter > 3) {
//                        nextGeneration[i][j] = false;
//                    }
//                } else {
//                    if (counter == 3) {
//                        nextGeneration[i][j] = true;
//                    }
//                }
//            }
//        }
//        return nextGeneration;
//    }
//
//    public int counterOfNeigborsAlive(Boolean[][] currentGeneration, int x, int j, int t) {
//        int counter = 0;
//        if ((x >= 0) && (x < t)) {
//            if (((j - 1) >= 0) && ((currentGeneration[x][j - 1]) == true)) {
//                counter++;
//            }
//            if ((currentGeneration[x][j]) == true) {
//                counter++;
//            }
//            if ((j + 1 < currentGeneration.length) && ((currentGeneration[x][j + 1]) == true)) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//
//    private static Boolean[][] copy (Boolean[][] currentGeneration){
//        Boolean[][] next = new Boolean[currentGeneration.length][];
//        for (int i =0; i<currentGeneration.length;i++){
//            next[i]= Arrays.copyOf(currentGeneration[i],currentGeneration[i].length);
//        }
//        return next;
//    }
//}
    public Integer[][] calculate(Integer[][] currentGeneration) {
        Integer[][] newGeneration = copy(currentGeneration);
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration.length; j++) {
                int counter = 0;
                if (i - 1 >= 0 && j - 1 >= 0 && currentGeneration[i - 1][j - 1].equals(1)) {
                    counter++;
                }
                if (i - 1 >= 0 && j + 1 < currentGeneration.length && currentGeneration[i - 1][j + 1].equals(1)) {
                    counter++;
                }
                if (i - 1 >= 0 && currentGeneration[i - 1][j].equals(1)) {
                    counter++;
                }
                if (j - 1 >= 0 && currentGeneration[i][j - 1].equals(1)) {
                    counter++;
                }
                if (j + 1 < currentGeneration.length && currentGeneration[i][j + 1].equals(1)) {
                    counter++;
                }
                if (i + 1 < currentGeneration.length && j - 1 >= 0 && currentGeneration[i + 1][j - 1].equals(1)) {
                    counter++;
                }
                if (i + 1 < currentGeneration.length && j + 1 < currentGeneration.length && currentGeneration[i + 1][j + 1].equals(1)) {
                    counter++;
                }
                if (i + 1 < currentGeneration.length && currentGeneration[i + 1][j].equals(1)) {
                    counter++;
                }
                if (currentGeneration[i][j].equals(1)) {
                    if (counter < 2) {
                        newGeneration[i][j] = 0;
                    } else if (counter == 2 || counter == 3) {
                        newGeneration[i][j] = 1;
                    } else if (counter > 3) {
                        newGeneration[i][j] = 0;
                    }
                } else {
                    if (counter == 3) {
                        newGeneration[i][j] = 1;
                    }
                }
            }
        }
        return newGeneration;
    }


    private static Integer[][] copy(Integer[][] currentGeneration) {
        Integer[][] next = new Integer[currentGeneration.length][];
        for (int i = 0; i < currentGeneration.length; i++) {
            next[i] = Arrays.copyOf(currentGeneration[i], currentGeneration[i].length);
        }
        return next;
    }
}