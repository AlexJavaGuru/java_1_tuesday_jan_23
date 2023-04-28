package student_aleksandrs_lezhennikovs.lesson_15.level_4;

public class TennisGame2 implements TennisGame {
    private Player firstPlayer;
    private Player secondPlayer;

    public TennisGame2(String firstPlayerName, String secondPlayerName) {
        this.firstPlayer = new Player(firstPlayerName);
        this.secondPlayer = new Player(secondPlayerName);
    }

    private int firstPlayerPoint = 0;
    private int secondPlayerPoint = 0;

    public String getScore() {
        String score = "";
        if (isPlayersTied()) {
            score = getTiedScore();
        } else if (isDeuce()) {
            score = "Deuce";
        }

        if (firstPlayerPoint > 0 && secondPlayerPoint == 0) {
            score = transferPoints(firstPlayerPoint) + "-Love";
        } else if (secondPlayerPoint > 0 && firstPlayerPoint == 0) {
            score = transferPoints(secondPlayerPoint) + "-Love";
        }

        if (firstPlayerPoint > secondPlayerPoint && firstPlayerPoint < 4) {
            score = getPlayerScores();
        } else if (secondPlayerPoint > firstPlayerPoint && secondPlayerPoint < 4) {
            score = getPlayerScores();
        }

        if (firstPlayerPoint > secondPlayerPoint && secondPlayerPoint >= 3) {
            score = "Advantage player1";
        } else if (secondPlayerPoint > firstPlayerPoint && firstPlayerPoint >= 3) {
            score = "Advantage player2";
        }

        if (firstPlayerPoint >= 4 && secondPlayerPoint >= 0 && getDifference() >= 2) {
            score = "Win for player1";
        } else if (secondPlayerPoint >= 4 && firstPlayerPoint >= 0 && getDifference() <= -2) {
            score = "Win for player2";
        }
        return score;
    }

    private boolean isDeuce() {
        return firstPlayerPoint >= 3 && secondPlayerPoint >= 3 && isPlayersTied();
    }

    private String getTiedScore() {
        String score = switch (firstPlayerPoint) {
            case 0 -> "Love-All";
            case 1 -> "Fifteen-All";
            case 2 -> "Thirty-All";
            default -> "Deuce";
        };
        return score;
    }

    private boolean isPlayersTied() {
        return firstPlayerPoint == secondPlayerPoint;
    }

    private String getPlayerScores() {
        return transferPoints(firstPlayerPoint) + "-" + transferPoints(secondPlayerPoint);
    }

    private String transferPoints(int points) {
        String result = switch (points) {
            case 0 -> "Love";
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            case 3 -> "Forty";
            default -> "ERROR";
        };
        return result;
    }

    private int getDifference() {
        return firstPlayerPoint - secondPlayerPoint;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            firstPlayerPoint++;
        else
            secondPlayerPoint++;
    }
}
