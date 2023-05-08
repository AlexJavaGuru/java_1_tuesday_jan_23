package student_andrejs_cekalins.lesson_15.level_3_4;

import java.util.Objects;

public class TennisGame1 implements TennisGame {
    private int firstPlayerScore = 0;
    private int secondPlayerScore = 0;

    public TennisGame1(String firstPlayerName, String secondPlayerName) {
    }

    @Override
    public void wonPoint(String playerName) {
        switch (playerName) {
            case "player1" -> firstPlayerScore += 1;
            default -> secondPlayerScore += 1;
        }
    }

    @Override
    public String getScore() {
        StringBuilder score = new StringBuilder();
        score = firstPlayerScore != secondPlayerScore ? playersScoreLessThanFour(score) : scoreIsDraw();
        return score.toString();
    }

    private StringBuilder playersScoreLessThanFour(StringBuilder score) {
        if (firstPlayerScore < 4 && secondPlayerScore < 4) currentScore(score);
        else score = winningPositionByHighScore();
        return score;
    }

    private StringBuilder scoreIsDraw() {
        StringBuilder score;
        score = new StringBuilder(switch (firstPlayerScore) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        });
        return score;
    }

    private StringBuilder winningPositionByHighScore() {
        StringBuilder score;
        int minusResult = firstPlayerScore - secondPlayerScore;
        switch (minusResult) {
            case -1:
                score = new StringBuilder("Advantage player2");
                break;
            default:
                score = switch (minusResult) {
                    case 1 -> new StringBuilder("Advantage player1");
                    default ->
                            minusResult >= 2 ? new StringBuilder("Win for player1") : new StringBuilder("Win for player2");
                };
                break;
        }
        return score;
    }

    private void currentScore(StringBuilder score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            switch (i) {
                case 1 -> tempScore = firstPlayerScore;
                default -> {
                    score.append("-");
                    tempScore = secondPlayerScore;
                }
            }
            switch (tempScore) {
                case 0 -> score.append("Love");
                case 1 -> score.append("Fifteen");
                case 2 -> score.append("Thirty");
                case 3 -> score.append("Forty");
            }
        }
    }
}
