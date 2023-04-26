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

    private String firstPlayerResult = "";
    private String secondPlayerResult = "";



    public String getScore() {
        String score = "";
        if (firstPlayerPoint == secondPlayerPoint && firstPlayerPoint < 4) {
            score = switch (firstPlayerPoint) {
                case 0 -> "Love";
                case 1 -> "Fifteen";
                default -> "Thirty";
            };
            score += "-All";
        }
        if (firstPlayerPoint == secondPlayerPoint && firstPlayerPoint >= 3) {
            score = "Deuce";
        }

        if (firstPlayerPoint > 0 && secondPlayerPoint == 0) {
            firstPlayerResult = switch (firstPlayerPoint) {
                case 1 -> "Fifteen";
                case 2 -> "Thirty";
                default -> "Forty";
            };
            secondPlayerResult = "Love";
            score = firstPlayerResult + "-" + secondPlayerResult;
        }
        if (secondPlayerPoint > 0 && firstPlayerPoint == 0) {
            secondPlayerResult = switch (secondPlayerPoint) {
                case 1 -> "Fifteen";
                case 2 -> "Thirty";
                default -> "Forty";
            };
            firstPlayerResult = "Love";
            score = firstPlayerResult + "-" + secondPlayerResult;
        }

        if (firstPlayerPoint > secondPlayerPoint && firstPlayerPoint < 4) {
            switch (firstPlayerPoint) {
                case 2 -> firstPlayerResult = "Thirty";
                case 3 -> firstPlayerResult = "Forty";
            }

            switch (secondPlayerPoint) {
                case 1 -> secondPlayerResult = "Fifteen";
                case 2 -> secondPlayerResult = "Thirty";
            }

            score = firstPlayerResult + "-" + secondPlayerResult;
        }
        if (secondPlayerPoint > firstPlayerPoint && secondPlayerPoint < 4) {
            switch (secondPlayerPoint) {
                case 2 -> secondPlayerResult = "Thirty";
                case 3 -> secondPlayerResult = "Forty";
            }

            switch (firstPlayerPoint) {
                case 1 -> firstPlayerResult = "Fifteen";
                case 2 -> firstPlayerResult = "Thirty";
            }

            score = firstPlayerResult + "-" + secondPlayerResult;
        }

        if (firstPlayerPoint > secondPlayerPoint && secondPlayerPoint >= 3) {
            score = "Advantage player1";
        }
        if (secondPlayerPoint > firstPlayerPoint && firstPlayerPoint >= 3) {
            score = "Advantage player2";
        }

        if (firstPlayerPoint >= 4 && secondPlayerPoint >= 0 && getDifference() >= 2) {
            score = "Win for player1";
        }
        if (secondPlayerPoint >= 4 && firstPlayerPoint >= 0 && getDifference() <= -2) {
            score = "Win for player2";
        }
        return score;
    }

    private void transferPoints(Player player) {
        player.setResult( switch (player.getPoints()) {
            case 1 -> "Fifteen";
            case 2 -> "Thirty";
            default -> "Forty";
        });
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
