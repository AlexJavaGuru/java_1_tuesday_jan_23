package student_anastasiia_bokareva.lesson6.level5;

public class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToeDemo toe = new TicTacToeDemo();
        toe.play();
    }
    public void play() {
      TicTacToe toe = new TicTacToe();
        int[][] field = toe.createField();
        while (true) {
            toe.printFieldToConsole(field);
            Move move0 = toe.getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            toe.printFieldToConsole(field);
            if (toe.isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (toe.isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            toe.printFieldToConsole(field);
            Move move1 = toe.getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            toe.printFieldToConsole(field);
            if (toe.isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (toe.isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
