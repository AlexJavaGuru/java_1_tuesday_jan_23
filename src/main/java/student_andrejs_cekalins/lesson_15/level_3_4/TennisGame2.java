package student_andrejs_cekalins.lesson_15.level_3_4;


public class TennisGame2 implements TennisGame {
    public int firstPlayerScore = 0;
    public int secondPlayerScore = 0;

    public String firstPlayerResult = "";
    public String secondPlayerResult = "";

    public TennisGame2(String firstPlayerName, String secondPlayerName) {
    }

    @Override
    public String getScore() {
        String score = "";
        score = firstPlayerScoreEqualsSecondPlayerScoreAndLessThanFour(score);
        score = scoreIsDeuce(score);
        score = firstPlayerScoreMoreThanZeroSecondPlayerScoreEqualZero(score);
        score = secondPlayerScoreMoreThanZeroAndFirstPlayerScoreEqualZero(score);
        score = firstPlayerScoreMoreThanSecondPlayerScoreAndLessThanFour(score);
        score = secondPlayerScoreMoreThanfirstPlayerScoreAndLessThanFour(score);
        if (firstPlayerScore > secondPlayerScore && secondPlayerScore >= 3) score = "Advantage player1";
        if (secondPlayerScore > firstPlayerScore && firstPlayerScore >= 3) score = "Advantage player2";
        if (firstPlayerScore >= 4 && secondPlayerScore >= 0 && (firstPlayerScore - secondPlayerScore) >= 2)
            score = "Win for player1";
        if (secondPlayerScore >= 4 && firstPlayerScore >= 0 && (secondPlayerScore - firstPlayerScore) >= 2)
            score = "Win for player2";
        return score;
    }

    private String secondPlayerScoreMoreThanfirstPlayerScoreAndLessThanFour(String score) {
        if (secondPlayerScore > firstPlayerScore && secondPlayerScore < 4) {
            switch (secondPlayerScore) {
                case 2 -> secondPlayerResult = "Thirty";
                case 3 -> secondPlayerResult = "Forty";
            }
            switch (firstPlayerScore) {
                case 1 -> firstPlayerResult = "Fifteen";
                case 2 -> firstPlayerResult = "Thirty";
            }
            score = firstPlayerResult + "-" + secondPlayerResult;
        }
        return score;
    }

    private String firstPlayerScoreMoreThanSecondPlayerScoreAndLessThanFour(String score) {
        if (firstPlayerScore > secondPlayerScore && firstPlayerScore < 4) {
            switch (firstPlayerScore) {
                case 2 -> firstPlayerResult = "Thirty";
                case 3 -> firstPlayerResult = "Forty";
            }
            switch (secondPlayerScore) {
                case 1 -> secondPlayerResult = "Fifteen";
                case 2 -> secondPlayerResult = "Thirty";
            }
            score = firstPlayerResult + "-" + secondPlayerResult;
        }
        return score;
    }

    private String secondPlayerScoreMoreThanZeroAndFirstPlayerScoreEqualZero(String score) {
        if (secondPlayerScore > 0 && firstPlayerScore == 0) {
            switch (secondPlayerScore) {
                case 1 -> secondPlayerResult = "Fifteen";
                case 2 -> secondPlayerResult = "Thirty";
                case 3 -> secondPlayerResult = "Forty";
            }
            firstPlayerResult = "Love";
            score = firstPlayerResult + "-" + secondPlayerResult;
        }
        return score;
    }

    private String scoreIsDeuce(String score) {
        if (firstPlayerScore == secondPlayerScore && firstPlayerScore >= 3)
            score = "Deuce";
        return score;
    }

    private String firstPlayerScoreMoreThanZeroSecondPlayerScoreEqualZero(String score) {
        if (firstPlayerScore > 0 && secondPlayerScore == 0) {
            switch (firstPlayerScore) {
                case 1 -> firstPlayerResult = "Fifteen";
                case 2 -> firstPlayerResult = "Thirty";
                case 3 -> firstPlayerResult = "Forty";
            }
            secondPlayerResult = "Love";
            score = firstPlayerResult + "-" + secondPlayerResult;
        }
        return score;
    }

    private String firstPlayerScoreEqualsSecondPlayerScoreAndLessThanFour(String score) {
        if (firstPlayerScore == secondPlayerScore && firstPlayerScore < 4) {
            score = switch (firstPlayerScore) {
                case 0 -> "Love";
                case 1 -> "Fifteen";
                case 2 -> "Thirty";
                default -> "Deuce";
            };
            score += "-All";
        }
        return score;
    }

    public void SetFirstPlayerScore(int number) {
        for (int i = 0; i < number; i++) {
            firstPlayerScore();
        }

    }

    public void SetSecondPlayerScore(int number) {
        for (int i = 0; i < number; i++) {
            SecondPlayerScore();
        }
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }

    public void SecondPlayerScore() {
        secondPlayerScore++;
    }

    @Override
    public void wonPoint(String player) {
        switch (player) {
            case "player1" -> firstPlayerScore();
            default -> SecondPlayerScore();
        }
    }
}
