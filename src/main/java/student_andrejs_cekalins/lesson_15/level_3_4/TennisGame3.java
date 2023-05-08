package student_andrejs_cekalins.lesson_15.level_3_4;

import java.util.Objects;

public class TennisGame3 implements TennisGame {
    private int firstPlayerScore;
    private int secondPlayerScore;
    private String firstPlayerName;
    private String secondPlayerName;
    String score;

    public TennisGame3(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    @Override
    public String getScore() {
        return scoreNotDeuceOrWin() ? scoreList() : scoreThreeAndDeuce() ? "Deuce" : scoreAdvantageOrWin();
    }

    @Override
    public void wonPoint(String playerName) {
        switch (playerName) {
            case "player1" -> this.firstPlayerScore += 1;
            default -> this.secondPlayerScore += 1;
        }
    }

    private boolean scoreNotDeuceOrWin() {
        return firstPlayerScore < 4 &&
                secondPlayerScore < 4 &&
                !(firstPlayerScore + secondPlayerScore == 6);
    }

    private String scoreList() {
        String[] player = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
        score = player[firstPlayerScore];
        return firstPlayerScore == secondPlayerScore ? score + "-All" : score + "-" + player[secondPlayerScore];
    }

    private boolean scoreThreeAndDeuce() {
        return firstPlayerScore == secondPlayerScore;
    }

    private String getPlayerScore() {
        return firstPlayerScore > secondPlayerScore ? firstPlayerName : secondPlayerName;
    }

    private String scoreAdvantageOrWin() {
        return switch ((firstPlayerScore - secondPlayerScore) *
                (firstPlayerScore - secondPlayerScore)) {
            case 1 -> "Advantage " + getPlayerScore();
            default -> "Win for " + getPlayerScore();
        };
    }
}

