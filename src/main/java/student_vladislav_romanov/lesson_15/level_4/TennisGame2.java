package student_vladislav_romanov.lesson_15.level_4;

import java.util.Objects;

class TennisGame2 implements TennisGame {
    private int player1points = 0;
    private int player2points = 0;

    private String player1Name;
    private String player2Name;

    public TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String score = "";
        if (player1points == player2points && player1points < 4) {
            score = getPositionNameByScore(player1points) + "-All";
        }
        if (player1points == player2points && player1points >=3)
            score = "Deuce";

        if ((player1points > 0 && player2points == 0) || (player2points > 0 && player1points == 0)) {
            score = getPositionNameByScore(player1points) + "-" + getPositionNameByScore(player2points);
        }

        if ((player1points > player2points && player1points < 4) || (player2points > player1points && player2points < 4)) {
            score = getPositionNameByScore(player1points) + "-" + getPositionNameByScore(player2points);
        }

        if (player1points > player2points && player2points >= 3) {
            score = "Advantage player1";
        }

        if (player2points > player1points && player1points >= 3) {
            score = "Advantage player2";
        }

        if (player1points >= 4 && player2points >= 0 && (player1points - player2points) >= 2) {
            score = "Win for player1";
        }
        if (player2points >= 4 && player1points >= 0 && (player2points - player1points) >= 2) {
            score = "Win for player2";
        }
        return score;
    }

    public void scoreUpdateForPlayer1() {
        player1points++;
    }

    public void scoreUpdateForPlayer2() {
        player2points++;
    }

    public void wonPoint(String player) {
        if (Objects.equals(player, "player1"))
            scoreUpdateForPlayer1();
        else
            scoreUpdateForPlayer2();
    }

    public String getPositionNameByScore(int score) {
        String positionName;
        switch (score) {
            case 1 -> positionName = "Fifteen";
            case 2 -> positionName = "Thirty";
            case 3 -> positionName = "Forty";
            default -> positionName = "Love";
        }
        return positionName;
    }
}
