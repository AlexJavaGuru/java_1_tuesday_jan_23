package student_vladislav_romanov.lesson_15.level_4;

import java.util.Objects;

class TennisGame1 implements TennisGame {

    private int player1score = 0;
    private int player2score = 0;
    private String player1Name;
    private String player2Name;

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (Objects.equals(playerName, "player1"))
            player1score += 1;
        else
            player2score += 1;
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        int tempScore;
        if (player1score == player2score) {
            score = switch (player1score) {
                case 0 -> new StringBuilder("Love-All");
                case 1 -> new StringBuilder("Fifteen-All");
                case 2 -> new StringBuilder("Thirty-All");
                default -> new StringBuilder("Deuce");
            };
        } else if (player1score >= 4 || player2score >= 4) {
            int minusResult = player1score - player2score;

            if (minusResult == 1) {
                score = new StringBuilder("Advantage player1");
            } else if (minusResult == -1) {
                score = new StringBuilder("Advantage player2");
            } else if (minusResult >= 2) {
                score = new StringBuilder("Win for player1");
            } else {
                score = new StringBuilder("Win for player2");
            }
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = player1score;
                } else {
                    score.append("-");
                    tempScore = player2score;
                }
                switch (tempScore) {
                    case 0 -> score.append("Love");
                    case 1 -> score.append("Fifteen");
                    case 2 -> score.append("Thirty");
                    case 3 -> score.append("Forty");
                    default -> score.append("-");
                }
            }
        }
        return score.toString();
    }
}
