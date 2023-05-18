package student_aleksandrs_lezhennikovs.lesson_15.level_4;


public class TennisGame1 implements TennisGame {

    private int firstPlayerPoints = 0;
    private int secondPlayerPoints = 0;
    private String firstPlayerName;
    private String secondPlayerName;

    public TennisGame1(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals("player1")) {
            firstPlayerPoints++;
        } else {
            secondPlayerPoints++;
        }
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        if (firstPlayerPoints == secondPlayerPoints) {
            score = getScoreIfDraw();
        } else if (firstPlayerPoints >= 4 || secondPlayerPoints >= 4) {
            score = getScoreAfterPointFour();
        } else {
            ifPointsFromZeroTillTree(score);
        }
        return score.toString();
    }

    private void ifPointsFromZeroTillTree(StringBuilder score) {
        getScoreMessage(score, firstPlayerPoints);
        score.append("-");
        getScoreMessage(score, secondPlayerPoints);
    }

    private static void getScoreMessage(StringBuilder score, int tempScore) {
        switch (tempScore) {
            case 0 -> score.append("Love");
            case 1 -> score.append("Fifteen");
            case 2 -> score.append("Thirty");
            case 3 -> score.append("Forty");
        }
    }

    private StringBuilder getScoreAfterPointFour() {
        StringBuilder score;
        int difference = firstPlayerPoints - secondPlayerPoints;
        if (difference == 1) {
            score = new StringBuilder("Advantage player1");
        } else if (difference == -1) {
            score = new StringBuilder("Advantage player2");
        } else if (difference >= 2) {
            score = new StringBuilder("Win for player1");
        } else {
            score = new StringBuilder("Win for player2");
        }
        return score;
    }

    private StringBuilder getScoreIfDraw() {
        StringBuilder score;
        score = new StringBuilder(switch (firstPlayerPoints) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        });
        return score;
    }
}
