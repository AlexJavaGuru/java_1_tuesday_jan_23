package student_vladislav_romanov.lesson_15.level_4;

import java.util.Objects;

class TennisGame3 implements TennisGame {

    private int player1score;
    private int player2score;
    private String player1Name;
    private String player2Name;

    public TennisGame3(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String result;
        if (player1score < 4 && player2score < 4 && (player1score + player2score != 6)) {
            String[] positionName = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            result = positionName[player1score];
            return (player1score == player2score) ? result + "-All" : result + "-" + positionName[player2score];
        } else {
            if (player1score == player2score)
                return "Deuce";
            result = player1score > player2score ? player1Name : player2Name;
            return ((player1score - player2score)*(player1score - player2score) == 1) ? "Advantage " + result : "Win for " + result;
        }
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, "player1"))
            this.player1score += 1;
        else
            this.player2score += 1;

    }

}
